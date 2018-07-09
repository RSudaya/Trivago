package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BasePage;


public class HomePageClass extends BasePage {

	//Deceleration
	  @FindBy (xpath="//button[@class='siteheader__control td-none--hover js_log']")
	  private WebElement myprofile;
	
	    @FindBy (xpath="//a[@class='link-list__link td-none--hover js_log js_logIn']")
	    private WebElement loginlink;
	
		@FindBy (id="login_email")
		private WebElement usernametextbox;
		
		@FindBy (id="login_password")
		private WebElement passwordtextbox;
		
		@FindBy (xpath="//button[@type='submit']")
		private WebElement loginbtn;
		
		@FindBy (id="horus-querytext")
		private WebElement searchtextbox;
		
		@FindBy (xpath="//button[@class='btn btn--primary horus-btn-search']")
		private WebElement searchbtn;
		
		
		
		
		//Initialization
		public HomePageClass(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		public void myprofile()
		{
			myprofile.click();
		}
		
		public void loginlink()
		{
			loginlink.click();
		}
		public void username(String usname) 
		{
			usernametextbox.sendKeys(usname);
		}
			
		public void password(String pswrdname)
		{
			passwordtextbox.sendKeys(pswrdname);
		}
		
		public void lbtn()
		{
			loginbtn.click();
		}
		
		public void search(String value)
		{
			searchtextbox.sendKeys(value);
		}

		public void sbtn() 
		{
			searchbtn.click();
		}
		
		public void verifyTitle(String actualtitle)
		{
			String title = driver.getTitle();
			Assert.assertEquals(title, actualtitle);
		}

}
