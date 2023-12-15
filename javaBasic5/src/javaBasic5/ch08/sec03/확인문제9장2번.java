package javaBasic5.ch08.sec03;

public class 확인문제9장2번 {

	public static void main(String[] args) {
		// 4-모두 다 왜 다 하위 구현 객체니깐,   
        
        Driver1  d1 = new Driver1();
        d1.method(new C1());
	}

}





class Driver1{
	
	void method( A1 a) {
		
	}

}

interface A1{
	
}
class B1 implements A1{
	
}
class C1 implements A1{
	
}
class D1 extends C1 {
	
}
class E1 extends C1 {
	
}