package javaBasic3.ch06.sec07;

import java.util.Scanner;

public class Ȯ�ι���6_12 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print( " id > " );
		String id = sc.next();
		
		System.out.print( " password > " );
		String password = sc.next();
		
		MemberServices memberServices = new MemberServices();
		boolean result =  memberServices.login( id, password );
		
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�");
			memberServices.logout( id );
		}else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}

	}

}
