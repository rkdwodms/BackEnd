package Pack01;

import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Tiger {
	
	@RequestMapping("/t1") //�Ʒ� �Լ� �̸��� t1�̾�
	String func01(Model model) {
		System.out.println("��Ʈ�ѷ� ����");
		
		
		//TigerView.jsp�� ������~ ��� ��
		return "TigerView"; 
		//��Ʈ�ѷ� �̸��� Tiger�̸� ���� ���� �� �̸����� �����ؾ��� 
	}


}


