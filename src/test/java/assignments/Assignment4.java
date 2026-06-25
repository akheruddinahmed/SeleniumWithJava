package assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment4 {

	@Test
	public void test() {
				//1.Launch browser
				//create object for chrome driver class and store in WebDriver type (Upcasting)
				WebDriver driver=new ChromeDriver(); // mandatory 1st line of code
				
				//2.Navigate to application
				driver.get("https://demowebshop.tricentis.com/");
				
				//3.Capture the title
				String title=driver.getTitle();
				
				//print
				Reporter.log(title,true);
				
				//4.Close the browser using quit()
				driver.quit();
				
	}

}