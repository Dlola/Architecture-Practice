@FieldTest
Feature: Email and Password

Description: This feature tests the Sign In page fuctionality/ validation

Scenario Outline:
	Given I am on the SignIn_page
	And I type my "<email>"
	Then I TAB
	And I type my account "<password>"
	When I click on the Sign_in button
	Then I should get an error message
	
	Examples:
	|	email	|	password	|
	|test1@gmail.com	|	phhhhhh	|
	|angular1@gmail.com|	6756786	|
	|JenkinsSim@yahh.com|	465y845	|
	 
	