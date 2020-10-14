package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewCartPage {

    WebDriver driver;
    @FindBy(how = How.CSS, using = "[class='btn_secondary']")
    WebElement continueShoppingButton;
    @FindBy(how = How.CSS, using = "[class='btn_action checkout_button']")
    WebElement checkoutButton;

    public ViewCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public PaymentsPage navigateToPaymentsDetailsPage() {
        checkoutButton.click();
        return new PaymentsPage(driver);
    }

    public ProductsPage navigateBackToTheProductsPage() {
        continueShoppingButton.click();
        return new ProductsPage(driver);
    }
}
