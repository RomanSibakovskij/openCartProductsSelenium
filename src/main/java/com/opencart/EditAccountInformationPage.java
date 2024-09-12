package com.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditAccountInformationPage extends BasePage{

    //edit account information page link
    @FindBy(xpath = "//ul[@class='list-unstyled']/li[1]/a[text()='Edit your account information']")
    private WebElement editAccountInformationLink;
    //shopping cart link
    @FindBy(xpath = "//li[@class='list-inline-item'][4]/a")
    private WebElement shoppingCartLink;

    //edit account input fields
    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement lastNameInputField;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailInputField;

    //continue button
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement continueButton;

    //editing success confirmation message element
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement editSuccessMessage;

    //invalid input alert elements
    @FindBy(xpath = "//div[@id='error-firstname']")
    private WebElement invalidFirstNameAlert;
    @FindBy(xpath = "//div[@id='error-lastname']")
    private WebElement invalidLastNameAlert;
    @FindBy(xpath = "//div[@id='error-email']")
    private WebElement invalidEmailAlert;

    //valid input user data
    private String editedFirstName;
    private String editedLastName;
    private String editedEmail;

    //no singular input
    private String noFirstName = "";
    private String noLastName = "";
    private String noEmail = "";

    //invalid input format
    private int invalidFirstName = 111236;
    private int invalidLastName = 234243;

    //invalid format email
    private String invalidFormatEmail = "m0000example.com";

    public EditAccountInformationPage(WebDriver driver) {
        super(driver);
    }

    //edit information account link click method
    public void clickEditAccountInformationLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(editAccountInformationLink));
        editAccountInformationLink.click();
    }

    //click shopping cart link
    public void clickShoppingCartLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartLink));
        shoppingCartLink.click();
    }

    //valid first name input getter method
    public void inputValidEditedFirstNameData(){
        editedFirstName = TestDataGenerator.generateRandomFirstname(12);
    }

    //edit first name method
    public void editFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.clear();
        firstNameInputField.sendKeys(editedFirstName);
    }
    //valid last name input getter method
    public void inputValidEditedLastNameData(){
        editedLastName = TestDataGenerator.generateRandomLastname(14);
    }
    //edit last name method
    public void editLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.clear();
        lastNameInputField.sendKeys(editedLastName);
    }
    //valid email input getter method
    public void inputValidEditedEmailData(){
        editedEmail = TestDataGenerator.generateRandomEmailAddress(3);
    }
    //edit email method
    public void editEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.clear();
        emailInputField.sendKeys(editedEmail);
    }

    //continue button click method
    public void clickContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }


    //no first name input method
    public void editNoFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.clear();
        firstNameInputField.sendKeys(noFirstName);
    }

    //no first name method
    public void editNoLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.clear();
        lastNameInputField.sendKeys(noLastName);
    }

    //no first name method
    public void editNoEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.clear();
        emailInputField.sendKeys(noEmail);
    }

    //invalid first name input method
    public void editInvalidFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.clear();
        firstNameInputField.sendKeys(String.valueOf(invalidFirstName));
    }

    //invalid first name method
    public void editInvalidLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.clear();
        lastNameInputField.sendKeys(String.valueOf(invalidLastName));
    }

    //invalid first name method
    public void editInvalidEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.clear();
        emailInputField.sendKeys(invalidFormatEmail);
    }



    //edit account page element asserts
    public boolean isFirstNameInputFieldDisplayed(){return firstNameInputField.isDisplayed();}
    public boolean isLastNameInputFieldDisplayed(){return lastNameInputField.isDisplayed();}
    public boolean isEmailInputFieldDisplayed(){return emailInputField.isDisplayed();}

    //user account information getters
    public String getUserFirstName(){return firstNameInputField.getAttribute("value");}
    public String getUserLastName(){return lastNameInputField.getAttribute("value");}
    public String getUserEmail(){return emailInputField.getAttribute("value");}

    //edited user data getters
    public String getEditedFirstName(){return editedFirstName;}
    public String getEditedLastName(){return editedLastName;}
    public String getEditedEmail(){return editedEmail;}

    //success message getter
    public String getEditSuccessMessageText(){return editSuccessMessage.getText();}

    //invalid input alert message getters
    public String getInvalidFirstNameAlertText(){return invalidFirstNameAlert.getText();}
    public String getInvalidLastNameAlertText(){return invalidLastNameAlert.getText();}
    public String getInvalidEmailAlertText(){return invalidEmailAlert.getText();}
}
