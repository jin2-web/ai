package javaBasic5.ch08.sec03;

public class 확인문제9장 {

	public static void main(String[] args) {
		// 388 1-1, 2-3, 3-4 자동으로 타입이 변화된다.
		// A a = new A(); 객체화할 수 없다. 
		// 인터페이스를 사용하려면 class를 구현하여서 이용한다. 
         AImpl a = new AImpl();
         Driver d = new Driver();
         d.a = new AImpl();
         d.drive(a);
         A a1 = new AImpl();
         BB bb =new BB();
         B  b = new BB(); //자동형변환
         b.aM();
        // b.bM();사용 못함
           
         BB bb2 = (BB) b; //강제형변환
         bb2.aM();        
         bb2.bM();   //용도 : 자식이 만든 메소드를 사용하려고 강제형변환 사용한다. 
       
         
	}

}

class Driver{
	A a;
	void drive(A a) {
		a.aM();
	}
}

class B {
	
	int a=10;
	void aM() {
		System.out.println( a );
	}
	
}

class BB extends B{
	int b=20;
	void bM() {
		System.out.println( b );
	}
	
}


interface  A{ //인터페이스
	//상수 
	static final int a=10;
	abstract void aM(); //추상메소드
	default void dM() { } // default 메소드 오버라이드 할 수 있다. 
	static void sM() { } //정적 메소드 
}

class AImpl implements A{ //구현클래스

	@Override
	public void aM() {
		System.out.println( a );
		
	}
	// a=a+10;
    @Override
	public void dM() {
		// TODO Auto-generated method stub
		A.super.dM();
	}	
    
}





