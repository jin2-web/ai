package javaBasic6.ch09.sec01;

public class AExample {

	public static void main(String[] args) {
		A a = new A();
		a.aM();
		A.sa = 2000;
		A.saM();
		
		A.B ab =a.new B(); //A.B  A클래스에 속안에 있는 B클래스 
        ab.b = 300;
        ab.bM();
        
	}

}

class A {
	
	int a=10;
	void aM() {
		System.out.println( a );
	//	b = b + 100; // 내부클래스의 변수를 사용할 수 없다.
	//	bM(); //내부클래스의 메소드를 사용할 수 없다.
	}
	
	static  int sa = 200; //정적멤버 번역할때 미리 스택메모리에 올린다. 
	static void saM() {
		System.out.println( sa );
		// System.out.println( b ); //new 하고 써야 한다.
		// System.out.println( a ); //static 붙어 있는 메소드는 미리 올라가기 때문 new 해서 쓰는 것은 못쓴다. 
		// aM();
		// bM();
	}
	
	class B {
		// a = a + 100; 에러  메소드 안에 더해라 라고 명령해야 하는데 클래스에다 명령주어서 안됨
		// aM(); 에러  메소드 안에 메소드 호출라고 명령해야 하는데 클래스에다 명령주어서 안됨
		int b=20;
		void bM() {
			a = a + 100; //내부클래스에서 외부클래스 필드를 사용할 수 있다.
			aM(); //내부클래스에서 외부클래스의 메소드 호출할 수 있다. 
			System.out.println( b );
		}
		//static int sb=200; //A클래스가 new가 되기 전이니깐
		// static void sbM() {	}
		
		
	}
}