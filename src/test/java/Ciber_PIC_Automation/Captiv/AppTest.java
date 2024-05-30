
package Ciber_PIC_Automation.Captiv;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppTest {
	private static String UTILS = "Utils";
	public static WebElement webelement;
	public static List<WebElement> webelements = null;
	public static WebDriver driver = null;
	public static int defaultBrowserTimeOut = 30;
	public static List<String> windowHandlers;
	public static Logger logger = Logger.getLogger("LoggerCreation");
	public static final String usernametxtfld = "//input[@name='username']";
	public static final String passwordfld = "//input[@name='password']";
	public static final String signinbtn = "//a[@name='login_button']";
	public static final String orgbtn = "//button[@aria-label='Organizations - More']//i[@class='fa fa-caret-down']";
	public static final String viworgdrpdn = "/html/body/div[1]/div/div[2]/div/div/div/div[1]/ul/li[2]/span/div/ul/li[2]/a";
	public static final String orglkck = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/div[1]";
	public static final String prostr = "/html/body/div[1]/div/div[5]/div/div/div[1]/div[1]/div/div[3]/div/div/div[1]/div[2]/div[1]/span/span/div";
	public static final String capexerd = "//input[@name='Users_select'][contains(@id,'57ded0d3-b6b7-0a51-c584-54df66fde781')]";
	public static final String crorgdrpdn = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]/button[1]";
	public static final String companyName = "/html/body/div[1]/div/div[5]/div/div/div[1]/div[1]/div/div[1]/h1/span[2]/span/span[2]/span/input";
	public static final String PhyStreetfld = "//textarea[@placeholder='(Required) Physical Street']";
	public static final String PhyCityfld = "//input[@placeholder='(Required) Physical City']";
	public static final String PhyStatefld = "//input[@name='billing_address_state']";
	public static final String PhyPostcodefld = "//input[@placeholder='(Required) Physical Postal Code']";
	public static final String savebtn = "//a[@class='btn btn-primary']";
	public static final String subarw = "/html/body/div[1]/div/div[2]/div/div/div/div[1]/ul/li[5]/span/button/i";
	public static final String sublnk = "//li[@class='subpanel clearfix empty']//a[@name='create_button']";
	public static final String subTab = "//button[@aria-label='Organizations - More']//i[@class='fa fa-caret-down']";
	public static final String waralt = "/html/body/div[1]/div/div[1]/div/div/button/i";
	public static final String capName = "/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]/span[1]/span[1]/div[1]/a[1]/span[1]";
	public static final String promgr = "/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]/span[1]/span[1]/div[1]/a[1]/span[1]";
	public static final String memtyp = "/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[7]/div[1]/span[1]/span[1]/div[1]/a[1]";
	public static final String brk = "/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[1]/span[1]/span[1]/div[1]/a[1]";
	public static final String capexe = "/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/div[2]/span[1]/span[1]/div[1]/a[1]";
	public static final String procor = "/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/div[2]/span[1]/span[1]/div[1]/a[1]";
	public static final String linbus = "/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[2]/span[1]/span[1]/div[1]/input[1]";
	public static final String capSearch = "//input[contains(@id,'s2id_autogen10_search')]";
	public static final String promgrSlt = "//input[contains(@placeholder,'Search by first name, last name...')]";
	public static final String promgrad = "//input[@name='Users_select'][contains(@id,'5b025b48-99c6-7978-d23f-54d936b4b3a2')]";
	public static final String brkSearch = "//div[@id='select2-drop']//div[@class='select2-result-label'][normalize-space()='Search and Select...']";
	public static final String capFilt = "//input[@placeholder='Search by captive name...']";
	public static final String capclk = "//input[@id='TAI_Captives_select_87a20f6a-31ac-a1bf-59e5-52dd969f9ba1']";
	public static final String brkrad = "/html[1]/body[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/span[1]/input[1]";
	public static final String capexeFilt = "//input[contains(@placeholder,'Search by first name, last name...')]";
	public static final String procorSearch = "//input[contains(@placeholder,'Search by first name, last name...')]";
	public static final String cprelscl = "//div[@id='content']/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[7]/ul[1]/li[1]/div[1]/div[1]";
	public static final String caprad = "/html/body/div[1]/div/div[5]/div/div/div[1]/div[2]/div[2]/div[1]/div[1]/table/tbody/tr[4]/td[1]/span/input";
	public static final String captexeSlt = "//input[@placeholder='Search by captive name...']";
	public static final String procorrad = "//input[@name='Users_select'][contains(@id,'167291ed-09f7-c49a-0bfe-5ba0f8321d64')]";
	public static final String memtySelect = "/html[1]/body[1]/div[10]/ul[1]/li[2]/div[1]";
	public static final String prodate = "/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[2]/span[1]/span[1]/div[1]/input[1]";
	public static final String Broker = "//div[@id='s2id_autogen952']";
	public static final String addresstab = "//li[@class='tab LBL_RECORDVIEW_PANEL2']//a[contains(text(),'Address')]";
	public static final String subName = "//input[@name='name']";
	public static final String recSub = "//input[@name='date_received_c']";
	public static final String effdate = "//input[@name='effective_date_c']";
	public static final String pcsvbtn = "//a[@class='btn btn-primary']";
	public static final String capNameSearch = "div#select2-drop>div>input";
	public static final String crsubname = "/html/body/div[1]/div/div[3]/div/div/div[1]/div[3]/div[2]/div[2]/div[7]/ul/li/div[1]/div[1]";
	public static final String altw = "//*[@id='alerts']";
	public static final String nwpr = "/html/body/div[1]/div/div[1]/div/div/span/a";
	public static final String PhyStreet = "2142 S Main St";
	public static final String PhyCity = "Bangalore";
	public static final String PhyState = "KA";
	public static final String PhyPostcode = "560060";
	public static final String username = "aanjuru";
	public static final String password = "@Pegatesting7";
	public static final String rcsub = "01/09/2022";
	public static final String efdt = "05/20/2022";
	public static String company = null;
	public static String submissionName = null;

	@Test
	public static void createOrganization() throws UnknownHostException, InterruptedException, AWTException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		startBrowser("firefox");
		driver.manage().window().maximize();

		String url = "https://sugarstage.captiveresources.com/#";
		driver.get(url);
		Thread.sleep(3000);

		Actions actions = new Actions(driver);
		WebElement cpusername = driver.findElement(By.xpath(usernametxtfld));
		cpusername.sendKeys(username);

		WebElement owapasswd = driver.findElement(By.xpath(passwordfld));
		owapasswd.sendKeys(password);

		WebElement signin = driver.findElement(By.xpath(signinbtn));
		signin.click();

		WebElement wrwdw = driver.findElement(By.xpath(waralt));
		wrwdw.click();

		WebElement org = driver.findElement(By.xpath(orgbtn));
		org.click();
		Thread.sleep(3000);
		Action crorgplus = actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		crorgplus.perform();
		Thread.sleep(3000);
		company = "Testing_WI_" + Timestamp.getTimeStamp();
		Thread.sleep(3000);
		WebElement comyName = driver.findElement(By.xpath(companyName));
		comyName.sendKeys(company);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Address")).click();
		Thread.sleep(3000);
		WebElement PStreet = driver.findElement(By.xpath(PhyStreetfld));
		insertTextIntoTextField(PStreet, MPSUPropertyFileRead.FileRead("ProjectData.properties", "PhyStreet"));
		WebElement PCity = driver.findElement(By.xpath(PhyCityfld));
		insertTextIntoTextField(PCity, MPSUPropertyFileRead.FileRead("ProjectData.properties", "PhyCity"));
		WebElement PState = driver.findElement(By.xpath(PhyStatefld));
		insertTextIntoTextField(PState, MPSUPropertyFileRead.FileRead("ProjectData.properties", "PhyState"));
		WebElement Street = driver.findElement(By.xpath(PhyPostcodefld));
		insertTextIntoTextField(Street, MPSUPropertyFileRead.FileRead("ProjectData.properties", "PhyPostcode"));

		WebElement save = driver.findElement(By.xpath(savebtn));
		save.click();
		Thread.sleep(5000);

		WebElement viwog = driver.findElement(By.xpath(orgbtn));
		viwog.click();
		Thread.sleep(3000);
		WebElement viworg = driver.findElement(By.xpath(viworgdrpdn));
		viworg.click();
		Thread.sleep(3000);
		WebElement orglk = driver.findElement(By.xpath(orglkck));
		orglk.click();
		Thread.sleep(3000);

		WebElement sbaw = driver.findElement(By.xpath(subarw));
		sbaw.click();
		Thread.sleep(3000);
		Action crsubm = actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		crsubm.perform();
		Thread.sleep(3000);

		submissionName = "Testing_WI_" + Timestamp.getTimeStamp();

		WebElement sbName = driver.findElement(By.xpath(subName));
		sbName.sendKeys(submissionName);

		WebElement prostrfld = driver.findElement(By.xpath(prostr));
		actions.moveToElement(prostrfld).click().perform();
		Thread.sleep(3000);
		Action prostrAction = actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		prostrAction.perform();
		Thread.sleep(2000);

		WebElement captive = driver.findElement(By.xpath(capName));
		actions.moveToElement(captive).click().perform();
		Thread.sleep(3000);
		WebElement cpnmsearch = driver.findElement(By.cssSelector(capNameSearch));
		cpnmsearch.click();
		insertTextIntoTextField(cpnmsearch, MPSUPropertyFileRead.FileRead("ProjectData.properties", "Captive"));
		Thread.sleep(3000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		WebElement promgrfld = driver.findElement(By.xpath(promgr));
		actions.moveToElement(promgrfld).click().perform();
		Thread.sleep(3000);
		WebElement pmsearch = driver.findElement(By.cssSelector(capNameSearch));
		pmsearch.click();
		Thread.sleep(3000);
		insertTextIntoTextField(pmsearch, MPSUPropertyFileRead.FileRead("ProjectData.properties", "ProgramManager"));
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		WebElement recisub = driver.findElement(By.xpath(recSub));
		recisub.sendKeys(rcsub);
		Thread.sleep(3000);
		WebElement memtypfld = driver.findElement(By.xpath(memtyp));
		actions.moveToElement(memtypfld).click().perform();
		Thread.sleep(3000);
		Action memtypAction = actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		memtypAction.perform();
		Thread.sleep(3000);
		WebElement brkfld = driver.findElement(By.xpath(brk));
		actions.moveToElement(brkfld).click().perform();
		Thread.sleep(3000);
		WebElement brksearch = driver.findElement(By.xpath(brkSearch));
		brksearch.click();
		WebElement brkrd = driver.findElement(By.xpath(brkrad));
		brkrd.click();
		Thread.sleep(3000);

		WebElement capexefld = driver.findElement(By.xpath(capexe));
		actions.moveToElement(capexefld).click().perform();
		Thread.sleep(3000);
		WebElement capexesearch = driver.findElement(By.xpath(brkSearch));
		capexesearch.click();
		WebElement capexeserh = driver.findElement(By.xpath(capexeFilt));
		capexeserh.click();
		insertTextIntoTextField(capexeserh,
				MPSUPropertyFileRead.FileRead("ProjectData.properties", "CaptiveExecutive"));
		Thread.sleep(3000);
		WebElement capexeSch = driver.findElement(By.xpath(capexerd));
		capexeSch.click();
		Thread.sleep(3000);

		WebElement procorfld = driver.findElement(By.xpath(procor));
		actions.moveToElement(procorfld).click().perform();
		Thread.sleep(3000);
		WebElement procorsearch = driver.findElement(By.xpath(brkSearch));
		procorsearch.click();
		WebElement procorserh = driver.findElement(By.xpath(procorSearch));
		procorserh.click();
		insertTextIntoTextField(procorserh,
				MPSUPropertyFileRead.FileRead("ProjectData.properties", "ProgramCoordinator"));
		Thread.sleep(3000);
		WebElement pradsch = driver.findElement(By.xpath(procorrad));
		pradsch.click();
		Thread.sleep(3000);

		WebElement efdte = driver.findElement(By.xpath(effdate));
		efdte.sendKeys(efdt);
		Thread.sleep(3000);
		WebElement prdte = driver.findElement(By.xpath(prodate));
		prdte.sendKeys(efdt);
		Thread.sleep(3000);

		WebElement pcsv = driver.findElement(By.xpath(pcsvbtn));
		actions.moveToElement(pcsv).click().perform();
		Thread.sleep(3000);

		Alert prAlert = driver.switchTo().alert();
		prAlert.dismiss();

		WebElement scroll = driver.findElement(By.xpath(cprelscl));
		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		WebElement crsbnm = driver.findElement(By.xpath(cprelscl));
		crsbnm.click();
		Thread.sleep(2000);
		WebElement newpr = driver.findElement(By.id(nwpr));
		actions.moveToElement(newpr).click().perform();
		System.out.println("Printing " + nwpr);
	}

	public static WebDriver startBrowser(String browserName) throws UnknownHostException {

		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", UTILS + "\\geckodriver.exe");
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
