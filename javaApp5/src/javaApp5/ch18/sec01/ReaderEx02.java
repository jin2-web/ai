package javaApp5.ch18.sec01;

import java.io.*; //*은 모든 것

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
					   System.out.println( (char) cArr[i] );//데이터를 출력하기
				   }
			   }
			   r.close();
			   
			   Writer w = new FileWriter("D:/ai/study/java_study/data/test5.txt");
			   
			   w.write("abcdef");
			   w.write(65); // 65는 유니코드로 대문자A를 말함 즉, 유니코드 값 65를 써준다. 
			   
			   w.flush();
			   w.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
