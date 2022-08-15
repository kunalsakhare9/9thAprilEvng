package logicalPrograms;

import java.util.Scanner;

import org.checkerframework.checker.units.qual.Length;

public class ReverseString {

	public static void main(String[] args) 
	{
		//String s="Velocity";
		//                  yticoleV
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter string");
		    
		            String s = sc.next();
		            String r = "";
		            
		            for(int i=s.length()-1;i>=0;i--)//765...0
		            {
		            	r=r+s.charAt(i);
		            	//y=""+y;
		            	//yt=y+t;
		            	//r=ytcolev
		            	
		            }
		            	System.out.println("Reverse string is "+r);
		            
		            
		
		
	}

	
	

}
