package Pack;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


//ex10)
//public class Hello {
////������, �ʵ�, �޼���
//public static void main(String[] args) {
//	
//	int w = 7, h = 5;
//	
//	for (int i = 0; i < h; i++) {
//		for (int j = 0; j < w; j++) {
//			String s = (i+j) % 2 == 0 ? "O " : "X ";
//			
//			System.out.print(s);
////			System.out.print(((i+j) % 2 == 0) ? "0 " : "X ");
//			
//			
////			if( (i+j) % 2 == 0) {
////				System.out.print("O ");
////			}else{
////				System.out.print("X ");
////			}
//			
//		}
//		System.out.println();
//		
//	}
//	
//	}
//}
//


//ex11)

//public class Hello {
//	//������, �ʵ�, �޼���
//	public static void main(String[] args) {
//		int x = 1, y = 2;
//		
//		for (int i = 0; i < y ; i++) {
//			for (int j = 0; j <x ; j++) {
//				
//				
//			}
//			
//		}
//				
//				
//				
//			}
//		}
//		
//	}
//}
//
//
//public class Hello {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		
//		int custom_num = 0, custom_x=0,custom_y=0;
//		System.out.print("����� ũ�⸦ �Է��ϼ��� : ");
//		custom_num = sc.nextInt();
//		System.out.print("���� x���� �Է��ϼ��� : ");
//		custom_x = sc.nextInt();
//		System.out.print("���� x=y���� �Է��ϼ��� : ");
//		custom_y=sc.nextInt();
//		int nx=x, ny=y;
//		
//		for (int i = 0; i <custom_num; i++) {
//			for (int j = 0; j < custom_num; j++) {
//				if((i+j)==(custom_x+custom_y)) {
//					System.out.print("X");
//				}
//				else if(i==(custom_x-1)&&j==(custom_y-1)) {
//					System.out.print(" X ");
//				}
//				else {
//					System.out.print(" . ");
//				}
//			}
//			System.out.println();
//		}
//	
//	}
//	
//}
//




//
//public class Hello {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(1);
//		
//		// blicking �Լ��̴�. : Ư�������� �Ͼ�������� 
//		// ���μ����� ���̻� �������� ���Ѵ�.
//		
//		int num = scanner.nextInt();
//		System.out.println(2);
//		
//		int num2 = new Scanner(System.in).nextInt();
//		System.out.println(3);
//		//
////		sleep(1000); 
//		
//		//
//		//send() >> recv();
//		System.out.println(100);
//		func(); // 10��¥����.
//		System.out.println(200);
//	}
//}
//
//
//

// ex)16 
// O X O X X O ... 10��

// O : 3
// X : 2
public class Hello {
	public static void main(String[] args) {
		String strOX = "OXXXXXOOOO";
		
		
				
	}
			
}
//ex15)

//public class Hello {
//public static void main(String[] args) {
//	
//	int num = 23;
//	int num2;
//
////		Scanner sc = new Scanner(System.in);
//		num = sc.nextInt();
//		
//		if(num >= num2 & (num % 4 == 0 || num2 % 4 == 0) ) {
//			System.out.println();
//		
//	}
//	
//	
//	
//	}
//	
//}


//ex13) �Ǻ���ġ �Լ�
//long a=0, b=1, c;
//
//for (int i = 0; i < 10; i++) {
//	c = a+b;
//	a = b;
//	b = c;
//	
//	System.out.println(c);

//public class Hello {
//public static void main(String[] args) {
//	
//	int randomval;
//	int a,b,c;
//	
//	Random rn = new Random();
//	int len = 10;
//			
//	while(len <= 1) {
//		randomval = (int)(rn.nextInt(901) + 100);
//		
//		a = randomval % 100; //1�� �ڸ�
//		b = (randomval % 10) - a; // 10�� �ڸ�
//		c = randomval / 100; // 100�� �ڸ�
//		
//		if (a != b & a != c & b != c) {
//			System.out.println(randomval);
//			len--;
//			}
//		
//		System.out.println();
//	
//		
//		}
//		
//		
//	}
//}

//
//	for (int i = 0; i < 10; i++) {
//		randomval = (int)(rn.nextInt(901) + 100);
//		
//		a = randomval % 100;//1�� �ڸ�
//		b = (randomval % 10) - a;// 10�� �ڸ�
//		c = randomval / 100; // 100�� �ڸ�
//		
//		if (a != b & a != c & b != c) {
//			System.out.println(randomval);
//		}
//		
//		
//		}
//	
//	System.out.println();
//
//		
//	}
//	
//
//}
























