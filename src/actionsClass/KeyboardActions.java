package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Desktop\\Velocity classes\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
               WebDriver driver=new ChromeDriver();
               driver.manage().window().maximize();
               
               driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
               
               
              Thread.sleep(1000);
              //1.Create object of Actions class
              Actions act=new Actions(driver);
              
              //2.Find Element
              
             WebElement day = driver.findElement(By.id("day"));
             //3.Take required actions
             act.click(day).perform();
             Thread.sleep(1000);
             for(int i=1;i<=4;i++)
             {
            	 act.sendKeys(Keys.ARROW_UP).perform();
            	 Thread.sleep(1000);
             }
             
             act.sendKeys(Keys.ENTER).perform();
              

	}

}
