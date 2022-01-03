package collectionlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<>();
		
//		list.add("java");
//		
//		list.add(2,"javascript");
//		
//		list.add("java");
//		
//		System.out.println("size:" + list.size());
		
		//객체 삭제
		
		list.remove(2); //인덱스로 삭제
		System.out.println(list);
		list.remove("python");
		System.out.println(list); // 객체로 삭제
		
		//루프 : list, set에서는 Iterator 사용
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			String item = iter.next(); //다음 요소 가져오기
			System.out.println(item);
		}
		
		//비워봅시다
		list.clear();
		System.out.println(list);
		
		

	}

}
