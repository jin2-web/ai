package javaBasic5.ch08.sec02;

public class Television   implements RemoteControl {

	private int volume; 
	
	@Override
	public void turnOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù");
		
	}

	@Override
	public void setVolume(int volum) {
		
		if( volum > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if( volum < RemoteControl.MIN_VOLUME ) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volum; 
		}
		
		System.out.println("ÇöÀç TVÀÇ º¼·ýÀº " + volum );
	}

}







