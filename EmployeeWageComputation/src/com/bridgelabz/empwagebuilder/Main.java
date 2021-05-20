package com.bridgelabz.empwagebuilder;

public class Main {
	public static void main(String[] args) {
		EmpWageBuilderCase empwage = new EmpWageBuilderCase();
		int totalWage = empwage.totalEmployeeWage();
		System.out.println("Total Employee Wage: " + totalWage);
	}
}
