package javaBasic6.ch09.sec04;

public class OutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 밖에 클래스를 먼저 객체화 하세요.
		Outter o = new Outter();
		
		//iaM() 호출하려면
		// 1. 내부를 객체화한다. 2. 메소드 호출한다.
		Outter.Inner i = o.new Inner();
		i.iaM();
	}

}

class Outter {
	
	int a =10;
	void aM() { 
		// ia = ia -5; 밖에 멤버은 안에 클래스의 멤버를 쓸 수 없다. 
	}
	static int sa=20;
	static void saM() {
		
	}
	
	class Inner{
		
		int ia = 100;
		void iaM() {
			//내부클래스는 외부클래스의 모든 멤버드를 다 쓸 수 있다. 
			ia = ia +20;
			a = a + 20;
			aM();
			Outter.sa = Outter.sa + 100;
			Outter.saM();
		};
	//	static int sia=10;
	//	static void siaM() {};
		
	}
}
