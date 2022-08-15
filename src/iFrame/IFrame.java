package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\Desktop\\Velocity classes\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst "); //selenium focus default on main page 
        //we need to switch selenium focus from main page to frame
        
        Thread.sleep(2000);
            driver.switchTo().frame("iframeResult"); // this point will change focus from main page to iframe
            Thread.sleep(2000);
            //this element is present in I frame
            driver.findElement(By.xpath("//button[contains(text(),' Date and Time.')]")).click();
            
              driver.switchTo().defaultContent();
              
              driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
              
        
	}

}
