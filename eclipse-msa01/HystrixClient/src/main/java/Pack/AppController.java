package Pack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController  //레스트 반응을 콘트럴 해주는 애
@RequestMapping("/app") //app라고 붙어잇으면 여기 컨트롤러로 들어옴
public class AppController {
	@GetMapping("/{appNum}") //app 뒤 인수 숫자는 appnum에 넣어주세요
	@HystrixCommand(fallbackMethod = "tiger") //문제가 발생하면 내가 만든 함수로 가세요 폴백~!
	
	
	public String f1(@PathVariable String appNum) {
		System.out.println("appNum : " + appNum);
		//원래는 main에서 bean으로 하면 된다. 
		RestTemplate restTemplate = new RestTemplate();
		
		String result = restTemplate.getForObject(
			"http://localhost:8086/bpp/3000", // 8086에서 bpp가 있으면 3000을 던져라
			String.class); //bpp에 3000던지면 리턴되어서 3000 을 받아와서 result에 저장된다.
		
		// 하지만 8086이 문제가 있기 때문에 값을 받아오지 못한다. 
		
		
		return "AppCont : " + appNum + "<br/>" + result;
	}
	
	public String tiger(String s){
		return "Hystrix command function : " + s;
		
	}
}
