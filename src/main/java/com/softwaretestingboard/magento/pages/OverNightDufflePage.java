package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OverNightDufflePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement verifyName;
    @FindBy(xpath = "//input[@id='qty']")
    WebElement changeNumber;
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement clickOnButton;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyTextOnPage;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement cartLink;

    public String verifyProduceName() throws InterruptedException {
        Thread.sleep(500);
        return getTextFromElement(verifyName);
    }

    public void changeQuantity(String quantity) throws InterruptedException {
        Thread.sleep(500);
        clearTextFromField((By) changeNumber);
        sendTextToElement(changeNumber, quantity);
    }

    public void clickOnAddCartButton() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(clickOnButton);
    }

    public String verifyTheBagShoppingCartText() throws InterruptedException {
        Thread.sleep(200);
        return getTextFromElement(verifyTextOnPage);
    }

    public void clickOnBagShoppingCartLink() {
        clickOnElement(cartLink);
    }
}
