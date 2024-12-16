
package Ciber_PIC_Automation.Captiv;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import testbase.BaseClass;

public class CreateStageProspect extends BaseClass {

	public static WebElement webelement;
	public static List<WebElement> webelements = null;
	public static WebDriver driver = null;
	public static int defaultBrowserTimeOut = 30;
	public Properties p;

	public static List<String> windowHandlers;
	public static Logger logger = Logger.getLogger("LoggerCreation");
	public static final String usernametxtfld = "//input[@name='username']";
	public static final String passwordfld = "//input[@name='password']";
	public static final String signinbtn = "//a[@name='login_button']";
	public static final String orgbtn = "//div[@id='Accounts_sidebar-nav-item']/a[contains(@class,'sidebar-nav-item-btn ')]//span[@class='expanded h-full w-full ellipsis_inline pr-4 text-white']";

	public static final String expbtn = "//div[@id='expand-menu_sidebar-nav-item']/button[@aria-label='Open']//span[contains(@class,'sicon sicon-hamburger')]";
	public static final String orglt = "//button[@aria-label='Organizations menu']//i[@class='sicon sicon-kebab text-white']";
	public static final String crorgdrpdn = "//span[normalize-space()='Create Organization']";
	public static final String companyName = "//span[@class='record-label' and text()='Company Name']/following::input[@aria-label='Company Name']";
	public static final String PhyStreetfld = "//textarea[@placeholder='(Required) Physical Street']";
	public static final String PhyCityfld = "//input[@placeholder='(Required) Physical City']";
	public static final String PhyStatefld = "//input[@name='billing_address_state']";
	public static final String PhyPostcodefld = "//input[@placeholder='(Required) Physical Postal Code']";
	public static final String savebtn = "//a[@class='btn btn-primary' and @name='save_button' and contains(text(), 'Save')]";

	public static final String sublnk = "//div[@class='a11y-wrapper']//following-sibling::h4[contains(text(), 'Submissions')]//ancestor::div[@class='subpanel-header ui-sortable-handle']";
	public static final String subTab = "//div[@class='a11y-wrapper']//following-sibling::h4[contains(text(), 'Submissions')]";
	public static final String subTab1 = "//li[@class='subpanel clearfix my-2 rounded-md shadow hover:shadow-lg transition-shadow hover:bg-dashlet-background-hover empty']//div[@class='a11y-wrapper' and @aria-label='toggle subpanel']";
	public static final String submenu = "//span[@data-original-title='Submissions']/child::span[@class='h-full w-15 label-module-color-sidebar cursor-pointer label label-module label-module-size-lg label-module-color-red'][normalize-space()='Su']";
	public static final String subCreate = "//a[@class='btn btn-primary'][normalize-space()='Create']";
	public static final String capName = "//div[@class='ellipsis_inline record-label' and @data-name='tai_captives_opportunities_1_name']/preceding::span[contains(text(),'Captive')]/following::span[@class='normal index' and @data-fieldname ='tai_captives_opportunities_1_name' ]//a[@class='select2-choice select2-default']/span[@class='select2-chosen']";
	public static final String promgr = "//div[@class='ellipsis_inline record-label' and @data-name='program_manager_c']/span[contains(text(),'Program Manager')]/following::span[@class='normal index' and @data-fieldname ='program_manager_c' ]//a[@class='select2-choice select2-default']/span[@class='select2-chosen']";
	public static final String memtyp = "//div[@class='ellipsis_inline record-label' and @data-name='opportunity_type']/span[contains(text(),'Submission Type')]/following::span[@class='normal index' and @data-fieldname ='opportunity_type']//a[@class='select2-choice select2-default']/span[@class='select2-chosen']";
	public static final String brk = "//div[@class='ellipsis_inline record-label' and @data-name='brok_brokers_opportunities_1_name']/span[contains(text(),'Broker')]/following::span[@class='normal index' and @data-fieldname ='brok_brokers_opportunities_1_name']//a[@class='select2-choice select2-default']/span[@class='select2-chosen']";
	public static final String capexe = "//div[@class='ellipsis_inline record-label' and @data-name='captive_executive_1_c']/span[contains(text(),'Captive Executive')]/following::span[@class='normal index' and @data-fieldname ='captive_executive_1_c']//a[@class='select2-choice select2-default']/span[@class='select2-chosen']";
	public static final String procor = "//div[@class='ellipsis_inline record-label' and @data-name='program_coordinator_c']/span[contains(text(),'Program Coordinator')]/following::span[@class='normal index' and @data-fieldname ='program_coordinator_c']//a[@class='select2-choice select2-default']/span[@class='select2-chosen']";
	public static final String linbus = "//div[@class='ellipsis_inline record-label' and @data-name='line_of_business_c']/span[contains(text(),'Line Of Business')]/following::span[@class='normal index' and @data-fieldname ='line_of_business_c']//a[@class='select2-choice select2-default']/span[@class='select2-chosen']";
	public static final String capSearch = "//input[contains(@id,'s2id_autogen10_search')]";
	public static final String prostr = "//div[@class='ellipsis_inline record-label' and @data-name='pod_structure_c']/span[contains(text(),'Pod Structure')]/following::span[@class='normal index' and @data-fieldname ='pod_structure_c']//a[@class='select2-choice']/span[@class='select2-chosen']";
	public static final String promgrSearch = "/html[1]/body[1]/div[6]/div[1]/input[1]";
	public static final String brkSearch = "//div[@id='select2-drop']//div[@class='select2-result-label'][normalize-space()='Search and Select...']";
	public static final String brkrad = "//tr[@name='brok_Brokers_5a2dd210-dbc4-11ee-9700-0050569dedee']//preceding-sibling::td[@class='sticky-column stick-left' and @data-column='brok_Brokers_select']//input[@name='brok_Brokers_select']";
	public static final String captexeSearch = "/html/body/div[6]/ul[2]/li/div";
	public static final String procorSearch = "/html/body/div[7]/ul[2]/li/div";
	public static final String caprad = "//tr[contains(@name,'Users_9de6d078')]//preceding-sibling::td[@class='sticky-column stick-left' and @data-column='Users_select']//input[@name='Users_select']";
	public static final String procorrad = "//tr[contains(@name,'Users_cc221428')]//preceding-sibling::td[@class='sticky-column stick-left' and @data-column='Users_select']//input[@name='Users_select']";
	public static final String memtySelect = "/html/body/div[6]/ul/li[2]/div";
	public static final String linbusSelect = "/html[1]/body[1]/div[8]/ul[1]/li[2]/div[1]";
	public static final String casualityStatus = "//input[@name='casualty_status_c']";
	public static final String reqfldSearch = "//div[@id='select2-drop']//div[@class='select2-search']/descendant::input[@type='text']";

