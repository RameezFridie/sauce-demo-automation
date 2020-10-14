package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    @FindBy(how = How.ID, using = "user-name")
    WebElement usernameInputField;
    @FindBy(how = How.ID, using = "password")
    WebElement passwordInputField;
    @FindBy(how = How.ID, using = "login-button")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public ProductsPage login(String username) {
        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys("secret_sauce");
        loginButton.click();
        return new ProductsPage(driver);
    }
}