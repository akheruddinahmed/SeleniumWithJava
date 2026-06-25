package toLearn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_fullScreenMethod {
	
	@Test
	public void test() throws InterruptedException {
				//Launch browser
				WebDriver driver=new ChromeDriver(); // mandatory 1st line of code
				
				//hard wait
				Thread.sleep(2000);
				
				//full sceen browser
				driver.manage().window().fullscreen();  // mandatory 2nd line of code
				
				//hard wait
				Thread.sleep(2000);
				
				
				// close browser
				driver.quit(); //last  mandatory  line of code
				
				

}

}
