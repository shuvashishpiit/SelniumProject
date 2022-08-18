package pages;

import browser.Browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

import static browser.Browser.getPropertyValue;

public class HomePage {

    WebDriver driver = Browser.getDriver();

    @FindBy(linkText = "Register") private WebElement registerLink;
    @FindBy(id = "customer.firstName") private WebElement firstName;
    @FindBy(id = "customer.lastName") private WebElement lastName;
    @FindBy(id = "customer.address.street") private WebElement address;
    @FindBy(id = "customer.address.city") private WebElement city;
    @FindBy(id = "customer.address.state") private WebElement state;
    @FindBy(id = "customer.address.zipCode") private WebElement zipCode;
    @FindBy(id = "customer.phoneNumber") private WebElement phoneNumber;
    @FindBy(id = "customer.ssn") private WebElement ssn;
    @FindBy(id = "customer.username") private WebElement userName;
    @FindBy(id = "customer.password") private WebElement password;
    @FindBy(id = "repeatedPassword") private WebElement repeatedPassword;
    @FindBy(css = "input[value='Register']") private WebElement registerButton;

    public OverViewPage registerUser() {
        String info = getPropertyValue("info");
        registerLink.click();
        firstName.sendKeys(info);
        lastName.sendKeys(info);
        city.sendKeys(info);
        address.sendKeys(info);
        state.sendKeys(info);
        zipCode.sendKeys(info);
        phoneNumber.sendKeys(info);
        ssn.sendKeys(info);
        userName.sendKeys(info);
        password.sendKeys(info);
        repeatedPassword.sendKeys(info);
        registerButton.click();

        return PageFactory.initElements(Browser.getDriver(), OverViewPage.class);
    }





}
