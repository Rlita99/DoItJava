package inheritance;

public class VIPCustomer extends Customer {
	
	private int agentID;
	double saleRation;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRation = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}

}
