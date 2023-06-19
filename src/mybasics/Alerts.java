package mybasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alerts {
	public WebDriver driver;
	
	
	
	
  @Test
  public void handlingalerts() throws Exception {
	  //click me
	  driver.findElement(By.id("alertButton")).click();
	  Thread.sleep(3000);
	  
	  driver.switchTo().alert().accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  @BeforeTest
  public void openurl() throws Exception {
	  //System.setProperty("webdriver.chrome.driver", "F:\\MANHA 4E GES\\WORKSPACE SELE\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  driver.manage().window().maximize();
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
