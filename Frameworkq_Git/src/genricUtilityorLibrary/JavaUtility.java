package genricUtilityorLibrary;

import java.util.Random;

public class JavaUtility {

	
	public int getRandomNumber() {
	
		Random r = new Random();
		int number = r.nextInt(10000);
		return number;
		
	}

	}


