package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class OrderSuccessfulPage {

    WebDriver driver;
    @FindBy(how = How.CSS, using = "[class='complete-header']")
    WebElement thankYouMessage;

    public OrderSuccessfulPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getThankYouMessage() {
        return thankYouMessage.getText();
    }
}