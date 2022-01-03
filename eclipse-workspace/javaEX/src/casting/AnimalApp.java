package casting;

public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//upcasting , downcasting
		
		Dog dog1 = new Dog("멍멍이");
		// 참조 클래스(설계도)에 명시된 기능만 이용할 수 있다.
		dog1.bark();
		dog1.eat();
		dog1.walk();
		
		Animal dog2 = new Dog("스누피"); // 업캐스팅 : 자식타입을 부모타입으로 변환하는 것 
		
		dog2.eat();
		dog2.walk();
		
//		dog2.bark();  참조타입의 설계도에 있는 것만 사용이 가능하다.
		((Dog)dog2).bark(); //downcasting : Animal을 Dog타입으로 변환한 것 이다. bark() 이용가능
		
//		Dog pet = new Dog("아지"); // 이거 후 pet = new Cat("야옹이")는 불가
		Animal pet = new Dog("아지"); // 대체 가능성 변환가능 
		pet.eat();
		pet.walk();
		
		
		pet = null;
		
		pet = new Cat("야옹이"); ///Animal로 참조되어 있음 
		pet.eat(); pet.walk();
		
		
//		((Dog)pet).bark(); //pet이 실제 Dog인가를 봐야한다. cat이기 때문에 에러
		//현재 pet이 어떤 클래스의 인스턴스인지 확인이 필요하다. 
		
		if (pet instanceof Dog) {
			//pet이 Dog의 인스턴스 이냐? 맞다면 Dog로의 캐스팅이 가능해진다. 
			((Dog)pet).bark();
		}else if(pet instanceof Cat) {
			((Cat)pet).meow();
		}
		
		Dog[] pets = new Dog[3];
		pets[0] = dog1;
		pets[1] = new Dog("바둑이");
//		pets[2] = new Cat("양양이"); // 들어갈 수 가 없다. pets배열은 Dog만 담길 수 있음 
		
//		Animal[] pets = new Animal[3];
//		pets[0] = dog1;
//		pets[1] = new Dog("바둑이");
//		pets[2] = new Cat("양양이");
//		
		
		for( Animal p: pets) {
			p.eat();
			p.walk();
		}

	}

}
