package InheritanceDemo;

public class Staff extends SchoolBase {


	public void preparingMonthlyReport() {
		
	}
	
	public void submitExpenseReport() {
		System.out.println(Math.PI);
	}
	
	@Override
	public void lunchBreak() {
		System.out.println("Break from 11am to 12 pm");
	}

}
