package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage extends BaseTest {
	

	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyElements(WebElement element)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfAllElements(element));
			Reporter.log("element is found", true );
		}
		
		catch(Exception e)
		{
			Reporter.log("Element is not found", true);
			Assert.fail(); // if it fails it will stop here itself
		}
	}

	public void verifyTitle(String title)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("title is matching", true );
		}
		
		catch(Exception e)
		{
			Reporter.log("title is not matching", true);
			Assert.fail(); // if it fails it will stop here itself
		}
		}
	}

