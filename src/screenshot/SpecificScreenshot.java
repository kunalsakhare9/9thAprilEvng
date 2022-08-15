package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SpecificScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\Desktop\\Velocity classes\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	
		
		//particular element screenshot
		  WebElement section = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img'] "));
		
		                      File src = section.getScreenshotAs(OutputType.FILE);
		                                  String random = RandomString.make(3);
		                                    File dest = new File("C:\\Users\\DELL\\Desktop\\Velocity classes\\Automation\\Selenium\\Screenshot\\Snapshot"+ random +".png");
                                         FileHandler.copy(src, dest); 
	}

}
