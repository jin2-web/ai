package javaBasic7.ch11.sec02.exam01;

public class ExceptionEx {

	public static void printlength( String data ) {
		int result = data.length(); //문자열의 길이 구하기
		System.out.println( "문자수는 " + result);
	}
	
	
	public static void main(String[] args) {
		
//  형식	
//		try {	
//		 //예외 발생할 것 같은 코드 내용 감싼다.
//	     } catch( 예외명 변수    ) {
//		  //위에 예외가 발생했을 때 처리하는 코드 작성
//	  }
//	  
	  try {	
	         int a=10;
	         a = a/2;
	         System.out.println( a );
	         int[] iArr = {10,20,30};
	         System.out.println( iArr[2]);
	         
	         printlength("this is java");
	         printlength("ab");//null 아직 자료가 없다. 
	             
	         Class.forName("java.lang.ABC");
	         
	      } catch( ArithmeticException e ) {
	    	  System.out.println("분모가 0이면 안된다. ");
	      } catch( ArrayIndexOutOfBoundsException e) {
	    	  System.out.println("배열의 인덱스 범위가 벗어났습니다. ");
	      } catch( NullPointerException e) {
	    	  e.printStackTrace();
	    	  System.out.println("null로 연결해서 오류가 났습니다");
	    	  
//	      } catch (ClassNotFoundException e) {
//			   System.out.println("클래스명이 틀렸습니다.");
			
	      } catch (Exception e) {
	    	  System.out.println( "모든 예외의 부모 클래스 ");
		} finally {
	    	  // 예외상관없이 무조건(꼭, 필수) 처리해야됨
	    	  System.out.println( "DB닫기");
		      System.out.println(" 로그오프하기 ");
	      }
	    
		
		
	}

}
