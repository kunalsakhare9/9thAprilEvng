package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Desktop\\Velocity classes\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
               WebDriver driver=new ChromeDriver();
               driver.manage().window().maximize();
               
               driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
               
             Thread.sleep(1000);
                 //how to find no of rows 
                 
                             List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@id='product']//tr"));
                            
                             
                             
                            System.out.println(" No of Rows in table are "+ noOfRows.size());
             //How to find no of Coloumns
                            
                           List<WebElement> noOfColoumns = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
                            
                        System.out.println("No of columns in table are "+ noOfColoumns.size());  //To print header in table
                        
                        
                        for(WebElement c:noOfColoumns)
                        { System.out.println(c.getText()+ " || ");
                        	
                        }
                        for(WebElement r:noOfRows)
                        {
                        	System.out.println(r.getText()+" || ");
                        	
                        }System.out.println();
                        
                        
	}

}
