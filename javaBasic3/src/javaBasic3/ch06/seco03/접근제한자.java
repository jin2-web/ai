package javaBasic3.ch06.seco03;

import javaBasic3.ch06.sec04.AA;
import javaBasic3.ch06.sec05.Singleton;

public class ���������� {

	public static void main(String[] args) {
		
		Singleton o1 = Singleton.getInstance();
		System.out.println( o1 );
		
		
		 A aAdd = new A(); //��üȭ�ϱ�
		 
		// System.out.println( aAdd.a ); ���� private �ٸ� ��ü���� ����
        System.out.println( aAdd.b );
        //���������ڰ� default�̴ϱ� ���� ��Ű���� �����ϴ�. 
        System.out.println( aAdd.c );
        //���������ڰ� public�̴ϱ� �����ϴ�.
        
        // aAdd.a1(); ���� private �ٸ� ��ü���� ����
        aAdd.b1();
        aAdd.c1();
        
        AA aaAdd = new AA();
       // System.out.println( aaAdd.a ); ���� private �ٸ� ��ü���� ����
        //System.out.println( aaAdd.b ); ���� default ���� ��Ű���� ����
        System.out.println( aaAdd.c );   //���������ڰ� public�̴ϱ� �����ϴ�.
        
      /* aaAdd.a1();
         aaAdd.b1(); */
        
        aaAdd.c1();
        
        // ������ ������ ���� ������ private�ϰ� �޼ҵ� public���� �մϴ�. 
        
	}

}





