package collectionlist;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//벡터의 생성
		Vector<Integer> v = new Vector<Integer>();
		//버퍼 기반
		System.out.printf("size=%d, capacity=%d %n",v.size(),v.size(),
				v.capacity());
		
		//1부터 10까지 값을 담는다.
		for(int i=1; i<10; i++) {
			//데이터  추가
			v.addElement(i);
		}
		
		System.out.printf("size=%d, capacity=%d %n",v.size(),v.size(),
				v.capacity());
		v.addElement(11);
		System.out.printf("size=%d, capacity=%d %n",v.size(),v.size(),
				v.capacity());
		
		System.out.println("v:" + v);
		
		
//		v.addElement(v);
		
		//요소의 삽입
		v.insertElementAt(5, 7);
		System.out.println("v: "+v);
		
		// 객체 조회: 특정 객체의 인덱스 반환
		// 찾는 객체가 없으면 -1
		
		System.out.println("indexof(7):"+v.indexOf(7)); 
		System.out.println("contains(10):" + v.contains(10));
		
		//객체삭제
		v.removeElement(11);
		System.out.println("v"+v);
		
		// 루프
		for (int i = 0; i < v.size(); i++) {
			int item = (int)v.elementAt(i);
			System.out.println(item);
		}
		
		//enhanced for
		for(int item: v) {
			System.out.println(v);
		}
	}

}
