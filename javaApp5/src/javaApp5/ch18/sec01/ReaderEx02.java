package javaApp5.ch18.sec01;

import java.io.*; //*�� ��� ��

public class ReaderEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   try {
			   
			   char[] cArr = new char[100];
			   Reader r = new FileReader("D:/ai/study/java_study/data/test3.txt");
			   while( true) {
				   int data = r.read( cArr );
				   if( data == -1) break;
				   for( int i=0; i < data ; i++) {
					   System.out.println( (char) cArr[i] );//�����͸� ����ϱ�
				   }
			   }
			   r.close();
			   
			   Writer w = new FileWriter("D:/ai/study/java_study/data/test5.txt");
			   
			   w.write("abcdef");
			   w.write(65); // 65�� �����ڵ�� �빮��A�� ���� ��, �����ڵ� �� 65�� ���ش�. 
			   
			   w.flush();
			   w.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
