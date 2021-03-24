package empWage;
public class empWage {

	public static void main(String[] args) {
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int WAGE_PER_HR=20;

		int empHrs=0;
		double empCheck = Math.floor(Math.random() * 10)%2;
		if(empCheck == 1)
			empHrs=8;
		else if(empCheck == 2)
			empHrs=4;
		else
			empHrs=0;
		System.out.println("EmployeeWage : " + WAGE_PER_HR * empHrs);

	}

}
