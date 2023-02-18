package staticex;

public class Student2 {
	// static 변수를 사용하는 static 메소드 (= 클래스 메소드) 생성 (getSerialNum(), setSerialNum())
	
	// public -> private 변수로 변경
	private static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		// 지역변수는 사용이 가능하다.
		int i = 10;
		// 클래스 메서드 내부에서는 인스턴스에서 사용하는 변수를 사용할 수 없다.
		//studentName = "뇨럐"; //-- 에러
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
