package javaBasic3.ch06.sec14;

import java.util.Scanner;

//Account Ŭ���� ����
public class BankApplication {

	Scanner sc = new Scanner(System.in);
	
	Account[]  accounts = new Account[100];
	//int[] intArr = new int[100];
	
	int count = 0; //���� ���� ī��Ʈ 
	
	public void ���»���() {
		accounts[ count ] = new Account();
		System.out.println("---------");
		System.out.println(" ���� ����");
		System.out.println("---------");
		System.out.print("���¹�ȣ :");
		accounts[count].���¹�ȣ = sc.next();
		System.out.print("������ :");
		accounts[count].������ = sc.next();
		System.out.print("�ʱ��Աݾ� :");
		accounts[count].�ʱ��Աݾ� = sc.nextInt();
		
		accounts[count].set�ܰ�(  accounts[count].�ʱ��Աݾ�     );
		
		System.out.println("��� : ���°� �����Ǿ����ϴ�. ");
		count = count + 1;
	}

	public void ���¸��() {
		System.out.println("-------");
		System.out.println("���¸��");
		System.out.println("------");
		for( int i=0; i < count; i++) {
			System.out.println( accounts[i].get���¹�ȣ() + " " + accounts[i].get������() + " " + accounts[i].get�ܰ�());
		}
		
	}

	public void ����() {
		System.out.println("------");
		System.out.println("����");
		System.out.println("-----");
		System.out.print(" ���¹�ȣ ");
		String �����Ұ��¹�ȣ = sc.next();
		//ȫ�浿 ���ڹ� �������� Ȯ���ϱ� 
		// ���� �������� Ȯ���ϱ� 
		System.out.print( " ���ݾ� ");
		int ���ݱݾ� = sc.nextInt();
		
		int i;
		boolean flag=false;
		for(  i=0; i < count ; i++) {
			if( �����Ұ��¹�ȣ.equals( accounts[i].get���¹�ȣ()    )) {
				accounts[i].�ܰ� = accounts[i].get�ܰ�() + ���ݱݾ�;          // ȫ�浿 �ܰ� ���ݱݾ��� ���ؼ� ȫ�浿 �ܰ� �־��
				flag=true;
				break; }  //�ݺ��� �׸��ΰ� i�������� ����� �־�� �Ѵ�. 
		}
	    
		if( !flag ) System.out.println( "���¹�ȣ�� Ʋ�Ƚ��ϴ�. Ȯ���ϼ���.");
		
	 
	}

	public void ���() {
		System.out.println("------");
		System.out.println("���");
		System.out.println("-----");
		System.out.print(" ���¹�ȣ ");
		String �����Ұ��¹�ȣ = sc.next();
		//ȫ�浿 ���ڹ� �������� Ȯ���ϱ� 
		// ���� �������� Ȯ���ϱ� 
		System.out.print( " ��ݾ� ");
		int ��ݱݾ� = sc.nextInt();
		
		int i;
		boolean flag=false;
		for(  i=0; i < count ; i++) {
			if( �����Ұ��¹�ȣ.equals( accounts[i].get���¹�ȣ()    )) {
				flag=true;
				if( accounts[i].�ܰ� < ��ݱݾ�)  System.out.println("�ܰ� �����մϴ�"); 
				else accounts[i].�ܰ� = accounts[i].get�ܰ�() - ��ݱݾ�;  // ȫ�浿 �ܰ� ���ݱݾ��� ���ؼ� ȫ�浿 �ܰ� �־��
				break; }  //�ݺ��� �׸��ΰ� i�������� ����� �־�� �Ѵ�. 
		}
	    
		if( !flag ) System.out.println( "���¹�ȣ�� Ʋ�Ƚ��ϴ�. Ȯ���ϼ���.");
		
		
	}

	
	
	// ���»���
	
	// ���¸��
	
	// ����
		
	// ���
	
}
