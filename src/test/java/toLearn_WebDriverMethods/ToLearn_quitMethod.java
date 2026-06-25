package toLearn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_quitMethod {
	
	
	@Test
	public void test() throws InterruptedException {
				//1.Launch browser
				//create object for chrome driver class and store in WebDriver type (Upcasting)
				WebDriver driver=new ChromeDriver(); // mandatory 1st line of code
				
				//2.Navigate to url
				
				driver.get("https://demowebshop.tricentis.com/");
				
				//hard wait
				Thread.sleep(7000);
				
				//3.Close the browser using quit()
				driver.quit(); // close all the window
				//driver.close(); // close only the parent application window
				
				
	}

}
