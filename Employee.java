package ProgrammingChallenges3;
/**
	This class should keep the following information in fields:
	Employee type, 
	Employee number in the format XXX-L which X is digit rang 0-9, L is a letter in rang A-M,
	Hire date
 */

public class Employee {
	private String type;
	private String number;
	private String hireDate;
	
	public Employee(){
		type = "";
		number = "";
		hireDate = "";
	}
	
	public Employee(String type, String number, String hireDate){
		this.type = type;
		this.number = number;
		this.hireDate = hireDate;
	}
	
	public String getType() {
		return type;
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getHireDate() {
		return hireDate;
	}
	
	
}
