package batchExecution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genricUtilityorLibrary.BaseClass;

public class TCB_1 extends BaseClass {
	
     

	@Test
	public void ExecuteTastModule() throws Exception {
		
		int RANDOMNUMBER = JUTIL.getRandomNumber();
		
		String CUSTOMERNAME = EUTIL.getDataFromExcel("Sheet3", 2, 2);
		String DESCRIPTION = EUTIL.getDataFromExcel("Sheet3", 2, 3);
		
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Selenium\\geckodriver.exe"); FirefoxDriver driver = new FirefoxDriver();
		 */

		
		/*
		 * ChromeOptions option =new ChromeOptions();
		 * option.addArguments("--remote-allow-origins=*");
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Selenium\\chromedriver.exe"); ChromeDriver driver=new
		 * ChromeDriver(option);
		 */
		  
		 
		
		/*driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));*/
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).
		
		// driver.findElement(By.xpath("//div[starts-with(@id,\"container_tasks\")]")).click();
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(CUSTOMERNAME + RANDOMNUMBER);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(DESCRIPTION);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		// driver.findElement(By.xpath("//a[text()='Logout']")).click();
         
	}

}

//Changes