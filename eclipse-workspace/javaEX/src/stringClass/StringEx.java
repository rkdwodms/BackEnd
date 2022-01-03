package stringClass;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		usefulMethods();
		stringBufferEx();
		

	}
	private static void stringBufferEx() {
		//배열 생성
		StringBuffer sb = new StringBuffer("This");
		
		
		//문자열 추가
		sb.append(" is pencil");
	
		//문자열 중간 삽입
		sb.insert(8, "my ");
		
		System.out.println(sb);
		
		//치환하기
		
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		//buffer기반이기 때문에 문자열이 늘어날 때 알아서 늘어나게 된다.
		
		// 버퍼 사이즈 조정
		sb.setLength(5);
		System.out.println(sb);
		
		//메서드 체이닝 : 객체를 생성하고 객체에서 메서드를 수행한다. 그리고 
		//매서드에서 메서드를 다시 수행하고 메서드를 다시 수행하고 
		//객체에서 매서드를 수행하고 수행하고 하는 것을 메서드 체이닝이라고 한다. 
		// 스트링버퍼도 메서드 체이닝을 지원한다.
		
		StringBuffer sb2 = new StringBuffer("This")
				.append(" is pencil")
				.insert(8, "my ")
				.replace(8, 10, "your"); //메서드 체이닝 기법
		
		
		String s = sb2.toString(); //tostring이 호출될 때 비로소 문자열이 호출된다.
		
		System.out.println(s);
		
	}
	private static void usefulMethods() {
		String str = "Java programming Javascript programming";
		
		//문자열 갯수 반환 : length
		System.out.println("length:" + str.length());
		
		// 변환 메소드
		System.out.println("uppercase :"+ str.toUpperCase());
		System.out.println("lowercase" + str.toLowerCase());
		
		System.out.println("원본: " + str); //immutable : 변경불가자료
		
		//검색 
		int position = str.indexOf("Java");
		System.out.println(position);
		position = str.indexOf("Java", 4);
		System.out.println(position);
		
		
		//문자열 추출
		System.out.println("SUBSTRING:" + str.substring(5)); //5번 인덱스부터 끝까지 추출
		System.out.println("SUBSTRING:" + str.substring(5,16));
		
		
		//치환
		
		System.out.println("REPLACE:"+ str.replace("programming", "Coding"));
		
		
		//문자열 분리
		String[] split = str.split(" ");
		for( String word: split) {
			System.out.println(word);
			
		System.out.println(split[0]);
		
		
		}
		
		//trim() : 공백문자 제거 / startwith, endwith 
		
		//문자열 비교
		//0이면 순서 같음, -1이면 앞의 것이 작다, 1이면 앞의 것이 크다.
		System.out.println("ABC".compareTo("AOD"));
		
		
	}

}
