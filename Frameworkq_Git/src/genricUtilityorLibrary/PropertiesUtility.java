package genricUtilityorLibrary;

import java.io.FileInputStream;
import java.util.Properties;



public class PropertiesUtility {

	public String getDatafromProperties(String data) throws Exception {
		FileInputStream fis =  new FileInputStream("C:\\Selenium\\ActitimeLogin.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String DATA = pobj.getProperty(data);
		return DATA;

	}

}