	public static final String AdditionalNames = "//input[@name='additional_names_c']";
	public static final String Broker = "//div[@id='s2id_autogen952']";
	public static final String ProgMng = "s2id_autogen942";
	public static final String addresstab = "//li[@class='tab tab-badgeable LBL_RECORDVIEW_PANEL2 active']//a";
	public static final String subName = "//span[@class='record-label' and text()='Submission Name']/following-sibling::span//input[@type='text']";
	public static final String recSub = "//input[@name='date_received_c']";
	public static final String effdate = "//input[@name='effective_date_c']";
	public static final String pcsvbtn = "//a[@class='btn btn-primary' and @role='button' and @name='save_button']";
	public static final String crsubname = "/html/body/div[1]/div/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div[1]/ul/li/div[2]/div/div/table/tbody/tr/td[2]/span/div/a";
	public static final String nwpr = "/html/body/div[1]/div/div[4]/div/div/div[1]/div[1]/div/div[2]/div/div/div[1]/div[3]/div[1]/span/span[1]/span/div";
	public static final String sublnk1 = "//div[@data-subpanel-link='opportunities']//i[@class='sicon sicon-plus']";
	public static final String subTab2 = "//h4[text()='Submissions']";
	public static final String subbtn = "//span[contains(@class,'h-full w-15 label-module-color-sidebar')][normalize-space()='Supreceding']/::span[@data-original-title='Submissions']";
	public static final String submlt = "//button[@aria-label='Submissions menu']//i[@class='sicon sicon-kebab text-white']";
	public static final String vwsubm = "//span[normalize-space()='View Submissions']";
	public static final String subSrh = "//div[@class='filter-view search']//div[@class='table-cell full-width']/input[@class='search-name']";
	public static final String subNamelk = "//div[@class='ellipsis_inline relate-field-container']//a[contains(@href,'Opportunities')]";
	public static final String ProspectNo = "//span[@data-fieldname='pega_case_no_c']/child::span/child::div";
	public static final String PhyStreet = "2142 S Main St";
	public static final String PhyCity = "Bangalore";
	public static final String PhyState = "KA";
	public static final String PhyPostcode = "560060";
	public static final String username = "aanjuru";
	public static final String password = "Captive@123";
	public static final String caStatus = "Regularisation of casual workers";
	public static final String addNames = "Private Org";
	public static final String rcsub = "01/09/2022";
	public static final String efdt = "05/25/2022";
	public static String company = null;
	public static String submissionName = null;

