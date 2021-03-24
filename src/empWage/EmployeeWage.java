package empWage;
public class EmployeeWage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constants
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int WAGE_PER_HR=20;

		//Variable
		int empHrs=0;
		double empCheck = Math.floor(Math.random() * 10)%3;
		if(empCheck == 1)
			empHrs=8;
		else if(empCheck == 2)
			empHrs=4;
		else
			empHrs=0;
		System.out.println("EmployeeWage : " + WAGE_PER_HR * empHrs);

	}

}