package javaBasic6.ch09.sec05;

//�͸�Ŭ����
public class AnyEx {

	public static void main(String[] args) {
		
		AA aa = new AA();//�̸��ִ� �ڽ� Ŭ���� ��üȭ 
        aa.iaM();
        
        
        A aaa = new AA(); //������
        
        //�ڽ��̸� ���� �ڽ�Ŭ���� ��üȭ�ϱ� - �͸� �ڽİ�ü
        A a = new A() {
        	@Override
        	void iaM() {
        		System.out.println("�̸����� �ڽ�Ŭ���� ���� �θ�üȭ�� { }�ְ� �ٷ� �ڽ� Ŭ���� ����");
        	}
        };
        
        a.iaM();
	}

}

class A{

	void iaM() {
	    System.out.println("�θ�Ŭ����");	
	}

}
class AA extends A{ //��� 
	@Override
	void iaM() {
		System.out.println("�ڽ�Ŭ����-�̸��ִ�.");
	}
}