package javaBasic4.ch07.sec01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//���� �︳�ϴ�. 
		Phone p = new Phone();
		p.bell();
		
		p.sendVoice("�� ���!");
		p.receiveVoice("�� ��� �ʵ� �����?");

		SmartPhone sp = new SmartPhone();
		sp.sendVoice("���� ���� �ž�?");
		sp.receiveVoice("������ �����Ұž�");
		sp.hangUp();
		
		SmartPhone sp2 = new SmartPhone("������", "���");
		//�������� �������� �˴ϴ�.  ����ϱ�
		System.out.println( sp2.model );
		sp2.setWifi(false);
		if(sp2.wifi) {
			System.out.println(sp2.model +"�� �������̰� �˴ϴ�.");
		}else {
			System.out.println(sp2.color + " �ڵ����� �������̰� �ȵ˴ϴ�.");
		}
		//��� �ڵ����� �������̰� �ȵ˴ϴ�.
		
		//�������� ����̰� ���� �︳�ϴ�. 
		
		System.out.print( sp2.model + "�� " + sp2.color + "�̰� " );
		sp2.bell();
		
		//�������� �޼����� �Խ��ϴ� "�ڱ�: �ڵ��� ���?"
		System.out.print( sp2.model + "�� �޼����� �Խ��ϴ� ");
		sp2.sendVoice("�ڵ��� ���?");
		
		//�θ�Ŭ�������� �ڽ��� wifi �ʵ�, �޼ҵ� ����ϱ�
/*      �θ�Ŭ���������� �ڽ��� ������� �� �� ����. 
 * 
 * 		p.wifi=true;
		
		p.setWifi(true);
		
		p.internet(); */
		
		
	}

}
