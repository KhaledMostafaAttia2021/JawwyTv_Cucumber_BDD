package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountPage extends PageBase {
	public NewAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"subscription-container\"]/div/div/section/p/a")
	WebElement clickHereLink;

	public void Click_Here() {
		clickHereLink.click();
	}

	@FindBy(xpath = "//*[@id=\"subscription-container\"]/div/div/section/div[2]/p/a")
	WebElement Terms_Conditions_Container;

	public void TermsANDConditions() {
		Terms_Conditions_Container.click();
	}

	@FindBy(id = "email")
	WebElement emailTxtBox;

	@FindBy(id = "password")
	WebElement passwordTxtBox;

	@FindBy(xpath = "//*[@id=\"sub_form\"]")
	WebElement continueBtn;

	public void CreateAccount(String email, String password) {
		setTextElementText(emailTxtBox, email);
		setTextElementText(passwordTxtBox, password);
		continueBtn.click();
	}

}