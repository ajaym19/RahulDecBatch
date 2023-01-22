package AbstractionDemo;

public class App {

	public static void main(String[] args) {
		//can I create an object of Interface
		//IRBI rbi = new IRBI(); //cannot create
		
		HDFCBank hdfc = new HDFCBank();
		hdfc.depositMoney();
		hdfc.interestRates();
		
		ICICIBank icici = new ICICIBank();
		icici.depositMoney();
		icici.interestRates();
		icici.getCrisilRating();
		
		//cannot create abstract class
	//	AbstractParentClass abs = new AbstractParentClass();
		
	}
}
