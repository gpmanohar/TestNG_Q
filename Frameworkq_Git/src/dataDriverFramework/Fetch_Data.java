package dataDriverFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Fetch_Data {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Selenium\\ActitimeLogin.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");
		String URL = pobj.getProperty("url");
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(URL);
		

	}

}
