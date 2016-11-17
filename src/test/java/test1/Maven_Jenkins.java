package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Maven_Jenkins {
	WebDriver  driver =new FirefoxDriver();
	@Test
	
	public void  t1(){
		driver.get("http://www.bn.com");
		
		driver.close();
		
		
	}

}
