@HomePage
Feature: Home Page Feature

Background: 
		Given I am on the home page

  
  Scenario: Home Page
    #Given I am on the home page
    And the page title is "Sage UK - Software & Solutions for Every Business"

  @tag2
  Scenario Outline: Navigation bar
    And I click on "<xpaths>" tab
    Then I verify "<expectedxpath>" is visible

    Examples: 
      | xpaths                          | expectedxpath |
      | /html/body/header/nav/div/ul[1]/li[2]/a| /html/body/header/nav/div/ul[1]/li[2]/div  |
      #| /html/body/header/nav/div/ul[1]/li[3]/a |/html/body/header/nav/div/ul[1]/li[3]/div      |
      #| /html/body/header/nav/div/ul[1]/li[4]/a | /html/body/header/nav/div/ul[1]/li[4]/div     |
     #| /html/body/header/nav/div/ul[1]/li[5]/a | /html/body/header/nav/div/ul[1]/li[5]/div      |
      
