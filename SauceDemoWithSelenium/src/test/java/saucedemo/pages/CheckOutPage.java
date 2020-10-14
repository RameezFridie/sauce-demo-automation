package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

    WebDriver driver;
    @FindBy(how = How.CSS, using = "[class='btn_action cart_button']")
    WebElement finishOderButton;

    public CheckOutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public OrderSuccessfulPage navigateToOrderSuccessfulPage() {
        finishOderButton.click();
        return new OrderSuccessfulPage(driver);
    }
}
