package javaApp4.ch16.sec02;

public class 확인문제7 {

	private static int[] scores= {10,50,3};
	// Operator operator = (int x, int y) ->   (x > y ) ? x : y 
	public static int maxOrMin( Operator operator ) {
		int result = scores[0]; // 10
		for( int score : scores) {
			result  = operator.apply(result, score); // (10, 10) (10, 50) 
		}
		return result;
		
	}
	public static void main(String[] args) {
		// 최대값 얻기 답 50
		int max = maxOrMin(
				   ( x, y) ->   (x > y ) ? x : y 
				);
        System.out.println( "최대값 : " + max ); // max값은 50 
        
        int min = maxOrMin( ( x, y) ->   (x < y ) ? x : y    );
        System.out.println( "최소값 : " + min );
	}

}

//함수적 인터페이스 인터페이스에 추상메소드 1개인 것 
@FunctionalInterface
interface Operator{
	public int apply(int x, int y);
}