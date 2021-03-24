package empWage;
public class empWage {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int WAGE_PER_HR=20;
	public static final int NUM_OF_WORKING_DAYS=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable
		int empHrs=0,totalEmpWage=0,empWage=0;
		for(int day=0;day<NUM_OF_WORKING_DAYS;day++) {
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
		empWage=empHrs*WAGE_PER_HR;
		totalEmpWage += empWage;
		System.out.println("Employee Wage : " + empWage );
	}
	System.out.println("Total Employee Wage : "+ totalEmpWage);
}
}