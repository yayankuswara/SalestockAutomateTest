Feature: Action Button on Website
  I want to explore all Access button on page

  @AccessTeaCollection
  Scenario: Access 'Herbal Tea' Collection from 'Homepage'
    Given Access homepage
    When Click button see collection herbal tea
    Then Must be in menu page

  @AccessTeaCollection
  Scenario: Access 'Herbal Tea' Collection from 'Welcome' Page
    Given Access welcome page
    When Click button see collection herbal tea
    Then Must be in menu page

  @AccessTeaCollection
  Scenario: Access 'Loose Tea' Collection from 'Homepage'
    Given Access homepage
    When Click button see collection loose tea
    Then Must be in menu page

  @AccessTeaCollection
  Scenario: Access 'Loose Tea' Collection from 'Welcome' Page
    Given Access welcome page
    When Click button see collection loose tea
    Then Must be in menu page

  @AccessTeaCollection
  Scenario: Access 'Flavored Tea' Collection from 'Homepage'
    Given Access homepage
    When Click button see collection Flavored tea
    Then Must be in menu page

  @AccessTeaCollection
  Scenario: Access 'Herbal Tea' Collection from 'Welcome' Page
    Given Access welcome page
    When Click button see collection Flavored tea
    Then Must be in menu page

  @AccessCheckOutItem
  Scenario: Access 'Green Tea' Check Out
    Given Access menu page
    When Click button check out green tea
    Then Must be in check out page

  @AccessCheckOutItem
  Scenario: Access 'Red Tea' Check Out
    Given Access menu page
    When Click button check out red tea
    Then Must be in check out page

  @AccessCheckOutItem
  Scenario: Access 'Oolong Tea' Check Out
    Given Access menu page
    When Click button check out oolong tea
    Then Must be in check out page
