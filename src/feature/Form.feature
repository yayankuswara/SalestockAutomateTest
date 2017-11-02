Feature: Submit Form on Website
  I want to submit form on website

  @FormContact
  Scenario: Submit Form 'Contact' with All Fields Empty
    Given Access lets talk tea page
    When Click button submit form contact
    Then Must see error message

  @FormContact
  Scenario: Submit Form 'Contact' with Field 'Name' Empty
    Given Access lets talk tea page
    When Fill form contact with field name empty
	    And Click button submit form contact
    Then Must see error message

  @FormContact
  Scenario: Submit Form 'Contact' with Field 'Email' Empty
    Given Access lets talk tea page
    When Fill form contact with field email empty
  	  And Click button submit form contact
    Then Must see error message

  @FormContact
  Scenario: Submit Form 'Contact' with Field 'Subject' Empty
    Given Access lets talk tea page
    When Fill form contact with field subject empty
    	And Click button submit form contact
    Then Must see error message

  @FormContact
  Scenario: Submit Form 'Contact' with Field 'Message' Empty
    Given Access lets talk tea page
    When Fill form contact with field message empty
    	And Click button submit form contact
    Then Must see error message

  @FormContact
  Scenario: Submit Form 'Contact' with All Fields Filled
    Given Access lets talk tea page
    When Fill form contact
  	  And Click button submit form contact
    Then Must see success message

  @FormCheckOut
  Scenario: Submit Form 'Check Out' with All Fields Empty
    Given Access check out page
    When Click button submit form check out
    Then Must see error message

  @FormCheckOut
  Scenario: Cancel Form 'Check Out' with All Fields Empty
    Given Access check out page
    When Click link cancel form check out
    Then Must be in menu page

  @FormCheckOut
  Scenario: Submit Form 'Check Out' with Field 'Email' Empty
    Given Access check out page
    When Fill form check out with field email empty
    	And Click button submit form check out
    Then Must see error message

  @FormCheckOut
  Scenario: Submit Form 'Check Out' with Field 'Name' Empty
    Given Access check out page
    When Fill form check out with field name empty
	    And Click button submit form check out
    Then Must see error message

  @FormCheckOut
  Scenario: Submit Form 'Check Out' with Field 'Address' Empty
    Given Access check out page
    When Fill form check out with field address empty
	    And Click button submit form check out
    Then Must see error message

  @FormCheckOut
  Scenario: Submit Form 'Check Out' with Field 'Card Type' Empty
    Given Access check out page
    When Fill form check out with field card type empty
 	   And Click button submit form check out
    Then Must see error message

  @FormCheckOut
  Scenario: Submit Form 'Check Out' with Field 'Card Number' Empty
    Given Access check out page
    When Fill form check out with field card number empty
	    And Click button submit form check out
    Then Must see error message

  @FormCheckOut
  Scenario: Submit Form 'Check Out' with Field 'Card Holder Name' Empty
    Given Access check out page
    When Fill form check out with field card holder name empty
	    And Click button submit form check out
    Then Must see error message

  @FormCheckOut
  Scenario: Submit Form 'Check Out' with Field 'Verification Code' Empty
    Given Access check out page
    When Fill form check out with field verification code empty
 	   And Click button submit form check out
    Then Must see error message

  @FormCheckOut
  Scenario: Submit Form 'Check Out' with All Fields Filled
    Given Access check out page
    When Fill form check out
  	  And Click button submit form check out
    Then Must see success message

  @FormCheckOut
  Scenario: Cancel Form 'Check Out' with All Fields Filled
    Given Access check out page
    When Fill form check out
    	And Click link cancel form check out
    Then Must be in menu page
