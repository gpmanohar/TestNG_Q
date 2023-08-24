package TC_repos;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;

import genricUtilityorLibrary.BaseClass;

@Listeners(genricUtilityorLibrary.ListenersImplementation.class)
	public class testForImplementation extends BaseClass{
	
	String FIRSTNAME = EUTIL.getDataFromExcel("Sheet4", 2, 2);
	String LASTNAME = EUTIL.getDataFromExcel("Sheet4", 2, 3);
	String MAIL = EUTIL.getDataFromExcel("Sheet4", 2, 4);
	
	
	driver.findElement(By.xpath("//div[@id='container_users']")).click();
      driver.findElement(By.xpath("//div[@id='container_users']")).click();
      driver.findElement(By.xpath("").click();
      driver.findElement(By.xpath("//div[text()='New User']")).click();
   
      driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys(FIRSTNAME);
      driver.findElement(By.xpath("(//input[@name='lastName'])[2]")).sendKeys(LASTNAME);
      driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(MAIL);
      driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
      
      driver.findElement(By.xpath("(//span[text()='Close'])[1]")).click();
}

}
