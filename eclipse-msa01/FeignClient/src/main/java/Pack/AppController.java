package Pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import feign.hystrix.FallbackFactory;

@RestController  //레스트 반응을 콘트럴 해주는 애
@RequestMapping("/app") //app라고 붙어잇으면 여기 컨트롤러로 들어옴
public class AppController {

	@Autowired //bean에 객체가 있다면 가져와주세요
	RestTemplate restTemplate;

	@GetMapping("/{appNum}") //app 뒤 인수 숫자는 appnum에 넣어주세요
	@HystrixCommand(fallbackMethod = "tiger") //문제가 발생하면 내가 만든 함수로 가세요 폴백~!

	public String f1(@PathVariable String appNum) {
		System.out.println("appNum : " + appNum);

		String result = restTemplate.getForObject("http://Service02/bpp/3000", String.class); 
		return "AppCont : " + appNum + "<br/>" + result;
	}
	public String tiger(String s){
		return "Hystrix command function : " + s;

	}
}

// "http://Service02/bpp/3000"
// 페인이 관리한다.
//getobject에 넣을 것을 이렇게 작성하면 알아서 넣어줌 



//@FeignClient(name = "monkey", url="http://localhost:8086") 
@FeignClient(name = "Service02", fallbackFactory = Lion.class) //라이언 클래스에 가면 폴백함수 있다! 
interface TestFeign{ 
	@RequestMapping("/bpp/{num}")
	String myfunc(@PathVariable String num);
	
	
	//객체를 상속받아 구현을 받아양한다.! 무조건! 
		//페인은 지가 알아서 상속을 받아 만든다??? 아래와 같이 만든다. 
		// 객체같은 거 생성하지 말고 포트 등 만 알려줘~~~ 그럼 알아서 알려주께!
//		class MyFeign implememts TestFeign{
//			restTemplate.getForObject(url + address);
//		}
		
}

@Component
class Lion implements FallbackFactory<TestFeign>{
	
	@Override
	public TestFeign create(Throwable cause) {
		System.out.println("TestFeign Create");
		return (arg)-> "Hystrix fallback : " + arg; //반드시 람다 함수를 넣어줘여 한다. 
	}
	
}

@RestController  
@RequestMapping("/app2") 
class AppController2 {
	@Autowired
	TestFeign testFeign; //객체 선언 
	

	@GetMapping("/{app2Num}") //app 뒤 인수 숫자는 appnum에 넣어주세요
//	@HystrixCommand(fallbackMethod = "Lion") //문제가 발생하면 내가 만든 함수로 가세요 폴백~!

	public String f2(@PathVariable String app2Num) {
		System.out.println("app2Num : " + app2Num);
		String result = testFeign.myfunc("3000");

		return "App2 :" + app2Num + "<br/>" + result;
	}
	
}

