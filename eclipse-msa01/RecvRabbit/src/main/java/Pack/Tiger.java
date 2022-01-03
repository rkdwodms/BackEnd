package Pack;

import org.springframework.stereotype.Component;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;

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

}

@Component //내가 new를 이용하지 않아도 아래 클래스의 객체를 만들어버림!
class RecvModule{
	//rabbitmq와 연동이 된다는 설정
	@RabbitListener(
			bindings = @QueueBinding(
					exchange = @Exchange(
							name="Exchange", 
							type=ExchangeTypes.TOPIC),
					value = @Queue(name="banana1"),		// 받는놈의 키
					key = "apple1" ))					// 주는놈의 키



	public void receiver(String msg) {
		//던진 놈 것을 이쪽으로 받을 것이다. 

		System.out.println(msg); //호랑이 글자 출력될 것이다. 
	}

}

@Component //내가 new를 이용하지 않아도 아래 클래스의 객체를 만들어버림!
class objectModule{
	//rabbitmq와 연동이 된다는 설정
	@RabbitListener(
			bindings = @QueueBinding(
					exchange = @Exchange(
							name="Exchange", 
							type=ExchangeTypes.TOPIC),
					value = @Queue(name="banana2"),		// 받는놈의 키
					key = "apple2" ))					// 주는놈의 키



	public void receiver(Person person) {
		//던진 놈 것을 이쪽으로 받을 것이다. 

		System.out.println(person.toString()); //호랑이 글자 출력될 것이다. 
	}
	
}

@Data
class Person{
	String name;
	int age;
}


@Component
class tutorial01Module{
	@RabbitListener(queues = "hello")
	public void receiver(String message) {
		System.out.println(message.toString());
	}
}