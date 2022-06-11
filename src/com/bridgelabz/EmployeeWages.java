package com.bridgelabz;

import java.util.Random;

public class EmployeeWages 
{
	public static void main(String[] args)
    {

        Random random = new Random();
        int empPresent = random.nextInt(2); //0 or 1
        
        System.out.println("Random Value for Employee is \n:" +empPresent);
        if (empPresent == 0)
        {
            System.out.println("Employee is Absent");
        } else
        {
            System.out.println("Employee is Present");
        }
    }
}
