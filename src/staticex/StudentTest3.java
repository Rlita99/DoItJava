package staticex;

public class StudentTest3 {
	public static void main(String args[]) {
		
		// 스태틱 변수는 인스턴스보다 먼저 생성되므로 클래스 이름으로도 참조하여 사용할 수 있다.
		// 스태틱 변수는 클래스 변수 라고도 불린다.
		// 보통은 클래스 이름으로 참조하여 많이 쓰인다.
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		//System.out.println(studentLee.serialNum);
		System.out.println(Student1.serialNum);
		System.out.println(studentLee.studentName + " 학번 :" + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		//System.out.println(studentSon.serialNum);
		System.out.println(Student1.serialNum);
		System.out.println(studentSon.studentName + " 학번 :" + studentSon.studentID);
	}
}
