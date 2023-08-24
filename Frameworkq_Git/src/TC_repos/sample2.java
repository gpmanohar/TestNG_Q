package TC_repos;

import org.testng.annotations.Test;

public class sample2 {

	@Test(priority = 1)
	public void usercreated()
	{
		System.out.println("User Created Successfully");

	}
	@Test (priority = 2)
	public void usermodified()
	{
		System.out.println("User Modified successfully");
	}
    @Test (priority = 3)
    public void userdelete()
    {
    	System.out.println("User Delete Successfully");
    }
}
