package assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment3 {

	@Test
	public void test() throws InterruptedException {
				//1.Launch browser
				//create object for chrome driver class and store in WebDriver type (Upcasting)
				WebDriver driver=new ChromeDriver(); // mandatory 1st line of code
				
				//2.Navigate to application
				driver.get("https://demowebshop.tricentis.com/");
				
				//3.hard wait - wait 3 seconds
				Thread.sleep(3000);
				
				//4.Close the browser using quit()
				driver.quit(); // close all the window
				
	}

}
