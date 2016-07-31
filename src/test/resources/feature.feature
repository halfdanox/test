#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Product

  Scenario: Login
		Given User is on Home Page
		When User clicks on Giris Yap 
		Then There is a match on the page "test test"
		
		
	  Scenario: Search  product 
		Given User is on Home Page
		When User searchs  on "asus zenfone go"
		Then There is a match on the search "asus zenfone go"
	
	Scenario: Keeping the  number of the product on shopping cart 
		Given  User is on Product  Page
		When   User increase product count  size  to two 
		And    User clicks on  sepete ekle
	# And    User turns back to home page 
  #	And    User clicks sepetim 
   	Then   There should be "2" pieces of selected product  
		
			
