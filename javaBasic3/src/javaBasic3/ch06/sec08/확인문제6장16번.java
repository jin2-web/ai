package javaBasic3.ch06.sec08;

public class Ȯ�ι���6��16�� {

	public static void main(String[] args) {
		
		Printer printer = new Printer();//Printer Ŭ������ ��ü �����Ѵ�.
		
		printer.println(10);// ����������.�޼ҵ� 
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
		
		Printer1.println(10); //Ŭ������.�޼ҵ�  static �޼ҵ� 
		Printer1.println(true); // Ŭ�����δ��ܰ迡�� ���ø޸� �޼ҵ念���� �ڵ����� �ö󰣴�. 
		Printer1.println(5.7);
		Printer1.println("ȫ�浿");
		

	}

}
