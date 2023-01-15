package inheritance;

public class CutomerTest {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println(customerLee.calcPrice(10000));
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + ", 지불금액 : " + customerLee.calcPrice(price));
		System.out.println(customerKim.getCustomerName() + ", 지불금액 : " + customerKim.calcPrice(price));
		
		
	}
}
