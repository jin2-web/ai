package javaBasic3.ch06.sec11;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator(); //1단계 객체화한다. 힙메모리에 올린다.
		
		calculator.powerOn();//메소드 호출
		calculator.powerOff();
		
		calculator.powerOn();
		int result = calculator.plus(300, 500);
		System.out.println( result);
		//문제 -50, -100 더하기
		result = calculator.plus(-50, -100);
		System.out.println( result );
		
		//문제 100, 200, 300 더하기 
		// A사람 생각은 2번 호출한다.  
		result = calculator.plus(100, 200);
		result = calculator.plus(result, 300);
		System.out.println( result );
		
		// B사람 생각 메소드의 매개변수를 3개를 만들어 두고
		result = calculator.plus(100, 200, 300);
		System.out.println( result );
		
		//234 int sum( int ... values ) 여러개
		
		
		

	}

}
