package javaBasic4.ch07.sec08;

import javaBasic4.ch07.sec07.A;

public class D extends A{

	public D() {
		super();
	}
	
	public void method1() {
		this.field = "value"; //다른 패키지에 있는 A클래스 부모의 필드 쓸 수 있다. 
		this.method(); 
	}
	
//	public void method() {
//    	A a = new A();
//    	a.field="value";
//    	a.method();
//    }
	
}
