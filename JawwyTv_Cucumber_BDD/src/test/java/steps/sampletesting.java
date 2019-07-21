package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import junit.framework.Assert;

import pages.HomePage;
import pages.NewAccountPage;
import pages.ExistingUserPage;
import pages.PaymentMethodPage;

import tests.TestBase;

public class sampletesting extends TestBase {

	HomePage homeObject;
	NewAccountPage newAccountObject;
	ExistingUserPage existingUserObject;
	PaymentMethodPage paymentMethodObject;

	@Given("^Jawwytv site opens successfully$")
	public void jawwytv_site_opens_successfully() throws Throwable {
		Assert.assertTrue(driver.getCurrentUrl().contains("www.jawwy.tv"));

	}

	@When("^User changes language in welcome screen$")
	public void user_changes_language_in_welcome_screen() {
		homeObject = new HomePage(driver);
		homeObject.Change_Interfacing_Language();
	}
	
	

	@When("^User clicks on seven days free subscribe now button$")
	public void user_clicks_on_seven_days_free_subscribe_now_button() {
		homeObject = new HomePage(driver);
		homeObject.Subscribing();
		Assert.assertTrue(driver.getCurrentUrl().contains("subscribe"));

	}

	@Then("^User clicks on Click here link in create your account section$")
	public void user_clicks_on_Click_here_link_in_create_your_account_section() {
		newAccountObject = new NewAccountPage(driver);
		newAccountObject.Click_Here();
	}

	@Then("^User clicks on Subscribe link in Existing User section$")
	public void user_clicks_on_Subscribe_link_in_Existing_User_section() {
		existingUserObject = new ExistingUserPage(driver);
		existingUserObject.Subscribe();

	}

	@Then("^User should navigate to Create your account section$")
	public void user_should_navigate_to_Create_your_account_section() {
		Assert.assertTrue(driver.getClass().getName().contains("Create your account"));
	}

	@When("^User enters UserName and Password$")
	public void user_enters(String username, String password) {
		newAccountObject = new NewAccountPage(driver);
		newAccountObject.CreateAccount(username, password);

	}

	@Given("^User should selects Lebanon from country dropdown menu$")
	public void user_should_selects_Lebanon_from_country_dropdown_menu() {
		paymentMethodObject = new PaymentMethodPage(driver);
		paymentMethodObject.Lebanon_Country_Selection();

	}

	@Then("^User should see that only credit card payment method is displayed$")
	public void user_should_see_that_only_credit_card_payment_method_is_displayed() {
		paymentMethodObject = new PaymentMethodPage(driver);
		Assert.assertFalse(driver.getClass().getName().contains("signup-form__input signup-form__input--mobile"));

	}

	@Given("^User should selects Bahrain from country dropdown menu$")
	public void user_should_selects_Bahrain_from_country_dropdown_menu() {
		paymentMethodObject = new PaymentMethodPage(driver);
		paymentMethodObject.Bahrain_Country_Selection();

	}

	@Then("^User should see that two payment methods are displayed$")
	public void user_should_see_that_two_payment_methods_are_displayed() {
		paymentMethodObject = new PaymentMethodPage(driver);
		Assert.assertTrue(driver.getClass().getName().contains("signup-form__input signup-form__input--mobile"));
	}

	@Then("^User should see back button displayed on payment screen$")
	public void user_should_see_back_button_displayed_on_payment_screen() {
		Assert.assertTrue(driver.getClass().getName().contains("signup-form__back"));
	}

	@Then("^User clicks on Terms and Conditions link in create your account section$")
	public void user_clicks_on_Terms_and_Conditions_link_in_create_your_account_section() {
		newAccountObject = new NewAccountPage(driver);
		newAccountObject.TermsANDConditions();

	}

	@Then("^User should see that Terms & Conditions section is displayed$")
	public void user_should_see_that_Terms_Conditions_section_is_displayed() {
		Assert.assertTrue(driver.getClass().getName().contains("Terms & Conditions"));
	}

}
