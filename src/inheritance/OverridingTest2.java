package inheritance;
public class OverridingTest2 {
	public static void main(String args[]) {
		Customer vc = new VIPCustomer(10030, "나몰라", 2000); // VIP 고객 생성
		vc.bonusPoint = 1000;
																	// Customer의 calcPrice()가 아닌 VIPCustomer의 calcPrice()를 호출? ( -- 가상메서드)
		System.out.println(vc.getCustomerName() + "님이 지불할 금액은" + vc.calcPrice(10000) + "원 입니다.");
	}
	
}