//ex9)
//class Tiger{
//	
//	//������, �ʵ�, �޼���
//	static void m1() {
//		
//	}
//	static int num;
////}
//public class Hello {
//	//������, �ʵ�, �޼���
//	public static void main(String[] args) {
////		Tiger t = new Tiger();
////		
////		Tiger.m1();
////		System.out.println(Tiger.num);		
//		
//		
//	}
//}
//
//
//class Tiger {
//	void m1() {
//		Tiger tr = new Tiger(); //�����Ѵ�. 
//		
//	}
//	void m2() {
//		
//	}
//}
//
//public class Hello {
//	Hello(){
//		
//	}
//	
//	void m1() { //��ü�� �������� �ʾ� �� �� ����. 
//		
//	}
//	
//	static void m2() {
//		
//	}
//	int n1 = 0;
////	static int n2 = 0;
//
//	public static void main(String[] args) {
//		
//		Hello h = new Hello();
//		h.m2();
////		// m1();
////		m2();
////		
//////		n1 = 20;
////		n2 = 30;
////		
////		Hello h = new Hello();
////		h.m1();
////		h.m2();
//	}
//	
//	static void m1() {
//		
//	}
//	void m2() {
//		
//	}
//}
//
//


















//ex8)
//public class Hello {
//	public static void main(String[] args) {
//		for (int i = 0; i < 4; i++) {
//			for (int j = 1; j < 4; j++) {
//				System.out.printf((4-i) + "0" + j + "ȣ ");
//				
//			}
//			System.out.println();
//			
//		}
//		
//	}
//}
//
//public class Hello {
//	
//	static int f1() {
//		
//		return (3>2) ? 100 : 200;
//		if(3>2) {
//			return 100;
//			
//		}else {
//			return 200;
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		
//		int w = 5, h = 4;
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < w; j++) {
//				if(i == 0 || i == 4-1 || j == 0 || j == w-1) {
//					//���׿���
//					//System.out.print((i == 0 || i == 4-1 || j == 0 || j == w-1) ? "0 " : "* ");
//					System.out.print("* ");
//				}else {
//					System.out.print("0 ");
//				}
//				//���� ����
//				int a;
//				int b=20;
//				
//				if(3>2) {
//					a = b+ 10;
//					
//				}else {
//					a=20;
//				}
//				
//				// sugar code
//				a= 3>2 ? b + 10 : 20;
//				
//				//ex2)
//				if(3>2) {
//					System.out.println(" ȣ����");
//					
//				}else {
//					System.out.println(" �ڳ���");
//				}
//				System.out.println( (3>2) ? "ȣ����" : "�ڳ���");
//			}
//			System.out.println();
//			
//		}
//		
//	}
//}
//
////public class Hello {
////
////	public static void main(String[] args) {
////		Random rn = new Random();
////		
////		for (int i = 0; i < 10; i++) {
////			
////			// 0 ~ 99
////			int num = rn.nextInt(2);
////			System.out.println(num + rn.nextInt(100));
////				
////		}
////		
////		for (int i = 0; i < 10; i++) {
////			int n = new Random().nextInt();
////			System.out.println(n);
////			
////		}
////		
////	
////		
////	}
////}
//
//
//public class Hello {
//
//	public static void main(String[] args) {
//		
//		Random rn = new Random();
//		
//		for (int i = 0; i < 4; i++) {
//			int sum = 0;
//			for (int j = 0; j < 3; j++) {
//				int rnd = rn.nextInt(10);
//				sum += rnd;
////				System.out.printf("%d", rnd);
//				
//			}
////			System.out.printf("%d \n", sum);
//			
//		}
//		
//		// 2)
//		
//		Random rn2 = new Random();
//		String[] str = {
//				"A","B","C","D","E","F",
//				"G","H","I","J","K","L",
//				"M","N","O","P","Q","R",
//				"S","T","U","V","W","X",
//				"Y","Z"};
//		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				int num = rn2.nextInt(26);
//				
////				System.out.print(str[num]);
//	
//			}
////			System.out.println();
//			
//		}
//		
//	
////		A Z
////		
////		B D F Q
////		B D F Q
////		B D F Q
////		B D F Q
//		
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 3; j++) {
////				System.out.print((char)((int)(rn.nextInt(26) + 'A')));
//				
////				int num = a++;  // 
//				
//			}
////			System.out.println();
//			
//		}
//		
////		for(int i = 0; i<3; i++) {
////			for(int j = 0; j<4; j++) {
////				System.out.printf("%02d ", (2-i)*4+j);
////			}System.out.println();
////		}
//		
////		
////		for (int i = 0; i < 3; i++) {
////			for (int j = 0; j < 4; j++) {
////				System.out.printf("%02d ", i+(j*3));
////				
////			}System.out.println();
////			
////		}
////
////		
////	}
////}
//
