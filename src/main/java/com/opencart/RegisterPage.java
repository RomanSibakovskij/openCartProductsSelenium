package com.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.*;

import java.time.Duration;

public class RegisterPage extends BasePage{

    private static Logger logger = LoggerFactory.getLogger(RegisterPage.class);

    //input field elements
    @FindBy(css = "input#input-firstname")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement lastNameInputField;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailAddressInputField;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement passwordInputField;

    //click-box elements
    @FindBy(css = "#input-newsletter")
    private WebElement subscribeButton;
    @FindBy(css = "input[name='agree']")
    private WebElement privacyPolicyButton;

    //continue button
    @FindBy(css = ".btn-primary")
    private WebElement continueButton;

    //error message elements
    @FindBy(xpath = "//div[@id='error-firstname']")
    private WebElement invalidFirstName;
    @FindBy(xpath = "//div[@id='error-lastname']")
    private WebElement invalidLastName;
    @FindBy(xpath = "//div[@id='error-email']")
    private WebElement invalidEmail;
    @FindBy(xpath = "//div[@id='error-password']")
    private WebElement invalidPassword;

    //success verification elements
    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement accountCreationSuccess;

    //continue button after message
    @FindBy(xpath = "//div[@class='text-end']/a")
    private WebElement secondContinueButton;

    //valid input data
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;

    //invalid input data (no singular input)
    private String noFirstName;
    private String noLastName;
    private String noEmailAddress;
    private String noPassword;

