package Project;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import PageObject.Itempage;
import PageObject.LoginPage;
import PageObject.MainPage;
import Project.base;


public class HomePage extends base {
	public static Logger log =LogManager.getLogger(base.class.getName());
   @BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 
		 log.info("Driver is initialized");

	}
	
	@Test(dataProvider="InputData",dataProviderClass=TestData.class)
	//@Test
	public void LoginPageNavigation(String username, String password) throws IOException, InterruptedException
	{
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Login page");
		
		Thread.sleep(2000);
		
		MainPage r=new MainPage(driver);
       
	    Thread.sleep(2000);
	    
	    r.hitsigninbutton().click();
	    
	    Thread.sleep(4000);
        System.out.println(r.getheaer().getText());
        Assert.assertTrue(r.getheaer().getText().contains("Sign in to your account"));
	    
	    r.enteremail().click();
	    r.enteremail().sendKeys(username);
	    
	    r.enterpassword().click();
	    r.enterpassword().sendKeys(password);
	    
	    r.hitsignin().click();
	    
	    r.navbar().isDisplayed();
	    log.info("Navigation bar is displayed");
	    
	    LoginPage l=new LoginPage(driver); 
	    l.selectcategory();
	    
	    l.searchitem().click();
	    l.searchitem().sendKeys("fresh fruits");
	    l.searchitem().sendKeys(Keys.ENTER);
	    
	    
	    Itempage it=new Itempage(driver);
	    it.finditems();
	    
	}


}
