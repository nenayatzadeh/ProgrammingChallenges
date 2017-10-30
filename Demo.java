package ProgrammingChallenges3;

import java.util.Scanner;
import java.util.Random;
public class Demo {
	public static void main(String[] args){
		int shift;
		String type = "";
		String hireDate;
		String employeeID;
		double employeeTrainAttend;
		
		
		Scanner key = new Scanner(System.in);
		Random rand = new Random();
		
		//Generate positive number
		int number = rand.nextInt(Integer.MAX_VALUE);
		
		//Convert Integer to String
		employeeID = Integer.toString(number);
		
		//Asking questions from user 
		System.out.println("What is the shift: ");
		shift = key.nextInt();
		System.out.println("What is the employee type: ");
		type = key.next();
		System.out.println("Employee hire date: ");
		hireDate = key.next();
		System.out.println("How many hours empoly attend to the traning");
		employeeTrainAttend = key.nextDouble();
		
		//Set up all entry information
		Employee employeeObj = new Employee(type,employeeID,hireDate);

						
		//Print all information from one employee
		System.out.println("Employee with: " + employeeObj.getNumber() + " Employee ID Number");
		System.out.println("Employee Type: " + employeeObj.getType());
		System.out.println("Hiring Date: " + employeeObj.getHireDate());
						
		if(type.equals("Supervisor")){
			//Create object from ShiftSupervisor class
			ShiftSupervisor supervisorObj = new ShiftSupervisor(shift);
			if(shift == 1){
				System.out.println("Supervisor Annual Salary: $" + supervisorObj.getAnnualSalary());
				System.out.println("Supervisor Annual Production Bonus: $" + supervisorObj.getAnnualProductionBonus());
			}else{
				System.out.println("Supervisor Annual Salary: $" + supervisorObj.getAnnualSalary());
				System.out.println("Supervisor Annual Production Bonus: $" + supervisorObj.getAnnualProductionBonus());
			}
		}else if(type.equals("TeamLeader")){
			System.out.println("hiiii");
			//Create Object from TeamLeader class
			TeamLeader teamObj = new TeamLeader(employeeTrainAttend,shift);
			System.out.println(teamObj.getMontlyBonusAmount());		
		}
			
	}
}
