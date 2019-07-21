package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PaymentMethodPage extends PageBase {

	public PaymentMethodPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"subscription-container\"]/div/div/section/div[2]/div[5]/button[1]")
	WebElement backBtn;

	public void backFromSignUpForm() {

		backBtn.click();
	}

	@FindBy(name = "country")
	WebElement countrySelector;
	
	

	public void Bahrain_Country_Selection() {

		Select objSelect1 = new Select(countrySelector);
		objSelect1.selectByValue("BRN");
	}

	public void Lebanon_Country_Selection() {

		Select objSelect2 = new Select(countrySelector);
		objSelect2.selectByValue("LIB");
	}

}
