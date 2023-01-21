package InheritanceDemo;

public class MethodOverloadingDemo {
	
	/*
	 * Method Overloading
	 * methods with same name but with different signatures
	 * 
	 * Can be achieved in 2 ways
	 * 1. By different no of parameters
	 * 2. By different data types
	 * 
	 * Note: By changing Return Type: Not possible
	 */

	public static void main(String[] args) {
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.sum(1, 20);
		obj.sum(12, 13, 14);
		obj.sum(23.5f, 12.6f);
		obj.m1();
	}
	
	public void sum(int num1, int num2) {
		System.out.println("Adding 2 int numbers");
	}
	

	
	public void sum(float a, float b) {
		System.out.println("Adding 2 float numbers");
	}
	
	public void sum(int num1, int num2, int num3) {
		System.out.println("Adding 3 int numbers");
	}
	
	
	
	public void m1() {
		
	}
	
	
}
