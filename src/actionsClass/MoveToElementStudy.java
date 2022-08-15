package actionsClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MoveToElementStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Desktop\\Velocity classes\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
               WebDriver driver=new ChromeDriver();
               driver.manage().window().maximize();
               
               driver.get("https://vctcpune.com/selenium/practice.html");
               
               Thread.sleep(1000);
               //1. to take actions,need to create object of Actions class & pass webDriver object as parameter
               
               Actions act=new Actions(driver);
               
               //findElement to be act
                   WebElement Aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
                   
                   //now take action & perform
                   
                       act.moveToElement(Aboutus).perform();
                       
                    //   Aboutus.click();  //using WebElement Method
                       
                       //click method using action class
                       
                       act.click().perform();
                       
                       //i want to click on click radio button
                       
                             WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
                             
                               act.moveToElement(radio1).click().build().perform();
                               
                       
                       
                       
                       
               
		      
		
		
		
	}

}
