package javaBasic5.ch08.sec03;

public class Ȯ�ι���9�� {

	public static void main(String[] args) {
		// 388 1-1, 2-3, 3-4 �ڵ����� Ÿ���� ��ȭ�ȴ�.
		// A a = new A(); ��üȭ�� �� ����. 
		// �������̽��� ����Ϸ��� class�� �����Ͽ��� �̿��Ѵ�. 
         AImpl a = new AImpl();
         Driver d = new Driver();
         d.a = new AImpl();
         d.drive(a);
         A a1 = new AImpl();
         BB bb =new BB();
         B  b = new BB(); //�ڵ�����ȯ
         b.aM();
        // b.bM();��� ����
           
         BB bb2 = (BB) b; //��������ȯ
         bb2.aM();        
         bb2.bM();   //�뵵 : �ڽ��� ���� �޼ҵ带 ����Ϸ��� ��������ȯ ����Ѵ�. 
       
         
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


interface  A{ //�������̽�
	//��� 
	static final int a=10;
	abstract void aM(); //�߻�޼ҵ�
	default void dM() { } // default �޼ҵ� �������̵� �� �� �ִ�. 
	static void sM() { } //���� �޼ҵ� 
}

class AImpl implements A{ //����Ŭ����

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





