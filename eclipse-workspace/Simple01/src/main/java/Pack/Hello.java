package Pack;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor //파이널 변수 사용할 때?

@Data //위의 다섯개를 다 포함하는 것!
class Tiger{
	int num;
	String name;


	
}
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1000);
		Tiger t = new Tiger();
		t.setNum(100);
		System.out.println(t.getNum());
		t.toString()

	}

}
