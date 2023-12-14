package javaBasic4.ch07.sec16;

public class 확인문제7장 {
    public static void action(A a) {
    	a.method1();
    	if( a instanceof C ) {  // C 객체일 때만 
    		((C) a).method2();
    	}
     }
	
	public static void main(String[] args) {
		// 1 2 1 4 2 
		
		//10 추상클래스를 상속받았으니까 추상메소드 재정의해야 한다.
		
		MainMainActivity m = new MainMainActivity();
		m.onCreate();

	     // 11 super 
		action(new A());
		action(new B());
		action(new C());
		
	}

}
