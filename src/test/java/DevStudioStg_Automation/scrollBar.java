package DevStudioStg_Automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class scrollBar {
	public static WebDriver driver;

	@Test
	public void doubleClick() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://Docs//Driver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// launch the website
		driver.get("https://www.geeksforgeeks.org/");

		// Maximize the screen
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Stating the Javascript Executor driver
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll to bottom of page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}
