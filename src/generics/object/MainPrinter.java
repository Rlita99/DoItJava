package generics.object;

public class MainPrinter {
	public static void main(String args[]) {
		
		// 자료형 Object 사용시의 불편함
		ThreeDPrinterObject printer = new ThreeDPrinterObject();
		Powder p1 = new Powder();
		
		// 형변환이 자동으로 된다.
		printer.setMaterial(p1);
		
		// getMaterial은 반환이 Powder 형이 아니라 Object 형이기 때문에 항상 형 변환을 해주어야한다.
		Powder p2 = (Powder)printer.getMaterial();
	}
}
