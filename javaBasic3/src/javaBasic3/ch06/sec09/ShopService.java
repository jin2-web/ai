package javaBasic3.ch06.sec09;

public class ShopService {

	
	// ��Ʈ �̱��� �������� ShopServiceŬ������ ����� �ֽø� �˴ϴ�.
			// 1. �����ڴ� private�Դϴ�. 2. �ʵ�� ��üȭ�ؼ� �������� �ּҸ� �����ϰ� private�մϴ�.
			// 3. �޼ҵ��� getInstance()���� ���ϰ��� �������� �ּ��Դϴ�. ���������ڴ� public�Դϴ� 
	
	private static ShopService shopService = new ShopService(); 
	
	private ShopService() {
		// ������
	}
	
	public static ShopService getInstance() {
		return shopService;
	}
	
	class A { }
	
}
