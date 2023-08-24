package TC_repos;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genricUtilityorLibrary.BaseClass;

public class TC_2 extends BaseClass {
     @Test
	public void ExecuteUserModule()throws Exception {
		
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
		 
		 
		/*
		 * ChromeOptions option =new ChromeOptions();
		 * option.addArguments("--remote-allow-origins=*");
		 * System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe"
		 * ); ChromeDriver driver= new ChromeDriver(option);
		 */
		 
          driver.findElement(By.xpath("//div[@id='container_users']")).click();
          
          driver.findElement(By.xpath("//div[text()='New User']")).click();
          Thread.sleep(4000);
          driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys(FIRSTNAME);
          driver.findElement(By.xpath("(//input[@name='lastName'])[2]")).sendKeys(LASTNAME);
          driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(MAIL);
          driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
          
          Thread.sleep(3000);
          driver.findElement(By.xpath("(//span[text()='Close'])[1]")).click();
	}

}
