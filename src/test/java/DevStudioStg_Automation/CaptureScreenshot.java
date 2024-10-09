package DevStudioStg_Automation;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CaptureScreenshot {

	@Test
	public static void captureScreenMethod() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C://Docs//Driver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingmaterial.com/capture-screenshot-using-selenium-webdriver");
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Docs\\PIC Documents\\SoftwareTestingMaterial.png"));
		driver.close();
		driver.quit();
	}
}
