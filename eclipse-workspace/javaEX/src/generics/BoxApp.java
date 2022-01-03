package generics;

public class BoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StringBox strBox = new StringBox();
//		strBox.setContent("String Box"); //오로지 스트링만 담길 수 있음
//		
//		IntBox intBox = new IntBox();
//		intBox.setContent(2021);
//		
		
		ObjectBox strBox = new ObjectBox();
		strBox.setContent("String Box");
		
		ObjectBox intBox = new ObjectBox();
		intBox.setContent(2021);
		
		//내용을 꺼내 봅시다.
		
		String s = (String)strBox.getContent();
		int i = (int)intBox.getContent();
		
		//다운캐스팅의 번거로움, 위험성 
		
		// 설계시에 내부데이터 타입을 미정 상태로 둔다.
		// 인스턴스화 할 때 내부 타입을 결정한다. 
		
		
		GenericBox<String> gsb = 
				new GenericBox<>();
		gsb.setContent("Generic Box");
		
		// 타입 캐스팅 불필요
		// -> 번거로움, 위험성 줄인다. 
		s = gsb.getContent();
		
		GenericBox<Integer> gib = 
				new GenericBox<>();
		gib.setContent(2021);
		
		i = gib.getContent();

	}

}
