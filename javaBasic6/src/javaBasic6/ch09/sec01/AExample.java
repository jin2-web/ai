package javaBasic6.ch09.sec01;

public class AExample {

	public static void main(String[] args) {
		A a = new A();
		a.aM();
		A.sa = 2000;
		A.saM();
		
		A.B ab =a.new B(); //A.B  AŬ������ �Ӿȿ� �ִ� BŬ���� 
        ab.b = 300;
        ab.bM();
        
	}

}

class A {
	
	int a=10;
	void aM() {
		System.out.println( a );
	//	b = b + 100; // ����Ŭ������ ������ ����� �� ����.
	//	bM(); //����Ŭ������ �޼ҵ带 ����� �� ����.
	}
	
	static  int sa = 200; //������� �����Ҷ� �̸� ���ø޸𸮿� �ø���. 
	static void saM() {
		System.out.println( sa );
		// System.out.println( b ); //new �ϰ� ��� �Ѵ�.
		// System.out.println( a ); //static �پ� �ִ� �޼ҵ�� �̸� �ö󰡱� ���� new �ؼ� ���� ���� ������. 
		// aM();
		// bM();
	}
	
	class B {
		// a = a + 100; ����  �޼ҵ� �ȿ� ���ض� ��� ����ؾ� �ϴµ� Ŭ�������� ����־ �ȵ�
		// aM(); ����  �޼ҵ� �ȿ� �޼ҵ� ȣ���� ����ؾ� �ϴµ� Ŭ�������� ����־ �ȵ�
		int b=20;
		void bM() {
			a = a + 100; //����Ŭ�������� �ܺ�Ŭ���� �ʵ带 ����� �� �ִ�.
			aM(); //����Ŭ�������� �ܺ�Ŭ������ �޼ҵ� ȣ���� �� �ִ�. 
			System.out.println( b );
		}
		//static int sb=200; //AŬ������ new�� �Ǳ� ���̴ϱ�
		// static void sbM() {	}
		
		
	}
}