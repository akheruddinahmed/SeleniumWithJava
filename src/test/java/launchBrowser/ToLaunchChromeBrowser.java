package launchBrowser;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchChromeBrowser {
	
	@Test
	public void test() {
		System.out.println("hii from TestNG");
		Reporter.log("hii from reporter print statement",true);
	} 
  
}
