

Feature: Title of your feature
  I want to use this template for my feature file
  
  Background:
  
  Given It is common for this feature file only not for other files
  

    @RegressionTest @SmokeTest @SBIBanking
    Scenario: SBI Credit card Process (reuasbility)
    
    Given SBI credit card fillup form
    When Entered SBI the details "User details" in the system "form" criteria
    Then report generate that SBI credit card process is done
    
    @SmokeTest @HDFCBanking
    Scenario Outline: HDFC Credit card Process (parameterization)
    
    Given HDFC credit card fillup form
    When Entered HDFC the details "<User details>" in the system "<form>" criteria
    
    Then report generate that HDFC "<BankName>" credit card "<platinum card>" process is done
    
    Examples:
    | User details | from |
    | Prakash | credit form |
    | utsath | debitform |
    
    @RegressionTest
    Scenario: regex pattern format
    
    Given HDFC credit card fillup form
    When Entered the detains User details in the system "form" criteria
    
    Then report generate that HDFC <BankName> credit card "<platinum card>" process is done
    
    
    
    
    
    
    
