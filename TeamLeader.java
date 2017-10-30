package ProgrammingChallenges3;
/**
    Team Leader extends ProductionWorker class
  	Team Leader is an hourly paid production worker.
	In addition to hourly pay, team leaders earn a fixed monthly bonus.
	Team Leader required to attend a minimum number of hours of training per year.
	Team Leader should have fields for the monthly bonus amount, the require number
	of training hours, and the number of training hours that the team leader has to attended.
 */
public class TeamLeader extends ProductionWorker{
	private double montlyBonusAmount;
	private double numberTrainingHours;
	private int shift;
//	private double payRate;
	
	
	public TeamLeader(double numberTrainingHours, int shift){
		super(shift);
		this.numberTrainingHours = numberTrainingHours;
		System.out.println(shift);
		if(numberTrainingHours >= 20){
			if(shift == 1){
				montlyBonusAmount = super.getPayRate() * numberTrainingHours;
				setMontlyBonusAmount(montlyBonusAmount);
			}else if(shift == 2){
				System.out.println(getPayRate());
				montlyBonusAmount = super.getPayRate() * numberTrainingHours;
				setMontlyBonusAmount(montlyBonusAmount);
			}
		}
	}
	
//	public double getPayRate(){
//		return payRate;
//	}

	public double getMontlyBonusAmount() {
		return montlyBonusAmount;
	}

	public void setMontlyBonusAmount(double montlyBonusAmount) {
		this.montlyBonusAmount = montlyBonusAmount;
	}
	
	
}
