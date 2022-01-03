package casting;

public class Cat extends Animal{
	//생성자 만들어주기
	public Cat(String name) {
		//super를 명시하여 생성자를 만들어준다.
		super(name);
	}
	
	public void meow() {
		System.out.println(name + ": 야옹한다.");
	}

}
