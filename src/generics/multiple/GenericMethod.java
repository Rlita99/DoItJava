package generics.multiple;

public class GenericMethod {	// 클래스가 generic 클래스가 아니어도 내부에 제네릭 메서드를 구현할 수 있다.
	// public <자료형 매개변수> 리턴타입 메서드이름(자료형 매개변수 ...) {}
	public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {	// static 메서드...?
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static void main(String args[]) {
		Point <Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
									// <Integer, Double> 생략 가능
		Point <Integer, Double> p2 = new Point<>(10, 10.0);
									// <> 안의 자료형 생략 가능 --> 컴파일러가 자동 유추
		double rect = GenericMethod.<Integer,Double>makeRectangle(p1, p2);
		System.out.println("사각형의 넓이는 " + rect + "입니다.");
	}
}
