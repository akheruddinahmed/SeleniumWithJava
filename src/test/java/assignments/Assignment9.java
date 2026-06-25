package assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment9 {

	@Test
	public void test() throws InterruptedException {
				//1.Launch browser
				WebDriver driver=new ChromeDriver(); // mandatory 1st line of code
				
				//2.maximize browser
				driver.manage().window().maximize();
				
				//3.hard wait - wait 3 seconds
				Thread.sleep(3000);
				
				//4.minimize browser
				driver.manage().window().minimize();
				
				//5.hard wait - wait 3 seconds
				Thread.sleep(3000);
				
				//6.full screen browser
				driver.manage().window().fullscreen();
				
				//7.hard wait - wait 3 seconds
				Thread.sleep(3000);
				
				//8.Close the browser using quit()
				driver.quit();
				
	}

}
