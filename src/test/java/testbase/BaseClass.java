package testbase;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver;
	public Properties p;

	@BeforeClass(groups= {"Sanity","Regression","Master"})
	@Parameters({ "os", "browser" })
	public void SetUp(String os, String br) throws IOException {
		FileReader file = new FileReader("./src//test//java//DevStudioStg_Automation//ProjectData.properties");
		p = new Properties();
		p.load(file);
		if (p.getProperty("execution_env").equalsIgnoreCase("remote")) {
			String huburl = "http://172.23.32.1:4444/wd/hub";
			DesiredCapabilities cap = new DesiredCapabilities();
			if (os.equalsIgnoreCase("windows")) {
				cap.setPlatform(Platform.WIN10);
			} else if (os.equalsIgnoreCase("mac")) {
				cap.setPlatform(Platform.WIN10);
			} else {
				System.out.println("No matches os");
				return;
			}

			driver = new RemoteWebDriver(new URL(huburl), cap);
		}
		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser name...");
			return;
		}
		if (p.getProperty("execution_env").equalsIgnoreCase("local")) {
			switch (br.toLowerCase()) {
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			default:
				System.out.println("Invalid browser name...");
				return;
			}
			
		driver.manage().deleteAllCookies();
	
		driver.get(p.getProperty("appURL")); // reading url from properties file.
		driver.manage().window().maximize();
		}

	}

}
