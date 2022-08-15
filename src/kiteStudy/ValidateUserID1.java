package kiteStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUserID1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Desktop\\Velocity classes\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
               WebDriver driver=new ChromeDriver();
               driver.manage().window().maximize();
               driver.get("https://kite.zerodha.com/");
               Thread.sleep(1000);
		
               WebElement UserID = driver.findElement(By.id("userid"));
               
		        WebElement Password = driver.findElement(By.id("password"));
		        
		        WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		        
		        UserID.sendKeys("ELR321");
		        Password.sendKeys("Dhana1111");
		        LoginButton.click();
		        
		        
		        
		        
		
	}

}
