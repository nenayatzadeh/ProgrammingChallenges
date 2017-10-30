package ProgrammingChallenges3;
/**
	ProductionWorker class that extends the employee class, and have field to hold
	Shift (an integer)
	Hourly Pay rate (a double)
	Work day is divided into two shift:day(Shift 1) and night (Shift 2)
 */

public class ProductionWorker extends Employee {
	private int shift;
	public double payRate;
	
	public ProductionWorker(){
		shift = 0;
		payRate = 0.0;
	}
	
	public ProductionWorker(int shift){
		this.shift = shift;
		if (shift == 1){
			setPayRate(15.00);
		}else if(shift == 2){
			setPayRate(20.0);
		}	
	}
	public int getShift() {
		return shift;
	}
	
	public void setPayRate(double parRate){
		this.payRate = payRate;
	}
	public double getPayRate() {
		return payRate;
	}
	
}
