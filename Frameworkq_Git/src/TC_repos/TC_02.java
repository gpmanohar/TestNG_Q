package TC_repos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import genricUtilityorLibrary.ExcelUtility;
import genricUtilityorLibrary.PropertiesUtility;

public class TC_02 {

	public static void main(String[] args) throws Exception {
		PropertiesUtility PUTIL = new PropertiesUtility();
		String USERNAME = PUTIL.getDatafromProperties("username");
		String PASSWORD = PUTIL.getDatafromProperties("password");
		String URL = PUTIL.getDatafromProperties("url");
		
		ExcelUtility EUTIL = new ExcelUtility();
		String FIRSTNAME = EUTIL.getDataFromExcel("Sheet4", 2, 2);
		String LASTNAME = EUTIL.getDataFromExcel("Sheet4", 2, 3);
		String MAIL = EUTIL.getDataFromExcel("Sheet4", 2, 4);
		
		
		
		
		
		
		/*
		 * System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		 * FirefoxDriver driver = new FirefoxDriver();
		 */
		 
		 
		 

		
		
		/*
		 * EdgeOptions option =new EdgeOptions();
		 * option.addArguments("--remote-allow-origins=*");
		 * System.setProperty("webdriver.edge.driver","C:\\Selenium\\msedgedriver.exe");
		 * EdgeDriver driver =new EdgeDriver(option);
		 */
		 
		 
	
		
		
		  ChromeOptions option =new ChromeOptions();
		  option.addArguments("--remote-allow-origins=*");
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe"); 
		  ChromeDriver driver = new ChromeDriver(option);
		 
		 
		 
		 		  
		  driver.get(URL);
		  driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(USERNAME,Keys.TAB, PASSWORD,Keys.ENTER);
		  Thread.sleep(4000);
          driver.findElement(By.xpath("//div[@id='container_users']")).click();
          Thread.sleep(4000);
          driver.findElement(By.xpath("//div[text()='New User']")).click();
          Thread.sleep(3000);
          driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys(FIRSTNAME);
          driver.findElement(By.xpath("(//input[@name='lastName'])[2]")).sendKeys(LASTNAME);
          driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(MAIL);
          driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
          
          Thread.sleep(3000);
          driver.findElement(By.xpath("(//span[text()='Close'])[1]")).click();
	}

}
