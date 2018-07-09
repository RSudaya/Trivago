package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constant {

	public WebDriver driver;
	static
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	 
	  @BeforeMethod
	    public void openapp()
	    {
		  
		  driver=new FirefoxDriver();
		  //driver.get("https://www.trivago.in");
		   String pp = PropertyFile.pfile(FILEPATH, "URL");
		   driver.get(pp);
		  
	    }
	  
	  @AfterMethod
	    public void closeapp()
	    {
		  driver.quit();
	    }
}
