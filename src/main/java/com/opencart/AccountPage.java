package com.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage extends BasePage{

    //logout link element
    @FindBy(xpath = "//div[@class='list-group mb-3']/a[13]")
    private WebElement logOutLink;

    //logout success message
    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement accountLogOutMessage;

    //continue logout button
    @FindBy(xpath = "//div[@class='text-end']/a")
    private WebElement continueLogOutButton;

    //edit account info element
    @FindBy(xpath = "//ul[@class='list-unstyled']/li[1]/a[text()='Edit your account information']")
    private WebElement editAccountLink;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    //logout link click method
    public void clickLogOutLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(logOutLink));
        logOutLink.click();
    }

    //continue logout click button
    public void clickContinueLogOutButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(450));
        wait.until(ExpectedConditions.elementToBeClickable(continueLogOutButton));
        continueLogOutButton.click();
    }

    //web element assert methods
    public boolean isLogOutLinkDisplayed() {return logOutLink.isDisplayed();}
    public boolean isContinueLogOutButtonDisplayed() {return continueLogOutButton.isDisplayed();}

    public boolean isEditAccountLinkDisplayed(){return editAccountLink.isDisplayed();}

    //account logout message getter
    public String getAccountLogOutMessage() {return accountLogOutMessage.getText();}

}
