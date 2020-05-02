package PageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	public WebDriver driver;
	
	By category= By.cssSelector("[class='ui-native-dropdown']");
	By search=By.xpath("//div[contains(@class,'search-logo-container')]//input[contains(@name,'searchKey')]");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public void selectcategory()
	
	{
		
		Select s= new Select (driver.findElement(category));
		s.selectByVisibleText("Groceries");
		
    }
	
    public WebElement searchitem()
    {
    	return driver.findElement(search);
    }


}
