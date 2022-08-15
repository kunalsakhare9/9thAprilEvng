package logicalPrograms;

public class WhiteSpacesFormString {

	public static void main(String[] args)
	{
		      String s = "My name is";
		      
                 int counter = 0;
                 for(int i=0;i<=s.length()-1;i++)
                 {
                	 char blank=s.charAt(i);
                	 if(blank==' ')
                	 {
                		 counter++;
                	 }
                	 
                	 
                 }
                 System.out.println("Number of blank space in "+s+"is"+ counter );
	}

}
