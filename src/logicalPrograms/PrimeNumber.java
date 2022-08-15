package logicalPrograms;

public class PrimeNumber {

	public static void main(String[] args)
	{
	 //11 2--10
		
		int num=14;
		int counter=0;
		for(int i=2;i<num;i++)   //2
		{
			if(num%i==0)  //0 
			{
				counter++;//1
				break;
				
				
			}
			
		}

		if(counter==1)
		{
			System.out.println("Given number is Not a prime number");
		}
		else
		{
			System.out.println("Given number is prime");
		}
		
	}

}
