package Pack01;

import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Tiger {
	
	@RequestMapping("/t1") //아래 함수 이름은 t1이야
	String func01() {
		System.out.println("컨트롤러 들어옴1");
		
		
		//TigerView.jsp로 가세요~ 라는 말
		return "TigerView"; 
		//컨트롤러 이름이 Tiger이면 위과 같은 뷰 이름으로 설정해야함 
	}
	@ResponseBody //return값이 그냥 바로 출력 결과로 뽑아버림.
	@RequestMapping("/t2") //아래 함수 이름은 t2이야
	String func02() {
		System.out.println("컨트롤러 들어옴2");
		
		
		//TigerView.jsp로 가세요~ 라는 말
		return "Tiger View "; 
		//컨트롤러 이름이 Tiger이면 위과 같은 뷰 이름으로 설정해야함 
	}
	
	@RequestMapping("/t3") //아래 함수 이름은 t2이야
	String func03(
			@RequestParam(value="sendName") String recvName
			) {
		System.out.println(recvName);
		//TigerView.jsp로 가세요~ 라는 말
		return "TigerView"; 
		//컨트롤러 이름이 Tiger이면 위과 같은 뷰 이름으로 설정해야함 
	}
	
	@RequestMapping("/t4") //아래 함수 이름은 t2이야
	String func04(
			@RequestParam(value="name") String name,
			@RequestParam(value="age") String age
			) {
		System.out.println(name + " " + age);
		//TigerView.jsp로 가세요~ 라는 말
		return "TigerView"; 
		//컨트롤러 이름이 Tiger이면 위과 같은 뷰 이름으로 설정해야함 
	}
	
	@RequestMapping("/t5") //아래 함수 이름은 t2이야
	String func05(
			HttpServletRequest rs) 
	{
		String name = rs.getParameter("name");
		String age = rs. getParameter("age");
		System.out.println(name + " " + age);
		//TigerView.jsp로 가세요~ 라는 말
		return "TigerView"; 
		//컨트롤러 이름이 Tiger이면 위과 같은 뷰 이름으로 설정해야함 
	}

	@RequestMapping("/t6") //아래 함수 이름은 t2이야
	String func06(Model model) { 
		model.addAttribute("nickName","tiger");
		model.addAttribute("age", 3000);
		return "TigerView"; 
		//컨트롤러 이름이 Tiger이면 위과 같은 뷰 이름으로 설정해야함 
	}
	
	@RequestMapping("/t7") //아래 함수 이름은 t2이야
	String func07(Model model, 
			@RequestParam(value="name") String name,
			@RequestParam(value="age") String age
			) { 
		System.out.println(name + " " + age);
		model.addAttribute("result01",name + " add");
		model.addAttribute("result02", age + " sub");
		return "TigerView"; 
		//컨트롤러 이름이 Tiger이면 위과 같은 뷰 이름으로 설정해야함 
	}

	
	@RequestMapping("/t8") //아래 함수 이름은 t2이야
	ModelAndView func08() { 
		ModelAndView mv = new ModelAndView("TigerView");
//		ModelAndView mv2 = new ModelAndView("LionView");
//		ModelAndView mv3 = new ModelAndView("DogView");
		
		mv.addObject("name", "Eagle");
		mv.addObject("age", 6000);
		
		return mv; 
		//컨트롤러 이름이 Tiger이면 위과 같은 뷰 이름으로 설정해야함 
	}
	
	@RequestMapping("/t9") //아래 함수 이름은 t2이야
	ModelAndView func09() { 
		ModelAndView mv = new ModelAndView(
				false ? "TigerView" : "LionView");
		
		mv.addObject("name", "Eagle");
		mv.addObject("age", 6000);
		
		return mv; 
		//컨트롤러 이름이 Tiger이면 위과 같은 뷰 이름으로 설정해야함 
	}
	
	@RequestMapping("/t11") 
	String func11(Person person) 
	{
		System.out.println("test t11");
		System.out.println(person.getId());
		System.out.println(person.getPass());
		
		return "TigerView"; 
		
	}
	
	void f13() {
		
	}
	@RequestMapping("/t12") 
	String func12(Model model)  //getAttribute로 받는다. 
	{
		System.out.println("test t12");
		
		
		//비지니스 로직
		//1. 정수
		
		int num = 10;
		model.addAttribute("num",num);
		
		//2. 문자열
		
		String str = "문자열 호랑이";
		model.addAttribute("str", str);
		
		//3. 배열() 
		
		int[] ar = {20,30,40};
		model.addAttribute("ar", ar); // 키를 ar이라고 하고  ar을 던진다. 
		
//		//4. 객체 전송( new Tiger() { name , age, salary }
		
		Person person = new Person("소나무", 123);
		model.addAttribute("person",person);
	
		//5. 컬렉션전송( LinkedList) : Integer
		
		LinkedList<Integer> list01 = 
				new LinkedList<Integer>();
		list01.add(50);
		list01.add(60);
		list01.add(70);
		
		model.addAttribute("list01",list01);
		
		
		// 6. 컬렉션 전송(LinkedList) : String
		LinkedList<String> list02 = new LinkedList<String>();
		list02.add("공");
		list02.add("일");
		list02.add("삼");
		model.addAttribute("list02", list02);

		// 7. 컬렉션 전송(LinkedList) : 객체
		LinkedList<Person> list03 = new LinkedList<Person>();
		list03.add(new Person("독수리1",80));
		list03.add(new Person("독수리2",90));
		list03.add(new Person("독수리3",10));

		model.addAttribute("list03", list03);

//		//6. 컬렉션전송( LinkedList) : String
//		LinkedList<String> list02 = 
//				new LinkedList<String>();
//		list02.add("콩1");
//		list02.add("콩2");
//		list02.add("콩3");
//		
//		model.addAttribute("list02",list02);
//		
//		
//		//7. 컬렉션전송( LinkedList) : 객체
//		
//		LinkedList<Person> list03 = 
//				new LinkedList<Person>();
//		list03.add(new Person("독수리1", 80));
//		list03.add(new Person("독수리2", 90));
//		list03.add(new Person("독수리3", 110));
//		
//		model.addAttribute("list03",list03);
//		
		return "TigerView"; 
		
	}
}

// 객체 	!=  	객체 -> 뷰에서 공유 가능 
// index >> controller >> view
// 클라 >> 서버 	|	>> 서버
//   원거리 전송	|	내부전송