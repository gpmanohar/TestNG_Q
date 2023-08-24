package sampleTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import genricUtilityorLibrary.PropertiesUtility;

public class sampleTestCase_01 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		PropertiesUtility PUTIL = new PropertiesUtility();
		String USERNAME = PUTIL.getDatafromProperties("username");
		String PASSWORD = PUTIL.getDatafromProperties("password");
		String URL = PUTIL.getDatafromProperties("url");
		//WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(USERNAME, Keys.TAB,PASSWORD,Keys.ENTER);
		
	}

}
