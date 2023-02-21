package generics.multiple;


 // x와 y는 정수일수도, 실수 일수도 있으므로 generic을 이용하여 제네릭 클래스를 구현한다.
public class Point<T, V> {
	T x;
	V y;
	
	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	
	// 제네릭 메서드의 일반 형식
	// public <자료형매개변수> 반환형 메서드이름(자료형매개변수 ...) {
	//	}
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
}