	@Test(groups = { "Sanity", "Regression", "Master" })
	public static void createOrganization() throws UnknownHostException, InterruptedException, AWTException {
		Robot rb = new Robot();

		WebElement cpusername = driver.findElement(By.xpath(usernametxtfld));
		cpusername.sendKeys(username);
		Thread.sleep(2000);
		WebElement owapasswd = driver.findElement(By.xpath(passwordfld));
		owapasswd.sendKeys(password);
		Thread.sleep(2000);
		WebElement signin = driver.findElement(By.xpath(signinbtn));
		signin.click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement expend = driver.findElement(By.xpath(expbtn));
		actions.moveToElement(expend).build().perform();
		Thread.sleep(3000);
		actions.moveToElement(expend).click().perform();
		Thread.sleep(3000);

		WebElement org = driver.findElement(By.xpath(orgbtn));
		actions.moveToElement(org).build().perform();
		Thread.sleep(3000);

		WebElement orglist = driver.findElement(By.xpath(orglt));
		orglist.click();
		Thread.sleep(3000);
		WebElement crorg = driver.findElement(By.xpath(crorgdrpdn));
		crorg.click();
		Thread.sleep(2000);

		company = "StgTest_" + Timestamp.getTimeStamp();

		WebElement comyName = driver.findElement(By.xpath(companyName));
		comyName.sendKeys(company);
		Thread.sleep(2000);
		WebElement AdditNames = driver.findElement(By.xpath(AdditionalNames));
		AdditNames.sendKeys(addNames);
		Thread.sleep(2000);

		driver.findElement(By.linkText("Address")).click();
		Thread.sleep(2000);

		WebElement PStreet = driver.findElement(By.xpath(PhyStreetfld));
		insertTextIntoTextField(PStreet, MPSUPropertyFileRead.FileRead("ProjectData.properties", "PhyStreet"));
		WebElement PCity = driver.findElement(By.xpath(PhyCityfld));
		insertTextIntoTextField(PCity, MPSUPropertyFileRead.FileRead("ProjectData.properties", "PhyCity"));
		WebElement PState = driver.findElement(By.xpath(PhyStatefld));
		insertTextIntoTextField(PState, MPSUPropertyFileRead.FileRead("ProjectData.properties", "PhyState"));
		WebElement Street = driver.findElement(By.xpath(PhyPostcodefld));
		insertTextIntoTextField(Street, MPSUPropertyFileRead.FileRead("ProjectData.properties", "PhyPostcode"));
		Thread.sleep(2000);

		WebElement save = driver.findElement(By.xpath(savebtn));
		save.click();
		Thread.sleep(2000);

		driver.findElement(By.partialLinkText("StgTest_")).click();
		System.out.println("theLinkText: " + driver.getTitle());
		Thread.sleep(4000);

		WebElement submntab = driver.findElement(By.xpath(subTab2));
		actions.moveToElement(submntab).perform();
		Thread.sleep(2000);
		WebElement sblnk = driver.findElement(By.xpath(sublnk1));
		sblnk.click();
		Thread.sleep(3000);

		submissionName = "StgTest_" + Timestamp.getTimeStamp();

		WebElement sbName = driver.findElement(By.xpath(subName));
		sbName.sendKeys(submissionName);
		Thread.sleep(2000);

		WebElement captive = driver.findElement(By.xpath(capName));
		actions.moveToElement(captive).click().perform();
		Thread.sleep(3000);
		WebElement cpnmsearch = driver.findElement(By.xpath(reqfldSearch));
		insertTextIntoTextField(cpnmsearch, MPSUPropertyFileRead.FileRead("ProjectData.properties", "Captive"));
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement promgrfld = driver.findElement(By.xpath(promgr));
		actions.moveToElement(promgrfld).click().perform();
		Thread.sleep(3000);
		WebElement pmsearch = driver.findElement(By.xpath(reqfldSearch));
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

		WebElement efdte = driver.findElement(By.xpath(effdate));
		efdte.sendKeys(efdt);
		Thread.sleep(2000);

		WebElement linbusfld = driver.findElement(By.xpath(linbus));
		actions.moveToElement(linbusfld).click().perform();
		Thread.sleep(2000);
		Action linbusAction = actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		linbusAction.perform();
		Thread.sleep(2000);

		WebElement prostrfld = driver.findElement(By.xpath(prostr));
		actions.moveToElement(prostrfld).click().perform();
		Thread.sleep(3000);
		Action prostrAction = actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		prostrAction.perform();
		Thread.sleep(2000);

		WebElement capexefld = driver.findElement(By.xpath(capexe));
		actions.moveToElement(capexefld).click().perform();
		Thread.sleep(3000);
		WebElement capexsearch = driver.findElement(By.xpath(brkSearch));
		capexsearch.click();
		WebElement bprd = driver.findElement(By.xpath(caprad));
		bprd.click();
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		WebElement procorfld = driver.findElement(By.xpath(procor));
		actions.moveToElement(procorfld).click().perform();
		Thread.sleep(2000);
		WebElement prad = driver.findElement(By.xpath(brkSearch));
		prad.click();
		WebElement prrd = driver.findElement(By.xpath(procorrad));
		prrd.click();
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		WebElement pcsv = driver.findElement(By.xpath(pcsvbtn));
		pcsv.click();
		Thread.sleep(4000);

		WebElement subnmlink = driver.findElement(By.xpath(subNamelk));
		actions.moveToElement(subnmlink).click().build().perform();
		Thread.sleep(3000);

		WebElement prosno = driver.findElement(By.xpath(ProspectNo));

		System.out.println(prosno.getText());
		Thread.sleep(3000);
	}

	public static void insertTextIntoTextField(WebElement webElement, String inputText) {
		webElement.clear();
		webElement.sendKeys(inputText);
	}

}