package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEg1 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\Desktop\\Velocity classes\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/ ");
        Thread.sleep(2000);
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                           File dest = new File("C:\\Users\\DELL\\Desktop\\Velocity classes\\Automation\\Selenium\\Screenshot\\Snapshot.png");        
         FileHandler.copy(src, dest);

	}

}
