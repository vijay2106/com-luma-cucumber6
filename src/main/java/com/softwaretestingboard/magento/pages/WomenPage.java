package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement filterPrice;
    @CacheLookup
    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement filterProductName;
    @CacheLookup
    @FindBy(xpath = "//div[2]//div[3]//select[1]")
    WebElement productFilter;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]")
    WebElement Price;


    By jacketsNameListAfterSorting = By.xpath("//strong[@class='product name product-item-name']//a");
    By jacketsPriceListAfterSorting = By.xpath("//span[@class='price-wrapper ']//span");
    By jacketsPriceListBeforeSorting = By.xpath("//span[@class='price-wrapper ']//span");
    By jacketsNameListBeforeSorting = By.xpath("//strong[@class='product name product-item-name']//a");


    public List<String> productListBeforeSorting() {
        List<WebElement> jacketsElementsList = driver.findElements(jacketsNameListBeforeSorting);
        List<String> jacketsNameListBefore = new ArrayList<String>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }
        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
        return jacketsNameListBefore;
    }


    public List<String> productListAfterSorting() throws InterruptedException {
        Thread.sleep(1000);
        // Select Sort By filter “Product Name”
        selectByVisibleTextFromDropDown(filterProductName, "Product Name");
        Thread.sleep(1000);
        // After Sorting value
        List<WebElement> jacketsElementsList = driver.findElements(jacketsNameListAfterSorting);
        List<String> jacketsNameListAfter = new ArrayList<String>();
        Thread.sleep(1000);
        for (WebElement value : jacketsElementsList) {
            jacketsNameListAfter.add(value.getText());
        }

        return jacketsNameListAfter;
    }
    // *****************************************  Price  ***************************************************************************//


    public List<Double> priceListBeforeSorting() {
        // Storing jackets price in list
        List<WebElement> jacketsPriceElementList = driver.findElements(jacketsPriceListBeforeSorting);
        List<Double> jacketsPriceListBefore = new ArrayList<Double>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketsPriceListBefore);
        return jacketsPriceListBefore;
    }


    public List<Double> priceListAfterSorting() throws InterruptedException {

        // Select Sort By filter “Price”
        selectByVisibleTextFromDropDown(filterPrice, "Price");
        Thread.sleep(1000);

        // After Sorting Products by Price
        List<WebElement> jacketsPriceElementList = driver.findElements(jacketsPriceListAfterSorting);
        List<Double> jacketsPriceListAfter = new ArrayList<Double>();
        Thread.sleep(1000);
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        return jacketsPriceListAfter;
    }
    public void selectProductNameFilter(String filterName) {
        selectByVisibleTextFromDropDown(productFilter, filterName);
    }
    public void selectSortPrice(String price) {
        selectByValueFromDropDown(Price, price);
    }
}
