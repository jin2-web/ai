package javaBasic3.ch06.sec06;

public class Ȯ�ι���6�� {

	public static void main(String[] args) {
		// 3, 4, 4, 3, 1, 4, 7��-2, 8��-2, 9�� - 2, 10��-4 11��-3 12�� 
        �����ڿ��� c1 = new �����ڿ���("ȫ�浿");//��üȭ 
        �����ڿ��� c2 = new �����ڿ���(); 
        �����ڿ��� c3 = new �����ڿ���(100,true);
        �����ڿ��� c4 = new �����ڿ���("�̼���");
        �����ڿ��� c5 = new �����ڿ���(true, 100);
        
        �޼ҵ� m1 = new �޼ҵ�();
        m1.m3(1,2);
        m1.m3(1,2,3,4);
        
        //�����ʵ�� �޼ҵ�� ��ü�������� �ʾƵ� �� �� �ִ�.
        �޼ҵ�.a = 100;
        �޼ҵ�.sm1();
        
        System.out.println( �޼ҵ�.PI );
        
	}

}

class Ȯ��{
	
	public Ȯ��() {
		// TODO Auto-generated constructor stub
	}
	
	int a=10;
	
}