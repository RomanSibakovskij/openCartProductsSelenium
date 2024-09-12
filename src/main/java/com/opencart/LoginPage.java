package com.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.*;

import java.time.Duration;

public class LoginPage extends BasePage{

    //login link
    @FindBy(xpath = "//div[@class='list-group mb-3']/a[1]")
    private WebElement logInLink;

    //login form elements
    @FindBy(css = "#input-email")
    private WebElement emailInputField;
    @FindBy(css = "#input-password")
    private WebElement passwordInputField;
    @FindBy(css = "#form-login > div.text-end > button")
    private WebElement loginButton;

    //alert message web element
    @FindBy(xpath = "//div[@id='alert']")
    private WebElement alertMessage;

    //valid input data
    private String emailAddress;
    private String password;

    //invalid input data
    private String noEmailAddress;
    private String noPassword;
    private String invalidEmail;
    private String nonExistingEmail;
    private String invalidPassword;

    private static Logger logger = LoggerFactory.getLogger(LoginPage.class);
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //input data for valid login
    public void inputLoginData(RegisterPage registerPage){
        emailAddress = registerPage.getEmailAddress();
        password = registerPage.getPassword();

        logger.info("Input Data:" + "\n");
        logger.info("Login email address: " + emailAddress);
        logger.info("Login password: " + password);
    }

    //link click method

    public void clickLogInLink() {logInLink.click();}

    //login input methods
    public void inputEmailAddress(String emailAddress){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(emailInputField));
        emailInputField.sendKeys(emailAddress);
    }

    public void inputPassword(String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(passwordInputField));
        passwordInputField.sendKeys(password);
    }

    public void clickLoginButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions. visibilityOf(loginButton));
        loginButton.click();
    }

    //input data for invalid login
    public void inputLoginNoEmailData(RegisterPage registerPage){
        noEmailAddress = "";
        password = registerPage.getPassword();

        logger.info("Input Data:" + "\n");
        logger.info("No email address: " + noEmailAddress);
        logger.info("Login password: " + password);
    }

    //no email input
    public void inputNoEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(emailInputField));
        emailInputField.sendKeys(noEmailAddress);
    }

    public void inputLoginNoPasswordData(RegisterPage registerPage){
        emailAddress = registerPage.getEmailAddress();
        noPassword = "";

        logger.info("Input Data:" + "\n");
        logger.info("Login email address: " + emailAddress);
        logger.info("No password: " + noPassword);
    }
    //no password input
    public void inputNoPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(passwordInputField));
        passwordInputField.sendKeys(noPassword);
    }


    public void inputLoginInvalidEmailData(RegisterPage registerPage){
        invalidEmail = "m2@com";
        password = registerPage.getPassword();

        logger.info("Input Data:" + "\n");
        logger.info("Invalid email address: " + invalidEmail);
        logger.info("Login password: " + password);
    }

    //invalid email input
    public void inputInvalidEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(emailInputField));
        emailInputField.sendKeys(invalidEmail);
    }

    public void inputLoginInvalidPasswordData(RegisterPage registerPage){
        emailAddress = registerPage.getEmailAddress();
        invalidPassword = "KqC_2";

        logger.info("Input Data:" + "\n");
        logger.info("Login email address: " + emailAddress);
        logger.info("Invalid password: " + invalidPassword);
    }
    //invalid password input
    public void inputInvalidPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(passwordInputField));
        passwordInputField.sendKeys(invalidPassword);
    }

    public void inputLoginNonExistingEmailData(RegisterPage registerPage){
        nonExistingEmail = "m2@example.com";
        password = registerPage.getPassword();

        logger.info("Input Data:" + "\n");
        logger.info("Non existing email address: " + nonExistingEmail);
        logger.info("Login password: " + password);
    }

    //non existing email input
    public void inputNonExistingEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(emailInputField));
        emailInputField.sendKeys(nonExistingEmail);
    }

    //link element assert method
    public boolean isLogInLinkDisplayed(){return logInLink.isDisplayed();}

    //login form assert methods
    public boolean isEmailInputFieldDisplayed(){return emailInputField.isDisplayed();}
    public boolean isPasswordInputFieldDisplayed(){return passwordInputField.isDisplayed();}
    public boolean isLoginButtonDisplayed(){return loginButton.isDisplayed();}

    //alert message getter
    public String getAlertMessage(){return alertMessage.getText();}

}
