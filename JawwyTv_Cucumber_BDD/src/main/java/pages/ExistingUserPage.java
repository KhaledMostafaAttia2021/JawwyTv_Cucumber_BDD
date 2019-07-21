package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExistingUserPage extends PageBase {
	public ExistingUserPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"not_user_subscribe\"]")
	WebElement subscribeLink;

	public void Subscribe() {
		subscribeLink.click();
	}

}