package com.opencart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductReturnPage extends BasePage{

    //product return page input field web elements

    //user data
    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement lastNameInputField;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailInputField;
    @FindBy(xpath = "//input[@id='input-telephone']")
    private WebElement telephoneInputField;
    @FindBy(xpath = "//input[@id='input-order-id']")
    private WebElement orderIDInputField;
    //date selector web element
    @FindBy(xpath = "//input[@id='input-date-ordered']")
    private WebElement dateSelector;
    //product data
    @FindBy(xpath = "//input[@id='input-product']")
    private WebElement productNameInputField;
    @FindBy(xpath = "//input[@id='input-model']")
    private WebElement productCodeInputField;
    @FindBy(xpath = "//input[@id='input-quantity']")
    private WebElement productQuantityInputField;

    //reason for return selectors web elements
    @FindBy(xpath = "//input[@id='input-return-reason-1']")
    private WebElement deadOnArrivalSelector;
    @FindBy(xpath = "//input[@id='input-return-reason-4']")
    private WebElement faultyProductSelector;
    @FindBy(xpath = "//input[@id='input-return-reason-3']")
    private WebElement orderErrorSelector;
    @FindBy(xpath = "//input[@id='input-return-reason-5']")
    private WebElement otherReasonSelector;
    @FindBy(xpath = "//input[@id='input-return-reason-2']")
    private WebElement wrongItemSelector;
    // remaining elements
    @FindBy(xpath = "//input[@id='input-opened-yes']")
    private WebElement productOpenedSelector;
    @FindBy(xpath = "//input[@id='input-opened-no']")
    private WebElement productNotOpenedSelector;
    @FindBy(xpath = "//textarea[@id='input-comment']")
    private WebElement detailsTextArea;
    //submit button
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    //product return success message
    @FindBy(xpath = "//p[.='Thank you for submitting your return request. Your request has been sent to the relevant department for processing.']")
    private WebElement productReturnSuccessMessage;

    //order history page link web element
    @FindBy(xpath = "//aside/div/a[.='Order History']")
    private WebElement orderHistoryPageLink;

    //customer telephone
    private String customerTelephone = TestDataGenerator.generateIllinoisPhoneNumber();
    //customer faulty product comment
    private String customerFaultyProductComment = TestDataGenerator.getRandomReturnComment();

    public ProductReturnPage(WebDriver driver) {
        super(driver);
    }

    //customer telephone input method
    public void inputCustomerTelephone(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(telephoneInputField));
        telephoneInputField.sendKeys(customerTelephone);
    }

    //return product reason click methods
    public void selectDeadOnArrivalReason(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(deadOnArrivalSelector));
        deadOnArrivalSelector.click();
    }
    public void selectFaultyProductReason(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(faultyProductSelector));
        faultyProductSelector.click();
    }
    public void selectOrderErrorReason(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(orderErrorSelector));
        orderErrorSelector.click();
    }
    public void selectOtherReason(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(otherReasonSelector));
        otherReasonSelector.click();
    }
    public void selectWrongItemReason(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(wrongItemSelector));
        wrongItemSelector.click();
    }

    //product opened / not opened click methods
    public void selectProductOpened(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(productOpenedSelector));
        productOpenedSelector.click();
    }
    public void selectProductNotOpened(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(productNotOpenedSelector));
        productNotOpenedSelector.click();
    }

    //customer comment input
    public void inputCustomerFaultyProductComment(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", detailsTextArea);
        detailsTextArea.sendKeys(customerFaultyProductComment);
    }

    //'submit' button click method
    public void clickSubmitButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
    }

    //order history page link click method
    public void clickOrderHistoryLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(orderHistoryPageLink));
        orderHistoryPageLink.click();
    }

    //product page data getters
    public String getFirstName(){return firstNameInputField.getAttribute("value");}
    public String getLastName(){return lastNameInputField.getAttribute("value");}
    public String getEmail(){return emailInputField.getAttribute("value");}
    public String getTelephone(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", telephoneInputField);
        return telephoneInputField.getAttribute("value");}
    public String getOrderID(){return orderIDInputField.getAttribute("value");}
    public String getDate(){return dateSelector.getAttribute("value");}
    public String getProductName(){return productNameInputField.getAttribute("value");}
    public String getProductCode(){return productCodeInputField.getAttribute("value");}
    public String getProductQuantity(){return productQuantityInputField.getAttribute("value");}
    public String getDetailsTextArea(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", detailsTextArea);
        return detailsTextArea.getAttribute("value");}

    //product return page web assert methods
    public boolean isFirstNameInputFieldDisplayed() {return firstNameInputField.isDisplayed();}
    public boolean isLastNameInputFieldDisplayed() {return lastNameInputField.isDisplayed();}
    public boolean isEmailInputFieldDisplayed() {return emailInputField.isDisplayed();}
    public boolean isTelephoneInputFieldDisplayed() {return telephoneInputField.isDisplayed();}
    public boolean isOrderIDInputFieldDisplayed() {return orderIDInputField.isDisplayed();}
    public boolean isDateSelectorDisplayed() {return dateSelector.isDisplayed();}
    public boolean isProductNameInputFieldDisplayed() {return productNameInputField.isDisplayed();}
    public boolean isProductCodeInputFieldDisplayed() {return productCodeInputField.isDisplayed();}
    public boolean isProductQuantityInputFieldDisplayed() {return productQuantityInputField.isDisplayed();}
    public boolean isDeadOnArrivalSelectorDisplayed(){return deadOnArrivalSelector.isDisplayed();}
    public boolean isFaultyProductSelectorDisplayed() {return faultyProductSelector.isDisplayed();}
    public boolean isOrderErrorSelectorDisplayed() {return orderErrorSelector.isDisplayed();}
    public boolean isOtherReasonSelectorDisplayed() {return otherReasonSelector.isDisplayed();}
    public boolean isWrongItemSelectorDisplayed() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", wrongItemSelector);
        return wrongItemSelector.isDisplayed();}
    public boolean isProductOpenedSelectorDisplayed() {return productOpenedSelector.isDisplayed();}
    public boolean isProductNotOpenedSelectorDisplayed() {return productNotOpenedSelector.isDisplayed();}
    public boolean isDetailsTextAreaDisplayed() {return detailsTextArea.isDisplayed();}
    public boolean isSubmitButtonDisplayed() {return submitButton.isDisplayed();}

    //product return success message getter
    public String getProductReturnSuccessMessage(){return productReturnSuccessMessage.getText();}
}
