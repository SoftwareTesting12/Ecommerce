package ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meesho {
  @Test
  public void meeshoTest() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("Opening Meesho", true);
	  driver.get("https://www.meesho.com/");
	  Thread.sleep(3000);
	  driver.close();
  }
}
