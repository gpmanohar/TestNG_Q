package TC_repos;

import org.testng.annotations.Test;

public class sample4 {
   @Test (priority = 1, enabled = false)
   public void usercreated()
   {
	   System.out.println("User Created Successfully");
   }
   @Test (priority = 2, dependsOnMethods = "usercreated")
   public void usermodified()
   {
	   System.out.println("User Modified Successfully");
   }
   @Test (priority =3)
   public void userdeleted()
   {
	   System.out.println("User Deleted Successfully");
   }
}
