package Pack01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 컨트롤러 역할을 할 것이다. 
// 컨트롤러를 들어왔다가 index.jsp로 간다.

@Controller
public class Tiger {
	
	@RequestMapping("/") // 인덱스가 나오기 전에 여기로 무조건 들어옴
	public String f0() {
		System.out.println("곧 index.jsp 오픈됨");
		
		return "index";
		
	}
	

	@RequestMapping("/t1") 
	public String f1() {
		System.out.println("TigerView");
		
		return "TigerView";
		
	}

}
