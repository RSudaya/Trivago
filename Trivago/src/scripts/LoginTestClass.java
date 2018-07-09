package scripts;


import org.testng.annotations.Test;

import generic.BaseTest;
import generic.PropertyFile;
import pom.LoginPageClass;



public class LoginTestClass extends BaseTest {
	@Test
	  public void login() throws InterruptedException
	  {
			String us = PropertyFile.pfile(FILEPATH, "username");
			String ps = PropertyFile.pfile(FILEPATH, "password");
			String errmsg = PropertyFile.pfile(FILEPATH, "errormsg");
			
			LoginPageClass lpg = new LoginPageClass(driver);
			lpg.myprofile();
			lpg.loginlink();
			lpg.username(us);
			lpg.password(ps);
			Thread.sleep(2000);
			lpg.lbtn();
			lpg.errormsg1(errmsg);
			//lpg.verifyErrormsg(errmsg);
			
			
			
	  }

}
