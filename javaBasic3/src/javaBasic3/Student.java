package javaBasic3;


//�б��� ���� ���� �����
public class Student {
	
	String �й�;
	String �̸�;
	String �а�;
	int ����;
	String ��ȭ��ȣ;
	
	
   //Student st1 = new Student("230101", "ȫ�浿", "AI", 100, "010-123-1234" );
	
	public String get�й�() {
		return �й�;
	}

	public void set�й�(String �й�) {
		this.�й� = �й�;
	}

	public String get�̸�() {
		return �̸�;
	}

	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}

	public String get�а�() {
		return �а�;
	}

	public void set�а�(String �а�) {
		this.�а� = �а�;
	}

	public int get����() {
		return ����;
	}

	public void set����(int ����) {
		this.���� = ����;
	}

	public String get��ȭ��ȣ() {
		return ��ȭ��ȣ;
	}

	public void set��ȭ��ȣ(String ��ȭ��ȣ) {
		this.��ȭ��ȣ = ��ȭ��ȣ;
	}

	//������ == Ŭ���� �̸��� �Ȱ��� ��üȭ(���޸𸮿� �ö󰥋�)�ɶ� �ڵ����� ����ȴ�.  
	public Student(String �й�, String �̸�, String �а�, int ����, String ��ȭ��ȣ) {
 		 this.�й� = �й�;
		 this.�̸� = �̸�;
		 this.�а� = �а�;
		 this.���� = ����;
		 this.��ȭ��ȣ = ��ȭ��ȣ;
		 
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	//��������ϱ�
	int �������() {
		
		return 0;
	}
	
	void ��������ϱ�(){
		
	}
	
	void �Է��ϱ�(){
		
	}
   
	String ���бݴ����(){
		return "ȫ�浿";
	}
	
	boolean �հݿ��α��ϱ�(){
	   return true;	
	}
	
}




