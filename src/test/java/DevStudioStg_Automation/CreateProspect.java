package DevStudioStg_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import Ciber_PIC_Automation.Captiv.MPSUPropertyFileRead;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

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
	public static final String prschicn = "//div[contains(@class,'content layout-content-inline')]";
	public static final String prtsch = "//span[text()='Search']";
	public static final String print = "//span[@class='primary_search_white']//input[1]";
	public static final String casetype = "//select[@class='standard']";
	public static final String adloc = "//a[contains(@title,'Add a row ')]";
	public static final String subn = "//button[@name='pyCaseActionAreaButtons_pyWorkPage_21']";
	public static final String brodate = "//input[@name='$PpyWorkPage$pQuote$pCorrTrackingGroup$gFinancials$pReceivedDateTime']";
	public static final String qurank = "//input[@name='$PpyWorkPage$pQuote$pQuartileRank']";
	public static final String RCAScore = "//input[@name='$PpyWorkPage$pQuote$pRCAScore']";
	public static final String addRow = "//a[@title='Add a row ']";
	public static final String selExpGL = "//select[@id='e792a4ba']";
	public static final String selExpWC = "//select[@id='b408ff3e']";
	public static final String selExpAL = "//select[@id='33ae347d']";
	public static final String selExpAPL = "//select[@id='133c4836']";
	public static final String adFile = "//a[@name='CaseDocumentsCRI_pyWorkPage_16']";
	public static final String selFile = "//input[contains(@title,'Select file(s)')]";
	public static final String upFile = "//select[@name='$PdragDropFileUpload$ppxResults$l1$ppyCategory']";

	public static final String attFile = "//button[@id='ModalButtonSubmit']";
	public static final String RPAScore = "//input[@name='$PpyWorkPage$pQuote$pRCAScore']";
	public static final String calImg = "//img[@name='CalendarImg-3709812c']";
	public static final String qaRank = "//input[@name='$PpyWorkPage$pQuote$pQuartileRank']";
	public static final String recDate = "//input[@name='$PpyWorkPage$pQuote$pCorrTrackingGroup$gPricingFronting$pReceivedDateTime']";
	public static final String exGL = "//input[@name='$PpyWorkPage$pQuote$pOrganization$pSubMemberList$l1$pCoveragesList$l1$pExposureGroup$gActuarial$pExposure']";
	public static final String exBase = "$PpyWorkPage$pQuote$pOrganization$pSubMemberList$l1$pCoveragesList$l1$pExposureGroup$gActuarial$pExposureBaseDD";
	public static final String exDesc = "$PpyWorkPage$pQuote$pOrganization$pSubMemberList$l1$pCoveragesList$l1$pExposureGroup$gActuarial$pExposureDescriptionDD";
	public static final String AfundCost = "$PpyWorkPage$pQuote$pOrganization$pSubMemberList$l1$pCoveragesList$l1$pAFundLossCost";
	public static final String LOCDetail = "/html/body/div[2]/form/div[3]/div[2]/table/tbody/tr/td/div/div/div/div/div/div[1]/div/div/div/div/div[1]/div/div/span/div/div[2]/div[3]/div/div/div[2]/div/div[5]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[6]";
	public static final String exWC = "$PpyWorkPage$pQuote$pOrganization$pSubMemberList$l1$pCoveragesList$l2$pExposureGroup$gActuarial$pExposure";
	public static final String exWCBase = "$PpyWorkPage$pQuote$pOrganization$pSubMemberList$l1$pCoveragesList$l2$pExposureGroup$gActuarial$pExposureBaseDD";
	public static final String exWCDesc = "$PpyWorkPage$pQuote$pOrganization$pSubMemberList$l1$pCoveragesList$l2$pExposureGroup$gActuarial$pExposureDescriptionDD";
	public static final String AfundWCCost = "$PpyWorkPage$pQuote$pOrganization$pSubMemberList$l1$pCoveragesList$l2$pAFundLossCost";
	public static final String LOCWCDetail = "/html/body/div[2]/form/div[3]/div[2]/table/tbody/tr/td/div/div/div/div/div/div[1]/div/div/div/div/div[1]/div/div/span/div/div[2]/div[3]/div/div/div[2]/div/div[5]/div[2]/div/div[2]/div[1]/div/div[2]/h2/div";
	public static final String rda = "$PpyWorkPage$pQuote$pRequiredDocAttached";
	public static final String BTLpc = "$PpyWorkPage$pQuote$pBTLPricingComplete";
	public static final String ba1 = "$PpyWorkPage$pQuote$pOrganization$pSubMemberList$l1$pCoveragesList$l1$pBindAction";
	public static final String ba2 = "$PpyWorkPage$pQuote$pOrganization$pSubMemberList$l1$pCoveragesList$l1$pBindAction";
	public static final String mebno = "$PpyWorkPage$pQuote$pOrganization$pMemberID";
	public static final String psdate = "CalendarImg-4efe31cc";

	public static final String brodt = "07/01/2020";
	public static final String qurankvl = "5648";
	public static final String RCAScorevl = "4648";
	public static final String username = "Samrat_QA";
	public static final String password = "rules";
	public static final String caStatus = "Regularisation of casual workers";
	public static final String addNames = "Private Org";
	public static final String prid = "PR-273842";

	@Test
	public static void createStgProspect() throws InterruptedException, AWTException, IOException {
		startBrowser("edge");
		driver.manage().window().maximize();
		String url = "https://captv-stg1.pegacloud.io/prweb/app/PIC/xbHu3hfavxTLkEni2dIEKW87dKzQq6k8*/!STANDARD?pzuiactionrrr=CXtpbn0vMnMwNHlUb0YwMHJldjl3R0t4QUZGVDlJSWFlcnBMYTdkUVUrbHlxazV2MDhtZndDU1FxTDZrTlI2KytTbEpERThZT2t6MnYrbTRMaGU2MXBWVGcvR0NjWVpubC9MbEdHS0RuT0ZyZXp4a21jSUJNZlhtcHo3eTlvallrVS85ZjAzYXdKUVFSK0I1dkExa0Q0aU95OXE1WVNUTEs5U1ZyMkZoYlRtVHlvQ1kwcENVU2JLa3RzaVhCTmU0ZUlDZHlYTldFcXVseGJKTXdXQ3Q3bFp5bWRaUnF5Yzk0YlgwYWZ2WHZhWTBDV0ovQm9TWlZWYTRoTUxyMXNUSnU4Q3BBMXpHUUFtNU9ibWw2dkZhSVplb3BzWU8rakIxK1IxYjIyN2ZkY2x0Mk1FQjgvUE0rME1IMjdJSUNNZUVxa013RWM4V3JldjNoUnNlWm4xWTZWdFdYVStXc0hSeFN6KzFWbUxoelF3NCt3bVhQY09tSDZ0MHVNQjdPU3FCaXhISXZ1L0hhd2QxRE5rUEtNdks2amVkdVlqUjJsd0x5Ti90Q2hFcVVXMmE4aGJmN1kvUkcxSWg5RXcyRjBPTU9EMXJPUDUrYldudlp1Rm9pa3Q5Y2o2bmQycFBWekFreVNGUkVDUWk3YVg0bUVOMEtVUE9rajBQUjhWVXN6eHk2NEgwYlFFRGE0SVNabTl6T1dLK3p3SDRvUmJONHVIdmxBOTZUcTRpTWFiNWlqbkpWKzl0cHJ2eVF2SlowSlk0SUNUbVhLenA4Q244c3dHbmFqMHN2RTV1ZlZubVBPY0o2LzQ1ZU5kSEpJSXJ0RVBEK0U1ZDlINHBOamtRalVJa1BxeGRK*&pzPostData=-1446478408";
		driver.get(url);
		Thread.sleep(2000);
		// Actions actions = new Actions(driver);
		Robot rb = new Robot();
		// String oldTab = driver.getWindowHandle();
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

		driver.switchTo().frame(0);

		WebElement ovw = driver.findElement(By.partialLinkText("Overview"));
		System.out.println("Element with text(): " + ovw.getText());
		ovw.click();

		Thread.sleep(5000);

		driver.switchTo().frame(0);

		Thread.sleep(3000);

		// selecting coverages
		driver.findElement(By.xpath(addRow)).click();
		WebElement sel = driver.findElement(By.xpath(selExpGL));
		Select gen = new Select(sel);
		gen.selectByValue("General Liability");
		Thread.sleep(2000);

		// selecting wc
		Thread.sleep(2000);
		driver.findElement(By.xpath(addRow)).click();
		WebElement sel1 = driver.findElement(By.xpath(selExpWC));
		Select wc = new Select(sel1);
		wc.selectByValue("Workers' Compensation");

		// driver.findElement(By.xpath(addRow)).click();
		/*
		 * WebElement sel2 = driver.findElement(By.xpath(selExpAL)); Select al = new
		 * Select(sel2); al.selectByValue("Auto Liability");
		 * 
		 * 
		 * driver.findElement(By.xpath(addRow)).click(); WebElement sel3 =
		 * driver.findElement(By.xpath(selExpAPL)); Select apd = new Select(sel3);
		 * apd.selectByValue("Auto Physical Damage");
		 */

		// clicking on submit

		WebElement butt = driver.findElement(By.xpath(subn));
		butt.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(adFile)).click();
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(selFile)).sendKeys("C:\\Docs\\Losspick.pdf");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.xpath(upFile)));
		dropdown.selectByIndex(7);
		Thread.sleep(3000);
		driver.findElement(By.xpath(attFile)).click();
		Thread.sleep(3000);
		WebElement sbbutt = driver.findElement(By.xpath(subn));
		sbbutt.click();
		Thread.sleep(5000);

		/*
		 * WebElement brdt = driver.findElement(By.xpath(brodate));
		 * brdt.sendKeys(brodt); Thread.sleep(1000); WebElement RCASc =
		 * driver.findElement(By.xpath(RCAScore)); RCASc.sendKeys(RCAScorevl);
		 * 
		 * WebElement qurk = driver.findElement(By.xpath(qurank));
		 * qurk.sendKeys(qurankvl);
		 */

		WebElement ra = driver.findElement(By.xpath(RPAScore));
		ra.sendKeys("20");

		driver.findElement(By.xpath(calImg)).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("11")).click();

		Thread.sleep(15000);

		WebElement rank = driver.findElement(By.xpath(qaRank));
		rank.sendKeys("10");

		driver.findElement(By.xpath(subn)).click();
		//
		// //underwriter
		//
		driver.findElement(By.xpath(recDate)).sendKeys("01/02/2021");
		Thread.sleep(5000);
		driver.findElement(By.xpath(subn)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(subn)).click();
		Thread.sleep(5000);

		//
		// //mde
		// // General liability
		driver.findElement(By.xpath(exGL)).sendKeys("9075000");
		WebElement ge = driver.findElement(By.name(exBase));
		Select ges = new Select(ge);
		ges.selectByIndex(4);

		WebElement ged = driver.findElement(By.name(exDesc));
		Select gede = new Select(ged);
		gede.selectByIndex(1);

		driver.findElement(By.name(AfundCost)).sendKeys("31.035");

		Thread.sleep(3000);
		// adding wc

		driver.findElement(By.xpath(LOCDetail)).click();

		driver.findElement(By.name(exWC)).sendKeys("16080000");

		WebElement we = driver.findElement(By.name(exWCBase));
		Select wed = new Select(we);
		wed.selectByIndex(3);

		WebElement wep = driver.findElement(By.name(exWCDesc));

		Select wept = new Select(wep);
		wept.selectByIndex(1);

		driver.findElement(By.name(AfundWCCost)).sendKeys("0.28");
		Thread.sleep(5000);

		driver.findElement(By.xpath(LOCWCDetail)).click();
		Thread.sleep(5000);

		// submit mde
		driver.findElement(By.xpath(subn)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(subn)).click();
		Thread.sleep(3000);

		// required to bind

		WebElement dr = driver.findElement(By.name(rda));
		Select ye = new Select(dr);
		ye.selectByIndex(0);
		WebElement dree = driver.findElement(By.name(BTLpc));
		Select yee = new Select(dree);
		yee.selectByIndex(0);

		driver.findElement(By.xpath(subn)).click();

		// Broker bind order

		Thread.sleep(5000);

		WebElement bb = driver.findElement(By.name(ba1));

		Select bbs = new Select(bb);
		bbs.selectByIndex(1);

		Thread.sleep(2000);

		WebElement bb2 = driver.findElement(By.name(ba2));
		Select bbs2 = new Select(bb2);
		bbs2.selectByIndex(1);

		driver.findElement(By.xpath(subn)).click();

		// Bound coverage review

		Thread.sleep(5000);

		driver.findElement(By.xpath(subn)).click();

		// invoice summery

		Thread.sleep(5000);
		driver.findElement(By.xpath(subn)).click();

		// confirm

		driver.findElement(By.name(mebno)).sendKeys("248858");
		driver.findElement(By.name(psdate)).click();
		driver.findElement(By.linkText("11")).click();
		driver.findElement(By.xpath(subn)).click();

	}

	public static WebDriver startBrowser(String browserName) throws UnknownHostException {

		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C://Docs//Driver//geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C://Docs//Driver//edgedriver.exe");
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://Docs//Driver//chromedriver.exe");
			driver = new ChromeDriver();
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
