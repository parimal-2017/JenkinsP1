package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void contactTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
	}

}
