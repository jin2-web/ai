package javaBasic5.ch08.sec02;

//������ �߻�޼ҵ�� �����Ѵ�.
public interface RemoteControl {

	//��� - ������ �ʴ� ��, ������ �ٲ��� ���ϴ� ��
	final static int MAX_VOLUME = 10;
	final static int MIN_VOLUME = 0;
	
	//�߻�޼ҵ� ���� abstract ������ �� �ִ�.
	void turnOn();
	void turnOff();
	void setVolume( int volum);
	// void qrRead();
	
	// �ڹٰ� ������ �Ǹ鼭 �߰� �� �޼ҵ�� 
	// ����Ʈ�޼ҵ� 
	default void defaultM() {
		int sum=0;
		System.out.println("QR�ڵ� �Է� �ޱ� ");
		for(int i=0; i<10; i++) {
			sum+=privateM(i);
		}
		System.out.println( sum );
	}
	// �����޼ҵ�
	static void staticM() {
		System.out.println(" īī���� �����ޱ� ");
		
	}
	// private �޼ҵ� �������̽������� ����� �� �ִ� �޼ҵ� 
	private int privateM(int i) {
		return i+10;
	}
		
	
}
