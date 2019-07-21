package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {
	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
		action = new Actions(driver);
	}

	@FindBy(className = "header__btn-lang-2")
	WebElement interfacingLanguage;

	@FindBy(xpath = "/html/body/header/a[4]/span[6]")
	WebElement subscribeNow;

	public void Change_Interfacing_Language() {
		interfacingLanguage.click();
	}

	public void Subscribing() {
		subscribeNow.click();
	}

}