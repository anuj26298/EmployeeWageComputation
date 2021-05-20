package com.bridgelabz.empwagebuilder;

public class EmpWageBuilderCase {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_PER_MONTH = 100;


	public int totalEmployeeWage() {
		//variables
		int empHrs = 0;
		int totalWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		//Computation

		while(totalEmpHrs<=MAX_HRS_PER_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
		{

			totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch(empCheck)
			{
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
		}

		totalWage = totalEmpHrs * EMP_RATE_PER_HOUR;

		return totalWage;
	}
}
