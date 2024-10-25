package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sketelonConsole {

	// the Background keyword is used to define steps that are common to all
	// scenarios in a feature file. It is similar to a scenario, but it runs before
	// each scenario in the feature.

	@Given("user must have the url present")
	public void test01() {
		System.out.println("010101010101001010101");

		System.out.println("*******************************");
		
		System.out.println("Surya new git commit");
	}

	@When("credentials are used for navigating to the homepage")
	public void test02() {
		System.out.println("02020202020202020202");
	}

	@Then("will land you to the screen")
	public void test03() {
		System.out.println("03030303030303030303030");

		System.out.println("0333333333333333333333333333333");
	}

	@Given("user is on common login page")
	public void user_is_on_common_login_page() {

		System.out.println("user is on common login page01");
	}

	@When("user navigated to the main page")
	public void user_navigated_to_the_main_page() {

		System.out.println("user navigated to the main page02");

		System.out.println("Surya new git commit");
	}

	@Then("user successfully switched to home page")
	public void user_successfully_switched_to_home_page() {

		System.out.println("user successfully switched to home page03");
	}

	@Then("products are displaying")
	public void products_are_displaying() {

		System.out.println("products are displaying04");
		System.out.println("***************************");

		System.out.println("Surya new git commit");
	}

//this is 02 scenario in features file (this is only for string variables)
	@When("user navigated to the main page with {string} and {string}")
	public void user_navigated_to_the_main_page_with_and(String username, String password) {

		System.out.println(" user navigated to the main page with " + username + " and to use the " + password);
	}

// if we want to run the same test case with different users more that one times means we can use this 
// are used whern the same test is performed muyltiple times with a different combination of values by using dillimeter
	// parameterization method04 line no 3
	@When("user credentials showing in the top of the page with {string} and below as {string}")
	public void user_credentials_showing_in_the_top_of_the_page_with_and_below_as(String username, String password01) {

		System.out.println("username is " + username + " password is " + password01);

	}

//for ex if we want to use int or char or any data types means we cna use "Regex Pattern " 
// that means we have to start with ( ^ ) and ends with  ( $ ) but whereever the datavariables required we ahve to use (.+) it will take any datatype

	// Regex Pattern05 ( 02 line in feature file)

	@When("^user page is navigated to the main page with (.+) and (.+)$")
	public void user_page_is_navigated_to_the_main_page_with_surya_and(String name, String password) {

		System.out.println(name + password);
	}

	// Regex Pattern05 (03 line in feature file)
	@When("^usser profile page having (.+) and below as (.+)$")
	public void usser_profile_page_having_and_below_as_password(String user, String pass) {

		System.out.println("regex output " + user + " and " + pass);
	}

	// List of values06 (02 line in feature file)
	// it is not working
	/*
	 * @When("user page is navigated to the main page with  list of values") public
	 * void user_page_is_navigated_to_the_main_page_with_list_of_values(List<String>
	 * data) {
	 * 
	 * System.out.println(data.get(0)); System.out.println(data.get(1));
	 * System.out.println(data.get(2)); System.out.println(data.get(3));
	 * 
	 * 
	 * }
	 */
	
	
	
	//02 .) SecondProgram.feature
	
	@Before("SBIBanking")
	@Given("It is common for this feature file only not for other files")
	public void it_is_common_for_this_feature_file_only_not_for_other_files() {
		
		System.out.println("________________________________");
	}
	
	@Before("@SBIBanking")
	@Given("SBI credit card fillup form")
	public void sbi_credit_card_fillup_form() {

		System.out.println("SBI Card");
	}
	
	@When("Entered the details {string} in the system {string} criteria")
	public void entered_the_details_in_the_system_criteria(String details, String form) {
		
		System.out.println(details + form);
	}
	

@When("Entered SBI the details {string} in the system {string} criteria")
public void entered_sbi_the_details_in_the_system_criteria(String details, String form) {

	System.out.println("SBI " + details + form);
}
	
	@Then("report generate that SBI credit card process is done")
	public void report_generate_that_sbi_credit_card_process_is_done() {
		System.out.println("porcess completed");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	
	@Before("@HDFCBanking")
	@Given("HDFC credit card fillup form")
	public void hdfc_credit_card_fillup_form() {

		System.out.println("HDFC Credit ard");
	}

	

@When("^Entered HDFC the details (.+) in the system (.+) criteria$")
public void entered_hdfc_the_details_in_the_system_criteria(String string012, String string021) {
	
	System.out.println("HDFC" + string012 + string021 );
}
	
	@Then("^report generate that HDFC (.+) credit card (.+) process is done$")
	public void report_generate_that_hdfc_bank_name_credit_card_process_is_done(String regex, String pattern) {
		
		System.out.println(regex + pattern);
		
	}
	
	@When("Entered the detains User details in the system {string} criteria")
	public void entered_the_detains_user_details_in_the_system_criteria(String string3) {
		
		System.out.println(string3);
	}
	

}
