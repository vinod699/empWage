package empWage;
public class empWage {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int WAGE_PER_HR=20;
	public static final int NUM_OF_WORKING_DAYS=2;
	public static final int MAX_HRS_IN_MONTH=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10)%3;
			switch(empCheck) {
			case IS_PART_TIME:
				empHrs=4;
				break;
			case IS_FULL_TIME:
				empHrs=8;
				break;
			default:
				empHrs=0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#:" +totalWorkingDays + "Emp Hr: " +empHrs);
		}
		int totalEmpWage=totalEmpHrs*WAGE_PER_HR;
		System.out.println("Total Employee Wage : "+ totalEmpWage);
	}
}