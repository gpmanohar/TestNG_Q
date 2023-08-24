package TC_repos;

import org.testng.annotations.Test;

public class sample3 {
	@Test(priority = 1, invocationCount = 3 )
	public void usercreated()
	{
		System.out.println("User Created Successfully");
	}
	@Test (priority = 2, invocationCount = 5 )
	public void usermodified()
	{
		System.out.println("User Modified Successfully");
	}
    @Test (priority = 3)
    public void userdeleted()
    {
    	System.out.println("User Deleted Successfully");
    }
}
