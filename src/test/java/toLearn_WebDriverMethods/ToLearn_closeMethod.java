package toLearn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearn_closeMethod {
	
	
	@Test
	public void test() {
				//1.Launch browser
				//create object for chrome driver class and store in WebDriver type (Upcasting)
				WebDriver driver=new ChromeDriver(); // mandatory 1st line of code
				
				//2.Navigate to url
				
				driver.get("https://www.zomato.com/");
				
				//3.Close the browser
				driver.close(); // mandatory last line of code
				
	}

}
