package findelementsMethoduse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Desktop\\Velocity classes\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
               WebDriver driver=new ChromeDriver();
               driver.manage().window().maximize();
               driver.get("https://www.google.co.in/");
               Thread.sleep(1000);
              driver.findElement(By.name("q")).sendKeys("Honda");
              List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
              Thread.sleep(2000);
              System.out.println(result.size());
              for(WebElement r:result)// to see list in console
              {
            	  System.out.println(r.getText());
              }
              for(WebElement r:result) // to click on specific item--->honda amaze 
              {
            	                   String exceptedResult = "honda amaze";
            	                           String actualText = r.getText();
            	                           
            	                           if(actualText.equals(exceptedResult))
            	                           {
            	                        	   r.click();
            	                        	   break;
            	                           }
            	                   
              }
                driver.findElement(By.linkText("Images")).click()  ;
	
                
              
          
                  
              
                  
	}

}
