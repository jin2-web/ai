package javaBasic3;

public class Teacher {
  
	//멤버 필드, 필드  this로 가르킨다. 
	String 코드;
    String 이름;
    String 전공;
    int 급여;
    
    public String get코드() {
		return 코드;
	}

	public void set코드(String 코드) {
		this.코드 = 코드;
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public String get전공() {
		return 전공;
	}

	public void set전공(String 전공) {
		this.전공 = 전공;
	}

	public int get급여() {
		return 급여;
	}

	public void set급여(int 급여) {
		this.급여 = 급여;
	}

	public String get구분() {
		return 구분;
	}

	public void set구분(String 구분) {
		this.구분 = 구분;
	}

	public int get시수() {
		return 시수;
	}

	public void set시수(int 시수) {
		this.시수 = 시수;
	}

	String 구분;
    int 시수;
    
    //Teacher t1 = new Teacher("A32", "정현희", "컴공", 1000000, "전임", 20);
    public Teacher(String 교사코드, String 성함, String 전공명, int 급여, String 구분, int 시수) {
		this.코드 = 교사코드;
		this.이름 = 성함;
		this.전공 = 전공명;
		this.급여 = 급여;// 필드에 있는 급여변수를 가르켜 주고 싶다.  this 멤버 필드를 가르킨다. 
		this.구분 = 구분;
		this.시수 = 시수;
	}

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	int[]  성적처리하기(){
    	return null;
    }
    
    String[] 레포트검사하기(){
    	return null;
    }
    
    void 수업하기(){
    	
    }
    
    void 휴강하기() {
    	
    }
}
