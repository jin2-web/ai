package javaBasic3.ch06.sec11;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator(); //1�ܰ� ��üȭ�Ѵ�. ���޸𸮿� �ø���.
		
		calculator.powerOn();//�޼ҵ� ȣ��
		calculator.powerOff();
		
		calculator.powerOn();
		int result = calculator.plus(300, 500);
		System.out.println( result);
		//���� -50, -100 ���ϱ�
		result = calculator.plus(-50, -100);
		System.out.println( result );
		
		//���� 100, 200, 300 ���ϱ� 
		// A��� ������ 2�� ȣ���Ѵ�.  
		result = calculator.plus(100, 200);
		result = calculator.plus(result, 300);
		System.out.println( result );
		
		// B��� ���� �޼ҵ��� �Ű������� 3���� ����� �ΰ�
		result = calculator.plus(100, 200, 300);
		System.out.println( result );
		
		//234 int sum( int ... values ) ������
		
		
		

	}

}
