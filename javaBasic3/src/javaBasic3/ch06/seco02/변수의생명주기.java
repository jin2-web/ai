package javaBasic3.ch06.seco02;

public class �����ǻ����ֱ� {

	int c=10; //���� ����
	
	public static void main(String[] args) {
		
		int a=10; //���� �¾�� ���� main() �ȿ����� �� �� �ִ�. ������ ���� { } �ȿ����� ������ 
		//System.out.println( c );
		
		for( int i=0; i<10; i++) {
			int j=8;
			System.out.println( i );
		}
		//System.out.println( i );

	}

	void method01() {
		int b=20; //��������
		//System.out.println( a ); //������ ������� �ʾҴ� ���� 
		System.out.println(c);
	}
	void method02() {
		//System.out.println( b );
		System.out.println( c );
	}
}
