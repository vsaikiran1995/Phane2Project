@Sanity
Feature: Checking the login functionality of SwagLabs application from browser
  
  Scenario: Login function using valid credentials
    Given I have launched the application from browser
     When I enter username as "standard_user"
      And I enter password as "secret_sauce"
      And I have click on login button
     Then I should land on home page
  
  Scenario Outline: Login function using invalid credentials
    Given I have launched the application from browser
     When I enter username as "<UserName>"
      And I enter password as "<Password>"
      And I have click on login button
     Then I should get the error message as "<Error>"
  
    Examples: 
      | UserName        | Password     | Error                                                                     | 
      | standard_user   | 12345        | Epic sadface: Username and password do not match any user in this service | 
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       | 
