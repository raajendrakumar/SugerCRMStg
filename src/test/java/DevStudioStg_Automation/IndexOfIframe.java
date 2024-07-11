package DevStudioStg_Automation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.bson.assertions.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IndexOfIframe {
	public static WebDriver driver;

	@Test
	public void doubleClick() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://Docs//Driver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        driver.manage().window().maximize();
        //2) Get the current window's handle and write to the console window. It must be first window handle.
        System.out.println("Current Window Handle: " + driver.getWindowHandle() + "\n");
        //Switch to iframeResult iframe because all elements located in this iframe
        driver.switchTo().frame("iframeResult");
        //3) Locate the link and click it
        WebElement visitLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
        visitLink.click();
        //4) Get all window handles and hold them in a list.
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandlesList = new ArrayList<>(windowHandles); //Set to List Conversion
        //5) Write to total window handle number to the console.
        System.out.println("Total window number: " + windowHandlesList.size() + "\n");
        //6) Switch to second window
        driver.switchTo().window(windowHandlesList.get(1));
        //7) Get the current window's handle and write to the console window. It must be second window handle.
        System.out.println("Current Window Handle: " + driver.getWindowHandle() + "\n");
        //8) Check the upper left side logo
        WebElement logo = driver.findElement(By.cssSelector(".fa.fa-logo"));
      //  Assertions.assertTrue(logo.isDisplayed());
        //9) Go back (Switch) to first window
        driver.switchTo().window(windowHandlesList.get(0));
        //10) Get the current window's handle and write to the console window. It must be first window handle.
        System.out.println("Current Window Handle: " + driver.getWindowHandle() + "\n");
        //11) Check the Run Button Text
        WebElement seeResultButton = driver.findElement(By.cssSelector("button[onclick*='submitTryit(1)'"));
      //  Assertions.assertTrue(seeResultButton.getText().contains("Run ❯"));
    }
}