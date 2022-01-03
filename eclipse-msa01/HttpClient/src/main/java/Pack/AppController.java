package Pack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController  //레스트 반응을 콘트럴 해주는 애
@RequestMapping("/app") //app라고 붙어잇으면 여기 컨트롤러로 들어옴
public class AppController {
	@GetMapping("/{appNum}") //app 뒤 인수 숫자는 appnum에 넣어주세요
	public String f1(@PathVariable String appNum) {
		System.out.println("appNum : " + appNum);
		//원래는 main에서 bean으로 하면 된다. 
		RestTemplate restTemplate = new RestTemplate();
		
		String result = restTemplate.getForObject(
			"http://localhost:8086/bpp/3000", // 8086에서 bpp가 있으면 3000을 던져라
			String.class); //bpp에 3000던지면 리턴되어서 3000 을 받아와서 result에 저장된다.
		
		return "AppCont : " + appNum + "<br/>" + result;
	}
}
