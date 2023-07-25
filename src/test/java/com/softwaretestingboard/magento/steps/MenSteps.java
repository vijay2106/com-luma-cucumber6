package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MenSteps {
    @When("I mouse hoover on Men Menu")
    public void iMouseHooverOnMenMenu() throws InterruptedException {
        new HomePage().mouseHooverToMenMenu();
    }

    @And("I mouse hoover on Bottoms")
    public void iMouseHooverOnBottoms() throws InterruptedException {
        new HomePage().mouseHooverToBottomsMenu();
    }

    @And("I click on Pants")
    public void iClickOnPants() throws InterruptedException {
        new HomePage().clickOnPants();
    }

    @And("I mouse hoover and click on size")
    public void iMouseHooverAndClickOnSize() throws InterruptedException {
        new MenPage().clickOnPantSize();
    }

    @And("I mouse hoover and click on colour")
    public void iMouseHooverAndClickOnColour() throws InterruptedException {
        new MenPage().clickOnPantColour();
    }

    @And("I click on add to cart buttons")
    public void iClickOnAddToCartButtons() throws InterruptedException {
        new MenPage().clickOnAddToCart();
    }

    @And("I can verify the product added{string}")
    public void iCanVerifyTheProductAdded(String Message) throws InterruptedException {
        Assert.assertEquals("Text not verified",Message, new MenPage().verifyAddedItemToTheShoppingCart());
    }

    @And("I click on shopping cart link into message")
    public void iClickOnShoppingCartLinkIntoMessage() throws InterruptedException {
        new MenPage().shoppingCartLink();
    }

    @Then("I should verify the shopping cart Text{string}")
    public void iShouldVerifyTheShoppingCartText(String Message) throws InterruptedException {
        Assert.assertEquals("Text not verified", Message, new ShoppingCartPage().verifyTextMessage());
    }

    @And("I should verify the Product{string}")
    public void iShouldVerifyTheProduct(String Name) throws InterruptedException {
        Assert.assertEquals("Text not verified", Name, new ShoppingCartPage().verifyProductName());
    }

    @And("I should verify the product size{string}")
    public void iShouldVerifyTheProductSize(String Size) throws InterruptedException {
        Assert.assertEquals("Text not verified", Size, new ShoppingCartPage().verifyProductSize());
    }

    @And("I should verify the products colour{string}")
    public void iShouldVerifyTheProductsColour(String Colour) throws InterruptedException {
        Assert.assertEquals("Colour not verified", Colour, new ShoppingCartPage().verifyProductColour());
    }
}
