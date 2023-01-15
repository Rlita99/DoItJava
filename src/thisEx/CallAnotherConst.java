package thisEx;

class Person {
	String name;
	int age;
	int test;
	
	
	// 매개변수를 가진 생성자
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 생성자에서 다른 생성자를 호출하는 this
	// 디폴트 생성자
	Person() {
		// this를 사용해 Person(String, int) 생성자 호출
		// -- this 가 Person(String, int) 생성자를 지칭하는지 어떻게 알지??
		this("이름없음", 1);
	}
	
	// 자신의 주소를 반환하는 this
	Person returnItSelf() {
		return this;
	}
}


public class CallAnotherConst {
	public static void main(String[] args) {
		
		// Person 자료형의 변수 noName 형을 선언하고 생성자 Person을 호출하여 대입
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		// -- 얘는 뭐하는 짓인지 .. ㅜㅜ
		// Person 자료형의 변수 p를 선언하고 ???????????????????
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}

}
