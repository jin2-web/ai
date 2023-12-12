package javaBasic4.ch07.sec03;

//조상 클래스 
public class Calculator {

	 double areaCircle( double r ) {
		System.out.println( "Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r; //원의 넓이 구하기
	}
	
}
