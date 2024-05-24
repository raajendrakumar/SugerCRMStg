package DevStudioStg_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateProspect {
	private static String UTILS = "Utils";
	public static WebElement webelement;
	public static List<WebElement> webelements = null;
	public static WebDriver driver = null;
	public static int defaultBrowserTimeOut = 30;
	public static List<String> windowHandlers;
	public static final String usernametxtfld = "//input[@id='txtUserID']";
	public static final String passwordfld = "//input[@id='txtPassword']";
	public static final String signinbtn = "//button[@id='sub']";
	public static final String lchdpdn = "//a[@title='Launch portal']";

	public static final String prsch = "//input[@name='$PpyDisplayHarness$ppySearchText']";
	public static final String home = "//ul[contains(@class,'headerTabsList Temporary_top_tabsList')]//li[@id='Tab1']//span[@id='TABSPAN']";
	public static final String ovr = "//a[contains(text(),'Overview (Generate Pricing)')]";
	public static final String prschicn = "//div[contains(@class,'content layout-content-inline')]";
	public static final String prtsch = "//span[text()='Search']";
	public static final String print = "//span[@class='primary_search_white']//input[1]";
	public static final String casetype = "//select[@class='standard']";

	public static final String username = "Samrat_QA";
	public static final String password = "rules";
	public static final String caStatus = "Regularisation of casual workers";
	public static final String addNames = "Private Org";
	public static final String prid = "PR-87848";

	@Test
	public static void createStgProspect() throws UnknownHostException, InterruptedException, AWTException {
		startBrowser("firefox");
		driver.manage().window().maximize();
		String url = "https://captv-stg1.pegacloud.io/prweb/app/PIC/xbHu3hfavxTLkEni2dIEKW87dKzQq6k8*/!STANDARD?pzuiactionrrr=CXtpbn0vMnMwNHlUb0YwMHJldjl3R0t4QUZGVDlJSWFlcnBMYTdkUVUrbHlxazV2MDhtZndDU1FxTDZrTlI2KytTbEpERThZT2t6MnYrbTRMaGU2MXBWVGcvR0NjWVpubC9MbEdHS0RuT0ZyZXp4a21jSUJNZlhtcHo3eTlvallrVS85ZjAzYXdKUVFSK0I1dkExa0Q0aU95OXE1WVNUTEs5U1ZyMkZoYlRtVHlvQ1kwcENVU2JLa3RzaVhCTmU0ZUlDZHlYTldFcXVseGJKTXdXQ3Q3bFp5bWRaUnF5Yzk0YlgwYWZ2WHZhWTBDV0ovQm9TWlZWYTRoTUxyMXNUSnU4Q3BBMXpHUUFtNU9ibWw2dkZhSVplb3BzWU8rakIxK1IxYjIyN2ZkY2x0Mk1FQjgvUE0rME1IMjdJSUNNZUVxa013RWM4V3JldjNoUnNlWm4xWTZWdFdYVStXc0hSeFN6KzFWbUxoelF3NCt3bVhQY09tSDZ0MHVNQjdPU3FCaXhISXZ1L0hhd2QxRE5rUEtNdks2amVkdVlqUjJsd0x5Ti90Q2hFcVVXMmE4aGJmN1kvUkcxSWg5RXcyRjBPTU9EMXJPUDUrYldudlp1Rm9pa3Q5Y2o2bmQycFBWekFreVNGUkVDUWk3YVg0bUVOMEtVUE9rajBQUjhWVXN6eHk2NEgwYlFFRGE0SVNabTl6T1dLK3p3SDRvUmJONHVIdmxBOTZUcTRpTWFiNWlqbkpWKzl0cHJ2eVF2SlowSlk0SUNUbVhLenA4Q244c3dHbmFqMHN2RTV1ZlZubVBPY0o2LzQ1ZU5kSEpJSXJ0RVBEK0U1ZDlINHBOamtRalVJa1BxeGRK*&pzPostData=-1446478408";
		driver.get(url);
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		Robot rb = new Robot();

		WebElement owausername = driver.findElement(By.xpath(usernametxtfld));
		owausername.sendKeys(username);
		Thread.sleep(2000);
		WebElement owapasswd = driver.findElement(By.xpath(passwordfld));
		owapasswd.sendKeys(password);
		Thread.sleep(2000);
		WebElement signin = driver.findElement(By.xpath(signinbtn));
		signin.click();
		Thread.sleep(3000);
		WebElement hm = driver.findElement(By.xpath(home));
		hm.click();

		WebElement srcField = driver.findElement(By.xpath(prsch));

		insertTextIntoTextField(srcField, MPSUPropertyFileRead.FileRead("ProjectData.properties", "ProspectID"));
		System.out.println("Prospect searching fld");
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 10); // 10-second explicit wait
		try {

			// Wait until the element is present and visible
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ovr)));

			// Perform actions on the element
			element.click();
		} catch (NoSuchElementException e) {
			System.out.println("Element not found: " + e.getMessage());
		} finally {
			//driver.quit();
		}

		/*
		 * WebElement ovw = driver.findElement(By.xpath(ovr));
		 * actions.moveToElement(ovw).click().perform();
		 */
	}

	public static WebDriver startBrowser(String browserName) throws UnknownHostException {

		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C://Docs//Driver//geckodriver.exe");

			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("iexplorer")) {
			System.setProperty("webdriver.ie.driver", UTILS + "\\IEDriverServer.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability("ignoreZoomSetting", true);
			driver = new InternetExplorerDriver(capabilities);
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", UTILS + "\\chromedriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			driver = new ChromeDriver(capabilities);
		}
		driver.manage().timeouts().implicitlyWait(defaultBrowserTimeOut, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		if (browserName.equalsIgnoreCase("iexplorer"))
			SwitchAlert();

		if (windowHandlers == null)
			windowHandlers = new LinkedList<String>();
		else
			windowHandlers.clear();

		windowHandlers.add(driver.getWindowHandle());
		driver.manage().window().maximize();
		return driver;

	}

	private static FirefoxOptions FirefoxOptions() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void insertTextIntoTextField(WebElement webElement, String inputText) {
		webElement.clear();
		webElement.sendKeys(inputText);
	}

	public static boolean SwitchAlert() {
		boolean Flag = false;

		try {
			if (driver.switchTo().alert() != null) {
				driver.switchTo().alert().accept();
				Flag = true;
			}
		} catch (NoAlertPresentException e) {
		}
		return Flag;
	}
}
