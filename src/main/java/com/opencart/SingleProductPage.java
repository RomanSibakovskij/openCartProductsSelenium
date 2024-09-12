package com.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SingleProductPage extends BasePage{

    //add to cart alert box web element
    @FindBy(xpath = "//div[@id='alert']/div[@class='alert alert-success alert-dismissible']/button[@class='btn-close']")
    private WebElement closeAddToCartAlertBoxIcon;
    //header 'add to cart' web element
    @FindBy(xpath = "//div[@id='header-cart']")
    private WebElement addToCartHeaderButton;
    @FindBy(xpath = "//table[@class='table table-striped mb-2']/tbody/tr/td[@class='text-start']/a")
    private WebElement addToCartHeaderProductName;
    //product name web element
    @FindBy(xpath = "//div[@class='col-sm'][2]/h1")
    private WebElement productName;
    //product description list
    private List<WebElement> productDescriptionElements = driver.findElements((By.xpath("//div[@class='col-sm'][2]/ul[@class='list-unstyled'][1]/li")));
    //product price list
    private List<WebElement> productPricesElements = driver.findElements((By.xpath("//div[@class='col-sm'][2]/ul[@class='list-unstyled'][2]/li")));

    //product dropdown select menu
    @FindBy(xpath = "//select[@class='form-select']")
    private WebElement productSelectMenu;
    //blue option for select dropdown menu
    @FindBy(xpath = "//option[@value='16']")
    private WebElement blueSelectOption;
    //quantity input field web element
    @FindBy(xpath = "//input[@id='input-quantity']")
    private WebElement quantityInputField;
    //add to cart button web element
    @FindBy(xpath = "//button[@id='button-cart']")
    private WebElement addToCartButton;

    public SingleProductPage(WebDriver driver) {
        super(driver);
    }

    //product name getter
    public String getProductName() {return productName.getText();}

    //product elements list data getters
    public List<String> getProductDescription() {
        List<String> productDescriptions = new ArrayList<>();
        for (WebElement element : productDescriptionElements) {
            productDescriptions.add(element.getText());
        }
        return productDescriptions;
    }
    public List<String> getProductPrices() {
        List<String> productPrices = new ArrayList<>();
        for (WebElement element : productPricesElements) {
            productPrices.add(element.getText());
        }
        return productPrices;
    }

    //select dropdown menu click method
    public void clickSelectDropDownMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(productSelectMenu));
        productSelectMenu.click();
    }
    //select 'blue' option
    public void selectBlueOption() {blueSelectOption.click();}
    //click 'add to cart' button method
    public void clickAddToCartButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
    }
    //close the popup alert
    public void closePopUpAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.elementToBeClickable(closeAddToCartAlertBoxIcon));
        closeAddToCartAlertBoxIcon.click();
    }
    //click 'add to cart' header button method
    public void clickAddToCartHeaderButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartHeaderButton));
        addToCartHeaderButton.click();
    }
    //singular product page web element asserts
    public boolean isProductNameDisplayed() {return productName.isDisplayed();}
    public boolean isProductDescriptionDisplayed() {
        for (WebElement element : productDescriptionElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductPriceDisplayed() {
        for (WebElement element : productPricesElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    //product 'add to cart' dropdown box data getter
    public String getAddToCartProductName(){return addToCartHeaderProductName.getText();}

    public boolean isProductSelectMenuDisplayed() {return productSelectMenu.isDisplayed();}
    public boolean isQuantityInputDisplayed() {return quantityInputField.isDisplayed();}
    public boolean isAddToCartButtonDisplayed(){return addToCartButton.isDisplayed();}


}
