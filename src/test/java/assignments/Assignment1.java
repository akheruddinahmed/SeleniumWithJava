package assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment1 {

	@Test
	public void test() {
				//1.Launch browser
				//create object for chrome driver class and store in WebDriver type (Upcasting)
				WebDriver driver=new ChromeDriver(); // mandatory 1st line of code
				
				//2.print chrome browser launched in console
				System.out.println("Chrome browser launched");
				
	}

}
