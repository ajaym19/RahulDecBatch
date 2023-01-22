package AbstractionDemo;

public class HDFCBank implements IRBI {

	@Override
	public void depositMoney() {
		System.out.println("HDFC Deposit Money");
		
	}

	@Override
	public void withdrawMoney() {
		System.out.println("HDFC Withdraw Money");
		
	}

	@Override
	public void interestRates() {
		System.out.println("HDFC Interest Rate ==> 4%");
		
	}

	
}
