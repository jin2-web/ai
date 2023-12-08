package javaBasic3.ch06.sec08;

public class 확인문제6장16번 {

	public static void main(String[] args) {
		
		Printer printer = new Printer();//Printer 클래스를 객체 생성한다.
		
		printer.println(10);// 참조변수명.메소드 
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
		Printer1.println(10); //클래스명.메소드  static 메소드 
		Printer1.println(true); // 클래스로더단계에서 스택메모리 메소드영역에 자동으로 올라간다. 
		Printer1.println(5.7);
		Printer1.println("홍길동");
		

	}

}
