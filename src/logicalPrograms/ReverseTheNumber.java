  package logicalPrograms;

public class ReverseTheNumber {

	public static void main(String[] args) 
	{
		//number=1234...>4321
		int number=6789;
		
		String s = Integer.toString(number);
		
              String r = ""   ;
              for(int i=s.length()-1;i>=0;i--)
              {
            	  r=r+s.charAt(i);
              }
              
                  int revNumber = Integer.parseInt(r);
                  System.out.println("Original number is"+number);
                  
                  System.out.println("Reverse number is"+revNumber);
                  
	}

}
