package javaBasic3.ch06.sec10.exam03;

//250page
public class ClassName250 {

	
	
	//��� const 
	static final int A = 100; 
	static final double PI = 3.141592;
	static final double RATE = 0.025;
	
	//���� = ���ϴ� ��  
	int a=10;
	
	
	//�ν��Ͻ� �����
	int field;
	void method() {
		a=a+100;
		System.out.println( A + 20 );
		// A = 1000; ���� ����̱� ������ �ٲ��� ���� 
	};
	
	//���� �����(Ŭ���������)
	static int field2;
	static void method2() { };
	
	static {
		//field = 10; ���� ��? �޸� �ö󰡴� ���� �ٸ���. 
		//method(); ���� 
		field2 = 20;
		method2();
	}
	
	static void method3(){
		//field = 10; ����
		//method(); ���� 
		field2 = 20;
		method2();
	}
	
	{
		field = 10;  
		method();  
		field2 = 20;
		method2();
		
	}
	
	void method4() {
		field = 10;  
		method();  
		field2 = 20;
		method2();
	}

	
}
