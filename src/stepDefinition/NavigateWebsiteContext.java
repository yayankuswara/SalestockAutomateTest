package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NavigateWebsiteContext 
{
	WebDriver driver;
	boolean result;
	
	@Given("^Access homepage$")
	public void Access_homepage() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.AccessPage("http://www.practiceselenium.com/");
	}

	@Given("^Access welcome page$")
	public void Access_welcome_page() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.AccessPage("http://www.practiceselenium.com/welcome.html");
	}
	
	@Given("^Access our passion page$")
	public void Access_our_passion_page() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.AccessPage("http://www.practiceselenium.com/our-passion.html");
	}
	
	@Given("^Access menu page$")
	public void Access_menu_page() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.AccessPage("http://www.practiceselenium.com/menu.html");
	}
	
	@Given("^Access lets talk tea page$")
	public void Access_lets_talk_tea_page() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.AccessPage("http://www.practiceselenium.com/let-s-talk-tea.html");
	}
	
	@Given("^Access check out page$")
	public void Access_check_out_page() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.AccessPage("http://www.practiceselenium.com/check-out.html");
	}
	
	@When("^Click side menu welcome$")
	public void Click_side_menu_welcome() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ClickMainMenuLink("Welcome");
	}
	
	@When("^Click side menu our passion$")
	public void Click_side_menu_our_passion() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ClickMainMenuLink("Our Passion");
	}
	
	@When("^Click side menu menu$")
	public void Click_side_menu_menu() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ClickMainMenuLink("Menu");
	}
	
	@When("^Click side menu lets talk tea$")
	public void Click_side_menu_lets_talk_tea() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ClickMainMenuLink("Let's Talk Tea");
	}
	
	@When("^Click side menu check out$")
	public void Click_side_menu_check_out() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ClickMainMenuLink("Check Out");
	}
	
	@When("^Click side bar more organic tea$")
	public void Click_side_bar_more_organic_tea() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ClickSideBarMoreLink("wsb-element-00000000-0000-0000-0000-000450914883");
	}
	
	@When("^Click side bar more tea of the month$")
	public void Click_side_bar_more_tea_of_the_month() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ClickSideBarMoreLink("wsb-element-00000000-0000-0000-0000-000450914882");
	}

	@Then("^Must be in welcome page$")
	public void Must_be_in_welcome_page() throws Throwable 
	{
		result = CommonCase.VerifyActivePage(driver,"Welcome");
		Assert.assertTrue(result);
	}
	
	@Then("^Must be in our passion page$")
	public void Must_be_in_our_passion_page() throws Throwable 
	{
		result = CommonCase.VerifyActivePage(driver,"Our Passion");
		Assert.assertTrue(result);
	}
	
	@Then("^Must be in menu page$")
	public void Must_be_in_menu_page() throws Throwable 
	{
		result = CommonCase.VerifyActivePage(driver,"Menu");
		Assert.assertTrue(result);
	}
	
	@Then("^Must be in lets talk tea page$")
	public void Must_be_in_lets_talk_tea_page() throws Throwable 
	{
		result = CommonCase.VerifyActivePage(driver,"Let's Talk Tea");
		Assert.assertTrue(result);
	}
	
	@Then("^Must be in check out page$")
	public void Must_be_in_check_out_page() throws Throwable 
	{
		result = CommonCase.VerifyActivePage(driver,"Check Out");
		Assert.assertTrue(result);
	}
}
