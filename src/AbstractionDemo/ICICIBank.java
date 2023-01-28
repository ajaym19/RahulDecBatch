package AbstractionDemo;

public class ICICIBank extends AbstractParentClass implements IRBI, ISEBI {

	@Override
	public void depositMoney() {
		System.out.println("ICICI Deposit Money");
		
	}

	@Override
	public void withdrawMoney() {
		System.out.println("ICICI Withdraw Money");
		
	}

	@Override
	public void interestRates() {
		System.out.println("ICICI Interest Rate ==> 4.5%");
		
	}
	
	public void m1() {
		
	}

	@Override
	public void intraDayTrading() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void regularTrading() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void futureTrading() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void optionsTrading() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notification() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDepositRates() {
		// TODO Auto-generated method stub
		
	}

	
}
