package javaBasic5.ch08.sec02;

//역할을 추상메소드로 구현한다.
public interface RemoteControl {

	//상수 - 변하지 않는 수, 내용을 바꾸지 못하는 수
	final static int MAX_VOLUME = 10;
	final static int MIN_VOLUME = 0;
	
	//추상메소드 선언 abstract 생략할 수 있다.
	void turnOn();
	void turnOff();
	void setVolume( int volum);
	// void qrRead();
	
	// 자바가 버젼업 되면서 추가 된 메소드들 
	// 디폴트메소드 
	default void defaultM() {
		int sum=0;
		System.out.println("QR코드 입력 받기 ");
		for(int i=0; i<10; i++) {
			sum+=privateM(i);
		}
		System.out.println( sum );
	}
	// 정적메소드
	static void staticM() {
		System.out.println(" 카카오톡 인증받기 ");
		
	}
	// private 메소드 인터페이스에서만 사용할 수 있는 메소드 
	private int privateM(int i) {
		return i+10;
	}
		
	
}
