package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FormContext 
{
	@When("^Fill form contact$")
	public void Fill_form_contact() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.FillFormContact("name", "Test Salestock");
		CommonCase.FillFormContact("email", "salestock@test.com");
		CommonCase.FillFormContact("subject", "Subject Message");
		CommonCase.FillFormContact("message", "Contain Message");
	}
	
	@When("^Fill form contact with field name empty$")
	public void Fill_form_contact_with_field_name_empty() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.FillFormContact("name", "");
		CommonCase.FillFormContact("email", "salestock@test.com");
		CommonCase.FillFormContact("subject", "Subject Message");
		CommonCase.FillFormContact("message", "Contain Message");
	}
	
	@When("^Fill form contact with field email empty$")
	public void Fill_form_contact_with_field_email_empty() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.FillFormContact("name", "Test Salestock");
		CommonCase.FillFormContact("email", "");
		CommonCase.FillFormContact("subject", "Subject Message");
		CommonCase.FillFormContact("message", "Contain Message");
	}
	
	@When("^Fill form contact with field subject empty$")
	public void Fill_form_contact_with_field_subject_empty() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.FillFormContact("name", "Test Salestock");
		CommonCase.FillFormContact("email", "salestock@test.com");
		CommonCase.FillFormContact("subject", "");
		CommonCase.FillFormContact("message", "Contain Message");
	}

	@When("^Fill form contact with field message empty$")
	public void Fill_form_contact_with_field_message_empty() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.FillFormContact("name", "Test Salestock");
		CommonCase.FillFormContact("email", "salestock@test.com");
		CommonCase.FillFormContact("subject", "Subject Message");
		CommonCase.FillFormContact("message", "");
	}
	
	@When("^Fill form check out$")
	public void Fill_form_check_out() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.AccessPage("http://www.practiceselenium.com/check-out.html");
		CommonCase.FillFormCheckOut("email", "salestock@test.com");
		CommonCase.FillFormCheckOut("name", "Test Salestock");
		CommonCase.FillFormCheckOut("address", "Address Salestock");
		CommonCase.PickDropdownFormCheckOut("card_type", "American Express");
		CommonCase.FillFormCheckOut("card_number", "Card Number");
		CommonCase.FillFormCheckOut("cardholder_name", "Card Holder");
		CommonCase.FillFormCheckOut("verification_code", "Verification Code");
	}
	
	@When("^Fill form check out with field email empty$")
	public void Fill_form_check_out_with_field_email_empty() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.AccessPage("http://www.practiceselenium.com/check-out.html");
		CommonCase.FillFormCheckOut("email", "");
		CommonCase.FillFormCheckOut("name", "Test Salestock");
		CommonCase.FillFormCheckOut("address", "Address Salestock");
		CommonCase.PickDropdownFormCheckOut("card_type", "American Express");
		CommonCase.FillFormCheckOut("card_number", "Card Number");
		CommonCase.FillFormCheckOut("cardholder_name", "Card Holder");
		CommonCase.FillFormCheckOut("verification_code", "Verification Code");
	}

	@When("^Fill form check out with field name empty$")
	public void Fill_form_check_out_with_field_name_empty() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.AccessPage("http://www.practiceselenium.com/check-out.html");
		CommonCase.FillFormCheckOut("email", "salestock@test.com");
		CommonCase.FillFormCheckOut("name", "");
		CommonCase.FillFormCheckOut("address", "Address Salestock");
		CommonCase.PickDropdownFormCheckOut("card_type", "American Express");
		CommonCase.FillFormCheckOut("card_number", "Card Number");
		CommonCase.FillFormCheckOut("cardholder_name", "Card Holder");
		CommonCase.FillFormCheckOut("verification_code", "Verification Code");
	}

	@When("^Fill form check out with field address empty$")
	public void Fill_form_check_out_with_field_address_empty() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.AccessPage("http://www.practiceselenium.com/check-out.html");
		CommonCase.FillFormCheckOut("email", "salestock@test.com");
		CommonCase.FillFormCheckOut("name", "Test Salestock");
		CommonCase.FillFormCheckOut("address", "");
		CommonCase.PickDropdownFormCheckOut("card_type", "American Express");
		CommonCase.FillFormCheckOut("card_number", "Card Number");
		CommonCase.FillFormCheckOut("cardholder_name", "Card Holder");
		CommonCase.FillFormCheckOut("verification_code", "Verification Code");
	}

	@When("^Fill form check out with field card type empty$")
	public void Fill_form_check_out_with_field_card_type_empty() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.AccessPage("http://www.practiceselenium.com/check-out.html");
		CommonCase.FillFormCheckOut("email", "salestock@test.com");
		CommonCase.FillFormCheckOut("name", "Test Salestock");
		CommonCase.FillFormCheckOut("address", "Address Salestock");
		CommonCase.PickDropdownFormCheckOut("card_type", "");
		CommonCase.FillFormCheckOut("card_number", "Card Number");
		CommonCase.FillFormCheckOut("cardholder_name", "Card Holder");
		CommonCase.FillFormCheckOut("verification_code", "Verification Code");
	}

	@When("^Fill form check out with field card number empty$")
	public void Fill_form_check_out_with_field_card_number_empty() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.AccessPage("http://www.practiceselenium.com/check-out.html");
		CommonCase.FillFormCheckOut("email", "salestock@test.com");
		CommonCase.FillFormCheckOut("name", "Test Salestock");
		CommonCase.FillFormCheckOut("address", "Address Salestock");
		CommonCase.PickDropdownFormCheckOut("card_type", "American Express");
		CommonCase.FillFormCheckOut("card_number", "");
		CommonCase.FillFormCheckOut("cardholder_name", "Card Holder");
		CommonCase.FillFormCheckOut("verification_code", "Verification Code");
	}

	@When("^Fill form check out with field card holder name empty$")
	public void Fill_form_check_out_with_field_card_holder_name_empty() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.AccessPage("http://www.practiceselenium.com/check-out.html");
		CommonCase.FillFormCheckOut("email", "salestock@test.com");
		CommonCase.FillFormCheckOut("name", "Test Salestock");
		CommonCase.FillFormCheckOut("address", "Address Salestock");
		CommonCase.PickDropdownFormCheckOut("card_type", "American Express");
		CommonCase.FillFormCheckOut("card_number", "Card Number");
		CommonCase.FillFormCheckOut("cardholder_name", "");
		CommonCase.FillFormCheckOut("verification_code", "Verification Code");
	}

	@When("^Fill form check out with field verification code empty$")
	public void Fill_form_check_out_with_field_verification_code_empty() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.AccessPage("http://www.practiceselenium.com/check-out.html");
		CommonCase.FillFormCheckOut("email", "salestock@test.com");
		CommonCase.FillFormCheckOut("name", "Test Salestock");
		CommonCase.FillFormCheckOut("address", "Address Salestock");
		CommonCase.PickDropdownFormCheckOut("card_type", "American Express");
		CommonCase.FillFormCheckOut("card_number", "Card Number");
		CommonCase.FillFormCheckOut("cardholder_name", "Card Holder");
		CommonCase.FillFormCheckOut("verification_code", "");
	}
	
	@When("^Click button submit form contact$")
	public void Click_button_submit_form_contact() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ClickButtonSubmitFormContact("form-submit");
	}
	
	@When("^Click link cancel form check out$")
	public void Click_link_cancel_form_check_out() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ClickLinkCancel("Cancel");
	}
	
	@When("^Click button submit form check out$")
	public void Click_button_submit_form_check_out() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ClickButtonSubmitCheckOut("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button");
	}
	
	@Then("^Must see success message$")
	public void Must_see_success_message() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ViewAlertMessage("alert success");
	}
	
	@Then("^Must see error message$")
	public void Must_see_error_message() throws Throwable 
	{
		CommonCase CommonCase = new CommonCase();
		CommonCase.ViewAlertMessage("alert");
	}
}
