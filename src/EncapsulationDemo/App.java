package EncapsulationDemo;

public class App {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.getEmpId());
		// emp.setDept("FraudDept");
		System.out.println(emp.getDept());
	}
}
