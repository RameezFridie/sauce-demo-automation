package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaymentsPage {

    WebDriver driver;
    @FindBy(how = How.ID, using = "first-name")
    WebElement firstNameInputField;
    @FindBy(how = How.ID, using = "last-name")
    WebElement lastNameInputField;
    @FindBy(how = How.ID, using = "postal-code")
    WebElement postalCodeInputField;
    @FindBy(how = How.CSS, using = "[class='btn_primary cart_button']")
    WebElement continueInputButton;

    public PaymentsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public CheckOutPage navigateToCheckOutPage() {
        firstNameInputField.sendKeys("John");
        lastNameInputField.sendKeys("Doe");
        postalCodeInputField.sendKeys("7764");
        continueInputButton.click();
        return new CheckOutPage(driver);
    }
}

