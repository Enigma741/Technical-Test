package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Itempage {
	
public WebDriver driver;
	
	By items= By.xpath("//ul[@class='product-list grid']/li");
	
	public Itempage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public void finditems()
	
	{
		
		System.out.println(driver.findElements(items).size());
		
	
		
    }
		
		
		


}
