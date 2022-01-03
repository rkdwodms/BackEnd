package Pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


// app/1000
@RestController
@RequestMapping("/app")
// 8085의 요청 준비 끝 
public class AppController {
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{appNum}") // app뒤에 있는 1000을 받을 변수명을 적어주면 된다. 
	@HystrixCommand(fallbackMethod = "tiger") //문제가 생기면 내가 만들어 놓은 함수로 가세요! fallback함수
	
	public String f1(@PathVariable String appNum) {
		
		String str = restTemplate.getForObject(
//				"http://localhost:8086/bpp/3000", // 
				"http://Service02/bpp/3000",
				String.class); // 특정 사이트에서 데이터 얻어옴
		
		// 문자열을 리턴 받음 
		return "AppController : " + appNum + 
				"<br/>" + str;
	}
	
	public String tiger(String s) {
		
		return s + " 저쪽에서 응답안함!";
		
		
	}

}
