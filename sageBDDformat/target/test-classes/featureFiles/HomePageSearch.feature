@Search
Feature: Home page search

Scenario Outline:
 	Given I am on the home page
 	And I scroll down
 	Then I should see the search field
 	When I search a "<word>"
 	Then I should see the search results "<word>"
 	
 	Examples:
 	|	word	|
 	|finance	|
 	|Product	|