package javaBasic3.ch06.sec10;

public class CarExample {

	public static void main(String[] args) {
		// Car Ŭ���� ��üȭ 
        Car myCar = new Car();
        
        System.out.println( "ȸ��� : " + myCar.company );
        System.out.println( "�𵨸� : " + myCar.model );
        System.out.println( "���� : " + myCar.color );
        System.out.println( "�ְ�ӵ� : " + myCar.maxSpeed );
        System.out.println( "����ӵ�: " + myCar.speed );
        
        //�ʵ尪 ����
        myCar.speed = 60;
        System.out.println("������ �ӵ�: " + myCar.speed );
        
        //�����ڷ� �ʵ忡 ���� �ֱ� 
        Car sCar = new Car("�Ｚ�ڵ���", "SM3", "���", 370, 0);
        
        System.out.println( "ȸ��� : " + sCar.company );
        System.out.println( "�𵨸� : " + sCar.model );
        System.out.println( "���� : " + sCar.color );
        System.out.println( "�ְ�ӵ� : " + sCar.maxSpeed );
        System.out.println( "����ӵ�: " + sCar.speed );
        
        //�ʵ� ���� 
        sCar.speed = 100;
        System.out.println("�Ｚ �ڵ��� ������ �ӵ�: " + sCar.speed );
        
        Car car2 = new Car();
        System.out.println("=================");
        System.out.println( "ȸ��� : " + car2.company );
        System.out.println( "�𵨸� : " + car2.model );
        System.out.println( "���� : " + car2.color );
        System.out.println( "�ְ�ӵ� : " + car2.maxSpeed );
        System.out.println( "����ӵ�: " + car2.speed );
		 
        Car car3 = new Car();
        
        car3.setCompany("�����ڵ���");
        car3.setModel("BMW");
        car3.setMaxSpeed(300);
        car3.setColor("������");
        car3.setSpeed(0);
        
        System.out.println("=================");
        System.out.println( "ȸ��� : " + car3.getCompany() );
        System.out.println( "�𵨸� : " + car3.getModel() );
        System.out.println( "���� : " + car3.getColor() );
        System.out.println( "�ְ�ӵ� : " + car3.getMaxSpeed() );
        System.out.println( "����ӵ�: " + car3.getSpeed() );
        
        
        
	}

}
