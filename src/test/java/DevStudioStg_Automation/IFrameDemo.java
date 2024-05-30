package DevStudioStg_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IFrameDemo {
	public static WebDriver driver;

	@Test
	public void doubleClick() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://Docs//Driver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// Navigate to URL
		driver.get("https://demoqa.com/nestedframes");

		// Locate the webelement page heading
		WebElement pageHeadingElement = driver.findElement(By.xpath("//div[@class='main-header']"));

		// Find text of the page heading
		String pageHeading = pageHeadingElement.getText();

		// Print the page heading
		System.out.println("Page Heading is :" + pageHeading);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", "");
		// Switch to Parent iframe
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		WebElement frame1Element = driver.findElement(By.tagName("body"));
		String frame1Text = frame1Element.getText();
		System.out.println("Frame1 is :" + frame1Text);

		// Switch to child frame
		driver.switchTo().frame(0);
		WebElement frame2Element = driver.findElement(By.tagName("p"));
		String frame2Text = frame2Element.getText();
		System.out.println("Frame2 is :" + frame1Text);

		// Try to print the heading of the main page without swithcing
		WebElement mainPageText = driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/div[1]/text()"));
		System.out.println(mainPageText);
		driver.close();
	}
}
