package javaBasic3.ch06.sec10;

public class CarExample {

	public static void main(String[] args) {
		// Car 클래스 객체화 
        Car myCar = new Car();
        
        System.out.println( "회사명 : " + myCar.company );
        System.out.println( "모델명 : " + myCar.model );
        System.out.println( "색깔 : " + myCar.color );
        System.out.println( "최고속도 : " + myCar.maxSpeed );
        System.out.println( "현재속도: " + myCar.speed );
        
        //필드값 변경
        myCar.speed = 60;
        System.out.println("수정된 속도: " + myCar.speed );
        
        //생성자로 필드에 값을 넣기 
        Car sCar = new Car("삼성자동차", "SM3", "흰색", 370, 0);
        
        System.out.println( "회사명 : " + sCar.company );
        System.out.println( "모델명 : " + sCar.model );
        System.out.println( "색깔 : " + sCar.color );
        System.out.println( "최고속도 : " + sCar.maxSpeed );
        System.out.println( "현재속도: " + sCar.speed );
        
        //필드 변경 
        sCar.speed = 100;
        System.out.println("삼성 자동차 수정된 속도: " + sCar.speed );
        
        Car car2 = new Car();
        System.out.println("=================");
        System.out.println( "회사명 : " + car2.company );
        System.out.println( "모델명 : " + car2.model );
        System.out.println( "색깔 : " + car2.color );
        System.out.println( "최고속도 : " + car2.maxSpeed );
        System.out.println( "현재속도: " + car2.speed );
		 
        Car car3 = new Car();
        
        car3.setCompany("독일자동차");
        car3.setModel("BMW");
        car3.setMaxSpeed(300);
        car3.setColor("검정색");
        car3.setSpeed(0);
        
        System.out.println("=================");
        System.out.println( "회사명 : " + car3.getCompany() );
        System.out.println( "모델명 : " + car3.getModel() );
        System.out.println( "색깔 : " + car3.getColor() );
        System.out.println( "최고속도 : " + car3.getMaxSpeed() );
        System.out.println( "현재속도: " + car3.getSpeed() );
        
        
        
	}

}
