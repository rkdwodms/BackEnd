package Pack;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Data;

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
		
		@Autowired //자동으로 아래의 생성자가 만들어지면서 인수전달이 되는 코드가 만들어진다. 
		RabbitTemplate rabbitTemplate;
		//RabbitTemplate rabbitTemplate = new RabbitTemplate();
		
		static int count = 0;
		@RequestMapping("/t2")
		public String f2() {
			System.out.println("test");
			
			String sendData = "호랑이" + count++;
			rabbitTemplate.convertAndSend(
					"Exchange", // 보낼 문서의 이름??
					"apple1", //보내는 사람의 키 (라우팅 키)
					sendData	// 보내고 싶은 메세지 				
					);
			
			return "redirect:/"; //버튼을 클릭해도 인덱스에 계속 남아있다. 
		}
		
		@RequestMapping("/t3")
		public String f3() { // 객체를 보낼 것이다. 
			Person person = new Person("독수리",100);
			System.out.println(person.toString());
			
			rabbitTemplate.convertAndSend(
					"Exchange", // 보낼 문서의 이름??
					"apple2", //보내는 사람의 키 (라우팅 키)
					person	// 보내고 싶은 메세지 				
					);
			
			return "redirect:/";
		}

@RequestMapping("/t4")
public String f4() {
	
	String message = "Hello World";
	//exchage생략했음 
	rabbitTemplate.convertAndSend("hello", message);
	System.out.println(message);
	return "redirect:/";

}

}

@Data
class Person{
	final String name;
	final int age;
}
