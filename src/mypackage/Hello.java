package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {
	public WebDriver driver;
	
	public void Open_url() {
		driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello obj=new Hello();
		obj.Open_url();

	}

}