    //invalid input data (invalid format)
    private String tooLongFirstName;
    private String tooLongLastName;
    private String tooLongEmailAddress;
    private String invalidEmailAddress;
    private String tooShortPassword;
    private String tooLongPassword;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    //input data getter from TestDataGenerator
    public void inputValidData(){
        firstName = TestDataGenerator.generateRandomFirstname(7);
        lastName = TestDataGenerator.generateRandomLastname(10);
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        password = TestDataGenerator.generateRandomPassword();

        logger.info("Generated Data:" + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Password: " + password);
    }

    //valid data methods
    public void inputFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.clear();
        firstNameInputField.sendKeys(firstName);
    }
    public void inputLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.clear();
        lastNameInputField.sendKeys(lastName);
    }
    public void inputEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.clear();
        emailAddressInputField.sendKeys(emailAddress);
    }
    public void inputPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.clear();
        passwordInputField.sendKeys(password);
    }

    //invalid data input methods
    // (no singular input)
    public void inputNoFirstNameData(){
        noFirstName = "";
        lastName = TestDataGenerator.generateRandomLastname(10);
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        password = TestDataGenerator.generateRandomPassword();

        logger.info("Generated Data:" + "\n");
        logger.info("Expected first name: " + noFirstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Password: " + password);
    }
    //no first name input method
    public void inputNoFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.clear();
        firstNameInputField.sendKeys(noFirstName);
    }

    public void inputNoLastNameData(){
        firstName = TestDataGenerator.generateRandomFirstname(7);
        noLastName = "";
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        password = TestDataGenerator.generateRandomPassword();

        logger.info("Generated Data:" + "\n");
        logger.info("First name: " + noFirstName);
        logger.info("Expected last name: " + noLastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Password: " + password);
    }

    //no last name input method
    public void inputNoLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.clear();
        lastNameInputField.sendKeys(noLastName);
    }

    public void inputNoEmailData(){
        firstName = TestDataGenerator.generateRandomFirstname(7);
        lastName = TestDataGenerator.generateRandomLastname(10);
        noEmailAddress = "";
        password = TestDataGenerator.generateRandomPassword();

        logger.info("Generated Data:" + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Expected email address: " + noEmailAddress);
        logger.info("Password: " + password);
    }
    //input no email method
    public void inputNoEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.clear();
        emailAddressInputField.sendKeys(noEmailAddress);
    }

    public void inputNoPasswordData(){
        firstName = TestDataGenerator.generateRandomFirstname(7);
        lastName = TestDataGenerator.generateRandomLastname(10);
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        noPassword = "";

        logger.info("Generated Data:" + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Expected password: " + noPassword);
    }
    //input no password method
    public void inputNoPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.clear();
        passwordInputField.sendKeys(noPassword);
    }

    //invalid data input methods
    // (too long)
    public void inputTooLongFirstNameData(){
        tooLongFirstName = TestDataGenerator.generateRandomFirstname(33);
        lastName = TestDataGenerator.generateRandomLastname(10);
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        password = TestDataGenerator.generateRandomPassword();

        logger.info("Generated Data:" + "\n");
        logger.info("Too long first name: " + tooLongFirstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Password: " + password);
    }
    //too long first name input method
    public void inputTooLongFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.clear();
        firstNameInputField.sendKeys(tooLongFirstName);
    }

    public void inputTooLongLastNameData(){
        firstName = TestDataGenerator.generateRandomFirstname(7);
        tooLongLastName = TestDataGenerator.generateRandomLastname(33);
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        password = TestDataGenerator.generateRandomPassword();

        logger.info("Generated Data:" + "\n");
        logger.info("First name: " + firstName);
        logger.info("Too long last name: " + tooLongLastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Password: " + password);
    }
    //too long last name input method
    public void inputTooLongLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.clear();
        lastNameInputField.sendKeys(tooLongLastName);
    }

    public void inputTooLongEmailData(){
        firstName = TestDataGenerator.generateRandomFirstname(7);
        lastName = TestDataGenerator.generateRandomLastname(10);
        tooLongEmailAddress = TestDataGenerator.generateRandomEmailAddress(75);
        password = TestDataGenerator.generateRandomPassword();

        logger.info("Generated Data:" + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + tooLongLastName);
        logger.info("Too long email address: " + tooLongEmailAddress);
        logger.info("Password: " + password);
    }
    //too long last name input method
    public void inputTooLongEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.clear();
        emailAddressInputField.sendKeys(tooLongEmailAddress);
    }

    public void inputTooLongPasswordData(){
        firstName = TestDataGenerator.generateRandomFirstname(7);
        lastName = TestDataGenerator.generateRandomLastname(10);
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        tooLongPassword = "ASsdfvfgdf_gfhytjy234"; //21 chars

        logger.info("Generated Data:" + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Too long password: " + tooLongPassword);
    }
    //too long last name input method
    public void inputTooLongPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.clear();
        passwordInputField.sendKeys(tooLongPassword);
    }

    //invalid email format
    public void inputInvalidEmailFormatData(){
        firstName = TestDataGenerator.generateRandomFirstname(7);
        lastName = TestDataGenerator.generateRandomLastname(10);
        invalidEmailAddress = TestDataGenerator.generateRandomInvalidEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();

        logger.info("Generated Data:" + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + tooLongLastName);
        logger.info("Invalid email address: " + invalidEmailAddress);
        logger.info("Password: " + password);
    }
    //invalid email input method
    public void inputInvalidEmailFormat(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.clear();
        emailAddressInputField.sendKeys(invalidEmailAddress);
    }

    //too short password
    public void inputTooShortPasswordData(){
        firstName = TestDataGenerator.generateRandomFirstname(7);
        lastName = TestDataGenerator.generateRandomLastname(10);
        emailAddress = TestDataGenerator.generateRandomEmailAddress(5);
        tooShortPassword = "A_g"; //3 chars

        logger.info("Generated Data:" + "\n");
        logger.info("First name: " + firstName);
        logger.info("Last name: " + lastName);
        logger.info("Email address: " + emailAddress);
        logger.info("Too short password: " + tooShortPassword);
    }
    //too long last name input method
    public void inputTooShortPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.clear();
        passwordInputField.sendKeys(tooShortPassword);
    }

    //button click methods
    public void clickSubscribeButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(subscribeButton));
        subscribeButton.click();
    }
    public void clickPrivacyPolicyButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(privacyPolicyButton));
        privacyPolicyButton.click();
    }
    public void clickContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(continueButton));
        continueButton.click();
    }
    public void clickSecondContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(secondContinueButton));
        secondContinueButton.click();
    }

    //input field assert methods
    public boolean isFirstNameInputFieldDisplayed(){return firstNameInputField.isDisplayed();}
    public boolean isLastNameInputFieldDisplayed(){return lastNameInputField.isDisplayed();}
    public boolean isEmailAddressInputFieldDisplayed(){return emailAddressInputField.isDisplayed();}
    public boolean isPasswordInputFieldDisplayed(){return passwordInputField.isDisplayed();}

    //click-box/button assert methods
    public boolean isSubscribeButtonDisplayed(){return subscribeButton.isDisplayed();}
    public boolean isPrivacyPolicyButtonDisplayed(){return privacyPolicyButton.isDisplayed();}
    public boolean isContinueButtonDisplayed(){return continueButton.isDisplayed();}

    //valid data getters
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getEmailAddress(){return emailAddress;}
    public String getPassword(){return this.password;}

    //invalid message getters
    public String getInvalidFirstNameMessage(){return invalidFirstName.getText();}
    public String getInvalidLastNameMessage(){return invalidLastName.getText();}
    public String getInvalidEmailMessage(){return invalidEmail.getText();}
    public String getInvalidPasswordMessage(){return invalidPassword.getText();}

    //success message getter
    public String getSuccessMessage(){return accountCreationSuccess.getText();}

}
