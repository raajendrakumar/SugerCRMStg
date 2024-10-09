package Ciber_PIC_Automation.Captiv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class rightClick {

	@Test
	public void actionsClass() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://Docs//Driver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		By locator = By.cssSelector(".context-menu-one");
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement rightClickElement = driver.findElement(locator);
		
		action.contextClick(rightClickElement).build().perform();
		WebElement getCopyText = driver.findElement(By.cssSelector(".context-menu-icon-copy"));

		String GetText = getCopyText.getText();
		
		System.out.println(GetText);
	
		driver.close();
	}
}
