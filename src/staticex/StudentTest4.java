package staticex;

public class StudentTest4 {
	public static void main(String args[]) {
		
		// 스태틱메소드(클래스메소드) 테스트
		
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이지원");
	
		// private 값의 스태틱 변수 serialNum을 사용하는 getSerialNum() 메소드를 호출한다.
		System.out.println(Student2.getSerialNum());
		System.out.println(studentLee.studentName + " 학번 :" + studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("손수경");
		
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.studentName + " 학번 :" + studentSon.studentID);
	}
}
