package Pack;
//  Hystrix 예제다!!
// 서킷 브레이커 걸기 위해서 dependency 필요! 넷플릭스 꺼

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
