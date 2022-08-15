package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\Desktop\\Velocity classes\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		                 ChromeDriver driver=new ChromeDriver();
		                 driver.get("https://vctcpune.com");
		        Thread.sleep(5000);
	// navigate: this method is use to open an application ,move forward, backward & refresh the webpage.
	  //  driver.navigate().to("https://www.facebook.com/");  
	  //   Thread.sleep(5000);
		//        driver.navigate().back();
		//        driver.navigate().forward();
		 //       driver.navigate().refresh();
		        
		           //getTitle:this method is use to get title of webpage .return type of getTitle method is string.
		                                  
		                                String title = driver.getTitle();
		                                System.out.println(driver.getTitle());
		                                System.out.println(title);
		                                
		    //getCurrentURL:this method is use to get URL of a webpage.return type of getCurrentURL method is String. 
		                                
		                                  String url =driver.getCurrentUrl();
		                                 System.out.println(url);
		          
		          
		          
		          
		          
	
	}

}
