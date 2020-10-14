package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    WebDriver driver;
    @FindBy(how = How.CSS, using = "[data-icon='shopping-cart']")
    WebElement shoppingCartIconButton;
    @FindBy(how = How.XPATH, using = "(//button[@class='btn_primary btn_inventory'])[1]")
    WebElement addToCartButton;
    @FindBy(how = How.CSS, using = "[class='product_label']")
    WebElement productsTitle;

    public ProductsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getTheProductsTitleFromProductsPage() {
        return productsTitle.getText();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public ViewCartPage navigateToCartPage() {
        shoppingCartIconButton.click();
        return new ViewCartPage(driver);
    }
}
