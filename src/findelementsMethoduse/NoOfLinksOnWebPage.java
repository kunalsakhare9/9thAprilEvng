package findelementsMethoduse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Desktop\\Velocity classes\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
               WebDriver driver=new ChromeDriver();
               driver.get("https://vctcpune.com");
               Thread.sleep(1000);
                  List<WebElement> links = driver.findElements(By.tagName("a"));
             
                  System.out.println("Total No of links"+links.size());  //how many links
                  
                  //what are the links
                  
                  for(WebElement l:links)
                  {
                	  System.out.println(l.getText());
                  }
    
                   
	}

}
