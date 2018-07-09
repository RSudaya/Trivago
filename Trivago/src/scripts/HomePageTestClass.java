package scripts;


import org.testng.annotations.Test;



import generic.BaseTest;
import generic.PropertyFile;
import pom.HomePageClass;
import pom.LoginPageClass;

public class HomePageTestClass extends BaseTest
{
	@Test
	  public void home()  throws InterruptedException
	  {
		String us = PropertyFile.pfile(FILEPATH, "username");
		String ps = PropertyFile.pfile(FILEPATH, "password");
		String title = PropertyFile.pfile(FILEPATH, "title");
		String Sval = PropertyFile.pfile(FILEPATH, "value");
		
		LoginPageClass lpg = new LoginPageClass(driver);
		Thread.sleep(3000);
		lpg.myprofile();
		lpg.loginlink();
		lpg.username(us);
		lpg.password(ps);
		lpg.lbtn();
		lpg.verifyTitle(title);
		
		HomePageClass hpg = new HomePageClass(driver);
		Thread.sleep(3000);
	//	hpg.verifyTitle(title);
		
		hpg.search(Sval);
		hpg.sbtn();
		//hpg.verifyTitle(title);
		
		
	  }
}
