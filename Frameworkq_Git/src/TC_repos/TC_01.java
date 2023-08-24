package TC_repos;

import java.io.File;
import java.time.Duration;

import org.apache.poi.hslf.blip.JPEG;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import genricUtilityorLibrary.ExcelUtility;
import genricUtilityorLibrary.JavaUtility;
import genricUtilityorLibrary.PropertiesUtility;

public class TC_01 {

	public static void main(String[] args) throws Exception, Exception {
		JavaUtility JUTIL = new JavaUtility();
		int RANDOMNUMBER = JUTIL.getRandomNumber();
		ExcelUtility EUTIL = new ExcelUtility();
		String CUSTOMERNAME = EUTIL.getDataFromExcel("Sheet3", 2, 2);
		String DESCRIPTION = EUTIL.getDataFromExcel("Sheet3", 2, 3);
		PropertiesUtility PUTIL = new PropertiesUtility();
		String USERNAME = PUTIL.getDatafromProperties("username");
		String PASSWORD = PUTIL.getDatafromProperties("password");
		String URL = PUTIL.getDatafromProperties("url");

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		/*
		 * ChromeOptions option =new ChromeOptions();
		 * option.addArguments("--remote-allow-origins=*");
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Selenium\\chromedriver.exe"); ChromeDriver driver=new
		 * ChromeDriver(option);
		 * 
		 */
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(USERNAME, Keys.TAB, PASSWORD,Keys.ENTER);
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//div[starts-with(@id,\"container_tasks\")]")).click();
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(4000);
		
		/*
		 * TakesScreenshot ts = (TakesScreenshot)driver; File src =
		 * ts.getScreenshotAs(OutputType.FILE); File dest = new File
		 * (".\\Screenshot\\" + "abc.png"); Files.copy(src, dest);
		 */
		
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(CUSTOMERNAME + RANDOMNUMBER);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(DESCRIPTION);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		// driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}

}
