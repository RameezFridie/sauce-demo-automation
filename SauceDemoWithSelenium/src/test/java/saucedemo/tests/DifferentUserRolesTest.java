package saucedemo.tests;

import ru.yandex.qatools.allure.annotations.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import saucedemo.BaseTest;
import saucedemo.pages.*;

import java.io.IOException;

public class DifferentUserRolesTest extends BaseTest {
    LoginPage loginPage;

    @BeforeMethod
    public void setup() throws IOException {
        super.setup();
        loginPage = new LoginPage(getDriver());
    }
    @Description("As a user with a problem_user account, ")
    @Test
    public void problemUserTest() {
        ProductsPage productsPage = loginPage.login("problem_user");
        ViewCartPage viewCartPage = productsPage.navigateToCartPage();
        viewCartPage.navigateBackToTheProductsPage();
        Assert.assertEquals(productsPage.getTheProductsTitleFromProductsPage(), "Products");
    }

    @Test
    public void standardUserTest() {
        ProductsPage productsPage = loginPage.login("standard_user");
        productsPage.clickAddToCartButton();
        ViewCartPage viewCartPage = productsPage.navigateToCartPage();
        PaymentsPage paymentsPage = viewCartPage.navigateToPaymentsDetailsPage();
        CheckOutPage checkOutPage = paymentsPage.navigateToCheckOutPage();
        OrderSuccessfulPage orderSuccessfulPage = checkOutPage.navigateToOrderSuccessfulPage();
        Assert.assertEquals(orderSuccessfulPage.getThankYouMessage(), "THANK YOU FOR YOUR ORDER");
    }
}
