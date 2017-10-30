package ProgrammingChallenges3;
/**
 	ShiftSupervisor class extends Employee class
	Shift supervisor is a salaried employee who supervises a shift.
	In addition to a salary, the shift supervisor earns a yearly bonus when his or her shift meets
	production goals.
	This class have field to hold the annual salary and annual production bonus that a shift
	supervisor has earned
 */

public class ShiftSupervisor extends Employee {
	private double annualSalary;
	private double annualProductionBonus;
	
	public ShiftSupervisor(int shift){
		if(shift == 1){
			annualSalary = 15.00 * 2080;
			setAnnualSalary(annualSalary);
		}else if(shift == 2){
			annualSalary = (20.00 * 2080);
			setAnnualSalary(annualSalary);
		}
	}	
	
	public void setAnnualSalary(double annualSalary){
		this.annualSalary = annualSalary;
	}
	public double getAnnualSalary() {
		
		return annualSalary;
	}
	
	public double getAnnualProductionBonus() {
		annualProductionBonus = getAnnualSalary() * 0.1;
		return annualProductionBonus;
	}
	
	
}
