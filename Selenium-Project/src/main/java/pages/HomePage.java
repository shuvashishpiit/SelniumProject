package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static browser.Browser.getPropertyValue;

public class HomePage {

    @FindBy(id = "txtUsername") private WebElement userNameElement;
    @FindBy(id = "txtPassword") private WebElement passwordElement;
    @FindBy(id = "btnLogin") private WebElement loginButton;

    public void logIn() {
        userNameElement.sendKeys(getPropertyValue("userName"));
        passwordElement.sendKeys(getPropertyValue("password"));
        loginButton.click();

    }

}
