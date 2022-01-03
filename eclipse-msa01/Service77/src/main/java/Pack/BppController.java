package Pack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


// 스스로 생존하는 bpp 이다. 
@RestController  //레스트 반응을 콘트럴 해주는 애
@RequestMapping("/bpp") //bpp라고 붙어잇으면 여기 컨트롤러로 들어옴
public class BppController {
	@GetMapping("/{bppNum}") //bpp 뒤 인수 숫자는 bppnum에 넣어주세요
	public String f1(@PathVariable String bppNum) {
		System.out.println("bppNum : " + bppNum);	
		return "BppCont : " + bppNum;
	}
}
