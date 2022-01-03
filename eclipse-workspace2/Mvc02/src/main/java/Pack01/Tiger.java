package Pack01;

import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Tiger {
	
	@RequestMapping("/t1") //아래 함수 이름은 t1이야
	String func01(Model model) {
		System.out.println("컨트롤러 들어옴");
		
		
		//TigerView.jsp로 가세요~ 라는 말
		return "TigerView"; 
		//컨트롤러 이름이 Tiger이면 위과 같은 뷰 이름으로 설정해야함 
	}


}


