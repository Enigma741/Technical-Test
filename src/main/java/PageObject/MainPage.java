package PageObject;


import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class MainPage {
	
public WebDriver driver;
	
	By signinbutton=By.xpath("//ul[@class='utility-section']/li[1]/div");
	By NavBar=By.cssSelector("[class='utility-menu ']");
    By email=By.cssSelector("[id='username']");
    By password=By.cssSelector("[id='password']");
    By signin=By.cssSelector("[class='ui-component__button']");
    By header=By.cssSelector("[class='ui-component__form-header--title']");
	
	
	public MainPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement hitsigninbutton()
	
	{
		return driver.findElement(signinbutton);
		
    }
	
public WebElement enteremail()
	
	{
		
		return driver.findElement(email);
		
    }

public WebElement enterpassword()

{
	
	return driver.findElement(password);
	
}

public WebElement hitsignin()

{
	
	return driver.findElement(signin);
	
}

public WebElement navbar()

{
	
	return driver.findElement(NavBar);
	
}

public WebElement getheaer()
{
	return driver.findElement(header);
}

}
