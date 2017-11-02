package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonCase 
{
	WebDriver driver;
		
	public void AccessPage(String urlLink) 
	{
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(urlLink);
	}
	
	public void ClickMainMenuLink(String textMenu) 
	{
		driver.findElement(By.linkText(textMenu)).click();
	}
	
	public static boolean VerifyActivePage(WebDriver driver, String expectedTitle) 
	{
		boolean result = false;
		
		if(driver.getTitle().equalsIgnoreCase(expectedTitle))
		{
			result = true;
		}
		
		return result;
	}
	
	public void ClickSideBarMoreLink(String iDLink) 
	{
		driver.findElement(By.id(iDLink)).click();
	}
	
	public void ClickButtonCollection(String iDButton) 
	{
		driver.findElement(By.id(iDButton)).click();
	}
	
	public void ClickButtonCheckOut(String iDButton)  
	{
		driver.findElement(By.id(iDButton)).click();
	}
	
	public void FillFormContact(String fieldName, String value)  
	{
		driver.findElement(By.name(fieldName)).sendKeys(value);
	}
	
	public void ClickButtonSubmitFormContact(String className) 
	{
		driver.findElement(By.className(className)).click();
	}
	
	public void ViewAlertMessage(String className)
	{
		driver.findElement(By.className(className));
	}
	
	public void FillFormCheckOut(String fieldName, String value)
	{
		driver.findElement(By.id(fieldName)).sendKeys(value);
	}
	
	public void PickDropdownFormCheckOut(String fieldName, String value)
	{
		Select select = new Select(driver.findElement(By.id(fieldName)));
		select.selectByVisibleText(value);
	}
	
	public void ClickLinkCancel(String textLink)
	{
		driver.findElement(By.linkText(textLink)).click();
	}
	
	public void ClickButtonSubmitCheckOut(String pathButton)
	{
		driver.findElement(By.xpath(pathButton)).click();
	}
}
