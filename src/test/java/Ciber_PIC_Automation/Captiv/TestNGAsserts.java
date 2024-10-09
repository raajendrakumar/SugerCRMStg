package Ciber_PIC_Automation.Captiv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAsserts {
	@Test
	public void testNGAsserts() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C://Docs//Driver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// Test Condition 1: If Page title matches with actualTitle then it finds email
		// title and enters the value which we pass
		driver.get("https://www.gmail.com");
		String actualTitle = "Gmail";
		Assert.assertEquals(driver.getTitle(), actualTitle);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("SoftwareTestingMaterial.com");
		// Test Condition 2: If page title didnt match with actualTitle then script
		// throws an exception
		Thread.sleep(2000);
		driver.get("https://www.gmail.com");
		actualTitle = "GoogleMail";
		Thread.sleep(2000);
		// Assert.assertEquals(driver.getTitle(), actualTitle, "Title not matched");
		Assert.assertEquals(driver.getTitle(), actualTitle);

		System.out.println(driver.getTitle());
	}
}