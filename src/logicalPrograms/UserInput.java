package logicalPrograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
	     Scanner sc=new Scanner(System.in);
	     //String int float char
	     System.out.println("Please enter 1st number");
	     int number1=sc.nextInt();
	     System.out.println("Please enter 2nd number");
	     int number2=sc.nextInt();
	     
	     int sum=number1+number2;
	     System.out.println("Addition of two number is "+sum);
	     
	     System.out.println("Please enter your name");
	     
	     String name = sc.next();
	     System.out.println("You entered name as "+name);

	}

}
