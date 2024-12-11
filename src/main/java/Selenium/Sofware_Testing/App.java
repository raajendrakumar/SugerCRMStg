package Selenium.Sofware_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class App {
	public static void main(String[] args) {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless=new");
		System.setProperty("webdriver.gecko.driver", "C:\\Docs\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows: " + rows);
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of colums: " + cols);
		for (int r = 2; r < rows; r++) {
			for (int c = 1; c < cols; c++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]"))
						.getText();
				System.out.print(value + "\t");
			}
			System.out.println();
		}

	}
}
