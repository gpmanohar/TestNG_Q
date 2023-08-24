package genricUtilityorLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseClass {
	public PropertiesUtility PUTIL = new PropertiesUtility();
	public JavaUtility JUTIL = new JavaUtility();
	public ExcelUtility EUTIL = new ExcelUtility ();
	public  WebDriver driver ;
	
	@BeforeSuite(alwaysRun = true)
	public void CreateDbConnectin()
	{
		System.out.println("db connectin successfull");
	}
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(String browser) throws Exception
	{
		
		  
		String URL = PUTIL.getDatafromProperties("url");
		if(browser.equalsIgnoreCase("chrome"))
		{
			ChromeOptions option =new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe"); 
		    driver = new ChromeDriver(option);
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		System.out.println("browser launched successfully");
	}
	@BeforeMethod(alwaysRun = true)
	public void loginApp() throws Exception
	{
		String USERNAME =PUTIL.getDatafromProperties("username");
		String PASSWORD =PUTIL.getDatafromProperties("password");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(USERNAME,Keys.TAB,PASSWORD,Keys.ENTER);
		System.out.println("login successfully");
	}
	@AfterMethod(alwaysRun = true)
	public void logOut()
	{
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println("logout successfully");
		}
	@AfterClass(alwaysRun = true)
	public void classwindow()
	{
		driver.close();
	}
	@AfterSuite(alwaysRun = true)
	public void dbConnectionclose()
	{
		System.out.println("db connection close");
	}
	
	
     }
     

