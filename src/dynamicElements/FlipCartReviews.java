package dynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartReviews {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Desktop\\Velocity classes\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
               WebDriver driver=new ChromeDriver();
               driver.manage().window().maximize();
               driver.get("https://www.flipkart.com/");
               Thread.sleep(1000);
                driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
                
                //send keys in search bar
                driver.findElement(By.name("q")).sendKeys("i phone 13");
                // click on search 
                
               driver.findElement(By.xpath("//button[@type='submit']")).click();
               Thread.sleep(2000);
                  WebElement review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
                          System.out.println("Review for this phone is" + review.getText()); 
                          
                          
               
 

	}

}
