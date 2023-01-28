package EncapsulationDemo;

public class Employee {

	protected int empId;
	private String empName;
	private String dept;
	private long mobileNo;
	private String panCard;
	private String aadharCard;
	private String compName;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		//check
		this.empName = empName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		//OPT check	
		this.mobileNo = mobileNo;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public int getEmpId() {
		return empId;
	}

	public String getDept() {
		return dept;
	}

	public String getCompName() {
		return compName;
	}

}
