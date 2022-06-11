package com.bridgelabz;

import java.util.Random;

public class EmployeeWages 
{
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();
		int attendance = random.nextInt(3); // generate random number 0,1,2

		int wagePerHour = 20;
		int fullDayHour = 8;
		int partTimeHours = 4;
		int wagePerDay = 0;

		switch (attendance) {
		case 0:
			System.out.println("Employee Absent ..");
			break;
		case 1:
			wagePerDay = partTimeHours * wagePerHour;
			break;
		default:
			wagePerDay = fullDayHour * wagePerHour;
		}

		System.out.println("Employee wage per Day: " + wagePerDay);
	}
}
