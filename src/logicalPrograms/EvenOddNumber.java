package logicalPrograms;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) 
	{  
	//	  int a=10;
		
	//	  int b=4;
	//	  System.out.println(a/b);

		
	//	System.out.println(a%b);
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("Please enter number");
		 
		 int number=sc.nextInt();
		 if(number%2==0)
		 {
			 System.out.println("Given number is even");
		 }
		 else{
			 {
				 System.out.println("Given number is odd");
			 }
		 }
	}

}
