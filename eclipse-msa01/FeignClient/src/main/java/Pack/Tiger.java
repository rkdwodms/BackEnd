package Pack;
// 여기는 feign 클라이언트! 예제다!!
// 얘는 resttemplate를 쉽게 쓰기 위한 것
// 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Tiger {
	@RequestMapping("/")
	public String f0() { 
		System.out.println("곧 index.jsp 실행");
		return "index";
	}
	
	// 추가 컨트롤러
		@RequestMapping("/t1")
		public String f1() {
			System.out.println("곧 TigerView.jsp 실행");
			return "TigerView";
			// return "redirect:/";
		}

}
