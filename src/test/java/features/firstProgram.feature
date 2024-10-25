
Feature: login Application page
#  I want to use this template for my feature file


Background:
    Given user must have the url present
    When credentials are used for navigating to the homepage
    Then will land you to the screen

@RegressionTest @SmokeTest
  	Scenario: User login page01
  	
  	Given user is on common login page
  	When user navigated to the main page
  	Then user successfully switched to home page
  	And products are displaying
  
  # the below two scenarios is for reusablility of code that means if there is no change in any line of steps rather that the variables then we can use this type
  
  @SmokeTest
  	Scenario: Admin login page02
  	
  		Given user is on common login page
  	When user navigated to the main page with "Surya" and "pass2345897"
  	Then user successfully switched to home page
  	And products are displaying
  	
  	@MobileTest
  	Scenario: mortgage user login page03
  	
  		Given user is on common login page
  	When user navigated to the main page with "nagesh" and "pass1234"
  	Then user successfully switched to home page
  	And products are displaying
  	
 #for ex if we want to use int or char or any data types means we cna use "Regex Pattern " 
#that means we have to start with ( ^ ) and ends with  ( $ ) but whereever the datavariables required we ahve to use (.+) it will take any datatype
   
   # if we want to run the same test case with different users more that one times means we can use this 
   #are used whern the same test is performed muyltiple times with a different combination of values by using dillimeter
    
    @RegressionTest @SmokeTest
    Scenario Outline: parameterization method04
    
    Given user is on common login page
  	When user navigated to the main page with "Surya" and "pass1234"
  	And  user credentials showing in the top of the page with "<username>" and below as "<password>"
  	Then user successfully switched to home page
  	And products are displaying
  	
  	Examples: 
  	           | username | password |
  	           | Surya Prakash | pass9876 |
  	           | Trinadha Rao | pass3456789 |
  	           | Ganga Rajeswari | pass98765 |
  	           | Kiran Mai | pass908765 |
  	
  	
 #for ex if we want to use int or char or any data types means we cna use "Regex Pattern " 
#that means we have to start with ( ^ ) and ends with  ( $ ) but whereever the datavariables required we ahve to use (.+) it will take any datatype           
  	  Scenario: Regerx Pattern05
  	  
    Given user is on common login page
  	When user page is navigated to the main page with Surya and "pass1234"
  	And  usser profile page having "<username>" and below as <password>
  	Then user successfully switched to home page
  	And products are displaying   
  	
  #if we need to add anyb datatypes variables in any step the we can add	
  	
  #	Scenario: List of values06
  	
  	
   #Given user is on common login page
  	
   #When user page is navigated to the main page with  list of values 
  	#| Surya |
  	#| Prakash |
    #| 8341542088 |
  	#| karrisuryaprakash020@gmial.com |
   #And  usser profile page having "<username>" and below as <password>
  	#Then user successfully switched to home page
  	#And products are displaying
  	
  	       
  	           
    
    
    
    	
  	