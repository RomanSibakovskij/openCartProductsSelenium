package com.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CheckoutPage extends BasePage{

    //shipping address setup web elements
    @FindBy(xpath = "//input[@id='input-shipping-firstname']")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//input[@id='input-shipping-lastname']")
    private WebElement lastNameInputField;
    @FindBy(xpath = "//input[@id='input-shipping-company']")
    private WebElement companyInputField;
    @FindBy(xpath = "//input[@id='input-shipping-address-1']")
    private WebElement address1InputField;
    @FindBy(xpath = "//input[@id='input-shipping-address-2']")
    private WebElement address2InputField;
    @FindBy(xpath = "//input[@id='input-shipping-city']")
    private WebElement cityInputField;
    @FindBy(xpath = "//input[@id='input-shipping-postcode']")
    private WebElement postCodeInputField;
    @FindBy(xpath = "//select[@id='input-shipping-country']")
    private WebElement countryDropdownMenu;
    @FindBy(xpath = "//option[@value='223']")
    private WebElement usCountryOption;
    @FindBy(xpath = "//select[@id='input-shipping-zone']")
    private WebElement stateDropdownMenu;
    @FindBy(xpath = "//option[@value='3635']")
    private WebElement illinoisStateOption;
    //continue button web element
    @FindBy(xpath = "//button[@id='button-shipping-address']")
    private WebElement continueButton;
    //shipping address creation confirmation
    @FindBy(xpath = "//label[text()='I want to use an existing address']")
    private WebElement shippingAddressTextConfirmation;
    //shipping address created text element
    @FindBy(xpath = "//select[@id='input-shipping-address']")
    private WebElement shippingAddress;
    //shipping data web elements
    @FindBy(xpath = "//button[@id='button-shipping-methods']")
    private WebElement shippingMethodChooseButton;
    @FindBy(xpath = "//input[@id='input-shipping-method-flat-flat']")
    private WebElement flatShippingOption;
    @FindBy(xpath = "//button[@id='button-shipping-method']")
    private WebElement shippingContinueButton;
    //payment data web elements
    @FindBy(xpath = "//button[@id='button-payment-methods']")
    private WebElement paymentMethodChooseButton;
    @FindBy(xpath = "//input[@id='input-payment-method-cod-cod']")
    private WebElement cashOnDeliveryOption;
    @FindBy(xpath = "//button[@id='button-payment-method']")
    private WebElement paymentContinueButton;
    //order commentary textarea input field web element
    @FindBy(xpath = "//textarea[@id='input-comment']")
    private WebElement orderCommentInputField;
    //checkout products table data web elements
    @FindBy(xpath = "//table[@class='table table-bordered table-hover']/tbody/tr/td[@class='text-start']")
    private List<WebElement> checkoutProductNameElements;
    @FindBy(xpath = "//table[@class='table table-bordered table-hover']/tbody/tr/td[@class='text-end']")
    private List<WebElement> checkoutProductPriceElements;
    @FindBy(xpath = "//table[@class='table table-bordered table-hover']/tfoot/tr[1]/td[@class='text-end'][2]")
    private WebElement checkoutProductSubTotalPrice;
    @FindBy(xpath = "//table[@class='table table-bordered table-hover']/tfoot/tr[2]/td[@class='text-end'][2]")
    private WebElement checkoutProductFlatShippingRate;
    @FindBy(xpath = "//table[@class='table table-bordered table-hover']/tfoot/tr[3]/td[@class='text-end'][2]")
    private WebElement checkoutProductTotalPrice;
    //checkout button web element
    @FindBy(xpath = "//button[text()='Confirm Order']")
    private WebElement confirmOrderButton;
    //order success confirmation paragraph element
    @FindBy(css = "div#content > p:nth-of-type(1)")
    private WebElement successOrderPlaceMessage;
    @FindBy(css = "p:nth-of-type(2) > a:nth-of-type(2)")
    private WebElement orderHistoryLink;

    //user data input
    private String firstName;
    private String lastName;
    private String company;
    private String address1;
    private String city;
    private String postCode;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    //user input data getter
    public void inputValidUserData(RegisterPage registerPage){
        firstName = registerPage.getFirstName();
        lastName = registerPage.getLastName();
        company = TestDataGenerator.generateRandomCompany();
        address1 = TestDataGenerator.generateRandomAddress(5);
        city = TestDataGenerator.getRandomCity();
        postCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
    }

    //checkout page input data methods
    public void inputFirstName(String firstName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(firstName);
    }
    public void inputLastName(String lastName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(lastName);
    }
    public void inputCompany() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(companyInputField));
        companyInputField.sendKeys(company);
    }
    public void inputAddress1() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(address1);
    }
    public void inputCity() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(city);
    }
    public void inputPostCode() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(postCodeInputField));
        postCodeInputField.sendKeys(postCode);
    }
    //country dropdown menu select method
    public void clickCountryDropdownMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(countryDropdownMenu));
        countryDropdownMenu.click();
    }
    public void selectUsCountryOption() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(usCountryOption));
        usCountryOption.click();
    }
    //state dropdown menu select option
    public void clickStateDropdownMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(stateDropdownMenu));
        stateDropdownMenu.click();
    }
    public void selectIllinoisStateOption() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(illinoisStateOption));
        illinoisStateOption.click();
    }
    //click continue button
    public void clickContinueButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }
    //close alert box (save password)
    public void closeAlertBox(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("document.getElementById('alert').remove();");
    }
    //shipping method 'choose' button click method
    public void clickShippingChooseButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(shippingMethodChooseButton));
        shippingMethodChooseButton.click();
    }
    //select flat shipping
    public void selectFlatShippingOption() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(flatShippingOption));
        flatShippingOption.click();
    }
    //click 'continue' button
    public void clickShippingContinueButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(shippingContinueButton));
        shippingContinueButton.click();
    }
    //click 'choose' payment method button
    public void clickPaymentChooseButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(paymentMethodChooseButton));
        paymentMethodChooseButton.click();
    }
    //select 'cash on delivery' option
    public void selectCashOnDeliveryOption() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(cashOnDeliveryOption));
        cashOnDeliveryOption.click();
    }
    //click 'continue' button
    public void clickPaymentContinueButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(paymentContinueButton));
        paymentContinueButton.click();
    }
    //checkout product table data web elements
    // product names list
    public List<String> getCheckoutProductNames() {
        List<String> productNames = new ArrayList<>();
        for (WebElement element : checkoutProductNameElements) {
            productNames.add(element.getText());
        }
        return productNames;
    }

    // product prices list
    public List<String> getCheckoutProductPrices() {
        List<String> productPrices = new ArrayList<>();
        for (WebElement element : checkoutProductPriceElements) {
            productPrices.add(element.getText());
        }
        return productPrices;
    }

    //product sub total price
    public String getCheckoutProductSubTotalPrice(){return checkoutProductSubTotalPrice.getText();}
    //product flat shipping rate
    public String getCheckoutProductFlatShippingRate(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", checkoutProductFlatShippingRate);
        return checkoutProductFlatShippingRate.getText();}
    public String getCheckoutProductTotalPrice() {return checkoutProductTotalPrice.getText();}

    //'confirm order' button click method
    public void clickConfirmOrderButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(confirmOrderButton));
        confirmOrderButton.click();
    }

    //click order history link for order confirmation
    public void clickOrderHistoryLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(orderHistoryLink));
        orderHistoryLink.click();
    }

    //checkout page web element assert methods
    public boolean isFirstNameInputFieldDisplayed() {return firstNameInputField.isDisplayed();}
    public boolean isLastNameInputFieldDisplayed() {return lastNameInputField.isDisplayed();}
    public boolean isCompanyInputFieldDisplayed() {return companyInputField.isDisplayed();}
    public boolean isAddress1InputFieldDisplayed() {return address1InputField.isDisplayed();}
    public boolean isAddress2InputFieldDisplayed() {return address2InputField.isDisplayed();}
    public boolean isCityInputFieldDisplayed() {return cityInputField.isDisplayed();}
    public boolean isPostCodeInputFieldDisplayed() {return postCodeInputField.isDisplayed();}
    public boolean isCountryDropdownMenuDisplayed() {return countryDropdownMenu.isDisplayed();}
    public boolean isUsCountryOptionDisplayed() {return usCountryOption.isDisplayed();}
    public boolean isStateDropdownMenuDisplayed() {return stateDropdownMenu.isDisplayed();}
    public boolean isIllinoisStateOptionDisplayed() {return illinoisStateOption.isDisplayed();}
    public boolean isContinueButtonDisplayed() {return continueButton.isDisplayed();}
    public boolean isShippingMethodChooseButtonDisplayed() {return shippingMethodChooseButton.isDisplayed();}
    public boolean isFlatShippingOptionDisplayed() {return flatShippingOption.isDisplayed();}
    public boolean isShippingPaymentContinueButtonDisplayed() {return shippingContinueButton.isDisplayed();}
    public boolean isPaymentMethodChooseButtonDisplayed() {return paymentMethodChooseButton.isDisplayed();}
    public boolean isCashOnDeliveryOptionDisplayed(){return cashOnDeliveryOption.isDisplayed();}
    public boolean isOrderCommentInputFieldDisplayed(){return orderCommentInputField.isDisplayed();}
    public boolean isCheckoutProductNameDisplayed() {
        for (WebElement element : checkoutProductNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCheckoutProductPriceDisplayed() {
        for (WebElement element : checkoutProductPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductsSubTotalPriceDisplayed(){return checkoutProductSubTotalPrice.isDisplayed();}
    public boolean isProductsFlatShippingRateDisplayed(){return checkoutProductFlatShippingRate.isDisplayed();}
    public boolean isProductsTotalPriceDisplayed(){return checkoutProductTotalPrice.isDisplayed();}
    public boolean isConfirmOrderButtonDisplayed() {return confirmOrderButton.isDisplayed();}

    //user data getters
    public String getUserCompany(){return company;}
    public String getUserAddress1(){return address1;}
    public String getUserCity(){return city;}
    public String getUserPostCode(){return postCode;}
    //shipping address creation confirmation getters
    public String getShippingAddressConfirmation(){return shippingAddressTextConfirmation.getText();}
    public String getShippingAddress(){
        String address = shippingAddress.getText();
        return address.replace("--- Please Select ---", "").trim();}

    //get order successful placement message
    public String getOrderSuccessfullyPlacedMessage(){return successOrderPlaceMessage.getText();}
}
