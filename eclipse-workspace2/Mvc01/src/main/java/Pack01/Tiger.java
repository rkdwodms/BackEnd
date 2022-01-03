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
	
	@RequestMapping("/t1") //�Ʒ� �Լ� �̸��� t1�̾�
	String func01() {
		System.out.println("��Ʈ�ѷ� ����1");
		
		
		//TigerView.jsp�� ������~ ��� ��
		return "TigerView"; 
		//��Ʈ�ѷ� �̸��� Tiger�̸� ���� ���� �� �̸����� �����ؾ��� 
	}
	@ResponseBody //return���� �׳� �ٷ� ��� ����� �̾ƹ���.
	@RequestMapping("/t2") //�Ʒ� �Լ� �̸��� t2�̾�
	String func02() {
		System.out.println("��Ʈ�ѷ� ����2");
		
		
		//TigerView.jsp�� ������~ ��� ��
		return "Tiger View "; 
		//��Ʈ�ѷ� �̸��� Tiger�̸� ���� ���� �� �̸����� �����ؾ��� 
	}
	
	@RequestMapping("/t3") //�Ʒ� �Լ� �̸��� t2�̾�
	String func03(
			@RequestParam(value="sendName") String recvName
			) {
		System.out.println(recvName);
		//TigerView.jsp�� ������~ ��� ��
		return "TigerView"; 
		//��Ʈ�ѷ� �̸��� Tiger�̸� ���� ���� �� �̸����� �����ؾ��� 
	}
	
	@RequestMapping("/t4") //�Ʒ� �Լ� �̸��� t2�̾�
	String func04(
			@RequestParam(value="name") String name,
			@RequestParam(value="age") String age
			) {
		System.out.println(name + " " + age);
		//TigerView.jsp�� ������~ ��� ��
		return "TigerView"; 
		//��Ʈ�ѷ� �̸��� Tiger�̸� ���� ���� �� �̸����� �����ؾ��� 
	}
	
	@RequestMapping("/t5") //�Ʒ� �Լ� �̸��� t2�̾�
	String func05(
			HttpServletRequest rs) 
	{
		String name = rs.getParameter("name");
		String age = rs. getParameter("age");
		System.out.println(name + " " + age);
		//TigerView.jsp�� ������~ ��� ��
		return "TigerView"; 
		//��Ʈ�ѷ� �̸��� Tiger�̸� ���� ���� �� �̸����� �����ؾ��� 
	}

	@RequestMapping("/t6") //�Ʒ� �Լ� �̸��� t2�̾�
	String func06(Model model) { 
		model.addAttribute("nickName","tiger");
		model.addAttribute("age", 3000);
		return "TigerView"; 
		//��Ʈ�ѷ� �̸��� Tiger�̸� ���� ���� �� �̸����� �����ؾ��� 
	}
	
	@RequestMapping("/t7") //�Ʒ� �Լ� �̸��� t2�̾�
	String func07(Model model, 
			@RequestParam(value="name") String name,
			@RequestParam(value="age") String age
			) { 
		System.out.println(name + " " + age);
		model.addAttribute("result01",name + " add");
		model.addAttribute("result02", age + " sub");
		return "TigerView"; 
		//��Ʈ�ѷ� �̸��� Tiger�̸� ���� ���� �� �̸����� �����ؾ��� 
	}

	
	@RequestMapping("/t8") //�Ʒ� �Լ� �̸��� t2�̾�
	ModelAndView func08() { 
		ModelAndView mv = new ModelAndView("TigerView");
//		ModelAndView mv2 = new ModelAndView("LionView");
//		ModelAndView mv3 = new ModelAndView("DogView");
		
		mv.addObject("name", "Eagle");
		mv.addObject("age", 6000);
		
		return mv; 
		//��Ʈ�ѷ� �̸��� Tiger�̸� ���� ���� �� �̸����� �����ؾ��� 
	}
	
	@RequestMapping("/t9") //�Ʒ� �Լ� �̸��� t2�̾�
	ModelAndView func09() { 
		ModelAndView mv = new ModelAndView(
				false ? "TigerView" : "LionView");
		
		mv.addObject("name", "Eagle");
		mv.addObject("age", 6000);
		
		return mv; 
		//��Ʈ�ѷ� �̸��� Tiger�̸� ���� ���� �� �̸����� �����ؾ��� 
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
	String func12(Model model)  //getAttribute�� �޴´�. 
	{
		System.out.println("test t12");
		
		
		//�����Ͻ� ����
		//1. ����
		
		int num = 10;
		model.addAttribute("num",num);
		
		//2. ���ڿ�
		
		String str = "���ڿ� ȣ����";
		model.addAttribute("str", str);
		
		//3. �迭() 
		
		int[] ar = {20,30,40};
		model.addAttribute("ar", ar); // Ű�� ar�̶�� �ϰ�  ar�� ������. 
		
//		//4. ��ü ����( new Tiger() { name , age, salary }
		
		Person person = new Person("�ҳ���", 123);
		model.addAttribute("person",person);
	
		//5. �÷�������( LinkedList) : Integer
		
		LinkedList<Integer> list01 = 
				new LinkedList<Integer>();
		list01.add(50);
		list01.add(60);
		list01.add(70);
		
		model.addAttribute("list01",list01);
		
		
		// 6. �÷��� ����(LinkedList) : String
		LinkedList<String> list02 = new LinkedList<String>();
		list02.add("��");
		list02.add("��");
		list02.add("��");
		model.addAttribute("list02", list02);

		// 7. �÷��� ����(LinkedList) : ��ü
		LinkedList<Person> list03 = new LinkedList<Person>();
		list03.add(new Person("������1",80));
		list03.add(new Person("������2",90));
		list03.add(new Person("������3",10));

		model.addAttribute("list03", list03);

//		//6. �÷�������( LinkedList) : String
//		LinkedList<String> list02 = 
//				new LinkedList<String>();
//		list02.add("��1");
//		list02.add("��2");
//		list02.add("��3");
//		
//		model.addAttribute("list02",list02);
//		
//		
//		//7. �÷�������( LinkedList) : ��ü
//		
//		LinkedList<Person> list03 = 
//				new LinkedList<Person>();
//		list03.add(new Person("������1", 80));
//		list03.add(new Person("������2", 90));
//		list03.add(new Person("������3", 110));
//		
//		model.addAttribute("list03",list03);
//		
		return "TigerView"; 
		
	}
}

// ��ü 	!=  	��ü -> �信�� ���� ���� 
// index >> controller >> view
// Ŭ�� >> ���� 	|	>> ����
//   ���Ÿ� ����	|	��������