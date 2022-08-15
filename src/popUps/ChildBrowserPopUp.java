package popUps;


import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException 
	{    
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Desktop\\Velocity classes\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
               WebDriver driver=new ChromeDriver();
               driver.manage().window().maximize();
               driver.get("https://skpatro.github.io/demo/links/");
               Thread.sleep(1000);
                    driver.findElement(By.name("NewWindow")).click();
                    Thread.sleep(1000);
                    // to get single id(main page)-->
                          String idOfMainpage = driver.getWindowHandle();
                          System.out.println(idOfMainpage);
                          
                          // to get multiple ids-->
                              Set<String> idOfAllPages = driver.getWindowHandles();
                    
                    
                                    System.out.println(idOfAllPages);                             
	     // convert set into ArrayList
                                   ArrayList<String> al= new ArrayList<String>(idOfAllPages);
                                   String newidOfMainPage = al.get(0);
                                          String idOfChildPage = al.get(1);
                                           //switch focus from main page to child page
                                          driver.switchTo().window(idOfChildPage);
                                          driver.manage().window().maximize();
                                          
                                          driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Selenium");
                                          
                                          //driver.close();
                                          
                                          // to work on main page ,switch selenium focus from child page to main page 
                                        //  driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Selenium");
                                         // driver.quit();
                                          
                                         driver.switchTo().window(newidOfMainPage);
                                        String myText = driver.findElement(By.xpath("//p[contains(text(),'open link in new tab')]")).getText();
                                        
                                            System.out.println(myText);
                                          
                                          
                                           
	}

}
