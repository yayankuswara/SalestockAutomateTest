package stepDefinition;

import cucumber.api.java.en.When;

public class ActionAccessContext 
{
	
	@When("^Click button see collection herbal tea$")
	public void Click_button_see_collection_herbal_tea() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ClickButtonCollection("wsb-element-00000000-0000-0000-0000-000450914890");
	}

	@When("^Click button see collection loose tea$")
	public void Click_button_see_collection_loose_tea() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ClickButtonCollection("wsb-button-00000000-0000-0000-0000-000450914897");
	}

	@When("^Click button see collection Flavored tea$")
	public void Click_button_see_collection_Flavored_tea() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ClickButtonCollection("wsb-button-00000000-0000-0000-0000-000450914899");
	}
	
	@When("^Click button check out green tea$")
	public void Click_button_check_out_green_tea() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ClickButtonCheckOut("wsb-button-00000000-0000-0000-0000-000451955160");
	}
	
	@When("^Click button check out red tea$")
	public void Click_button_check_out_red_tea() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ClickButtonCheckOut("wsb-button-00000000-0000-0000-0000-000451959280");
	}
	
	@When("^Click button check out oolong tea$")
	public void Click_button_check_out_oolong_tea() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ClickButtonCheckOut("wsb-button-00000000-0000-0000-0000-000451961556");
	}
}
