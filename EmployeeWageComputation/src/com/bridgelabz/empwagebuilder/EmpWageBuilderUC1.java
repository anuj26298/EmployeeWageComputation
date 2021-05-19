package com.bridgelabz.empwagebuilder;

public class EmpWageBuilderUC1 {
	public static void main(String[] args) {
		
		//Constant
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		
		// Variables
		int empHrs = 0;
		int empWage = 0;
		//UC1
		// Computation
		double empCheck = Math.floor(Math.random() * 10 ) % 3;
		// checking for part time work
		if (empCheck == IS_PART_TIME) { 
			System.out.println("Employee worked part-time");
			empHrs = 4;
		}
		else if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
			empHrs = 8;
		}
		else {
			System.out.println("Employee is Absent");
			empHrs = 0;
		}	
		// UC2
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("EmpWage: " + empWage);
		
		//UC3
		
	}
}

	