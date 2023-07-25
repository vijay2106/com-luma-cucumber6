package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.GearBagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OverNightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GearSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I mouse hoover on gear menu")
    public void iMouseHooverOnGearMenu() throws InterruptedException {
        new HomePage().mouseHooverToGearMenu();
    }

    @And("I click on bags tab")
    public void iClickOnBagsTab() throws InterruptedException {
        new HomePage().clickOnBags();
    }

    @And("I click on overnight duffle product")
    public void iClickOnOvernightDuffleProduct() throws InterruptedException {
        new GearBagsPage().clickOnProductNameOvernightDuffle();
    }

    @And("I verify the product text {string}")
    public void iVerifyTheProductText(String Product) throws InterruptedException {
        Assert.assertEquals("Product name is not verified", Product, new OverNightDufflePage().verifyProduceName());
    }
    @And("I change quantity{string}")
    public void iChangeQuantity(String Quantity) throws InterruptedException {
        new OverNightDufflePage().changeQuantity(Quantity);
    }
    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() throws InterruptedException {
        new OverNightDufflePage().clickOnAddCartButton();
    }

    @And("I verify the text{string}")
    public void iVerifyTheText(String Added) throws InterruptedException {
        Assert.assertEquals("Text not verified", Added, new OverNightDufflePage().verifyTheBagShoppingCartText());
    }

    @And("I click on shopping cart link from message")
    public void iClickOnShoppingCartLinkFromMessage() {
        new OverNightDufflePage().clickOnBagShoppingCartLink();
    }

    @And("I verify the product name {string}")
    public void iVerifyTheProductName(String Name) throws InterruptedException {
        Assert.assertEquals("Text not verified", Name, new ShoppingCartPage().verifyTheBagName());
    }

    @And("I verify the quantity {string}")
    public void iVerifyTheQuantity(String Quantity) throws InterruptedException {
        Assert.assertEquals("Text not verified", Quantity, new ShoppingCartPage().verifyTheQuantityNumber());
    }

    @And("I verify the product price {string}")
    public void iVerifyTheProductPrice(String Price1) throws InterruptedException {
        Assert.assertEquals("Price not verified", Price1, new ShoppingCartPage().verifyTheProductPriceInCart());
    }

    @And("I change the quantity {string}")
    public void iChangeTheQuantity(String Quantity) throws InterruptedException {
        new ShoppingCartPage().changeQuantity5();
    }

    @And("I click on update shopping cart")
    public void iClickOnUpdateShoppingCart() throws InterruptedException {
        new ShoppingCartPage().clickOnUpdateShoppingCart();
    }

    @Then("I can verify the price {string}")
    public void iCanVerifyThePrice(String Price2) throws InterruptedException {
        Assert.assertEquals("Text not verified", Price2, new ShoppingCartPage().verifyTheUpdateCartPrice());
    }


}
