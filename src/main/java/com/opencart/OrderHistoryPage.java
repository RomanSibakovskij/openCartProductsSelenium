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

public class OrderHistoryPage extends BasePage{

    //order history table web element
    @FindBy(xpath = "//table[@class='table table-bordered table-hover']/tbody/tr/td[@class='text-end'][1]")
    private List<WebElement> orderNumberElements;
    @FindBy(xpath = "//table[@class='table table-bordered table-hover']/tbody/tr/td[@class='text-start'][1]")
    private List<WebElement> orderCustomerNameElements;
    @FindBy(xpath = "//table[@class='table table-bordered table-hover']/tbody/tr/td[@class='text-end'][2]")
    private List<WebElement> orderProductNumberElements;
    @FindBy(xpath = "//table[@class='table table-bordered table-hover']/tbody/tr/td[@class='text-start'][2]")
    private List<WebElement> orderStatusElements;
    @FindBy(xpath = "//table[@class='table table-bordered table-hover']/tbody/tr/td[@class='text-end'][3]")
    private List<WebElement> orderPriceElements;
    @FindBy(xpath = "//table[@class='table table-bordered table-hover']/tbody/tr/td[@class='text-start'][3]")
    private List<WebElement> orderDateElements;
    @FindBy(css = "tr:nth-of-type(1) > td:nth-of-type(7) > a[title='View']")
    private WebElement orderViewButton;

    public OrderHistoryPage(WebDriver driver) {
        super(driver);
    }

    //order page data view methods
    public List<String> getOrdersNumber() {
        List<String> orderNumber = new ArrayList<>();
        for (WebElement element : orderNumberElements) {
            orderNumber.add(element.getText());
        }
        return orderNumber;
    }

    public List<String> getOrdersCustomerName() {
        List<String> customerName = new ArrayList<>();
        for (WebElement element : orderCustomerNameElements) {
            customerName.add(element.getText());
        }
        return customerName;
    }

    public List<String> getOrdersProductCount() {
        List<String> productCount = new ArrayList<>();
        for (WebElement element : orderProductNumberElements) {
            productCount.add(element.getText());
        }
        return productCount;
    }

    public List<String> getOrdersStatus() {
        List<String> orderStatus = new ArrayList<>();
        for (WebElement element : orderStatusElements) {
            orderStatus.add(element.getText());
        }
        return orderStatus;
    }

    public List<String> getOrdersPrice() {
        List<String> orderPrice = new ArrayList<>();
        for (WebElement element : orderPriceElements) {
            orderPrice.add(element.getText());
        }
        return orderPrice;
    }

    public List<String> getOrdersDate() {
        List<String> orderDate = new ArrayList<>();
        for (WebElement element : orderDateElements) {
            orderDate.add(element.getText());
        }
        return orderDate;
    }

    //view order button click method
    public void clickViewOrderButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(720));
        wait.until(ExpectedConditions.elementToBeClickable(orderViewButton));
        orderViewButton.click();
    }

    //order page web element assert methods (table)
    public boolean isOrderNumberDisplayed() {
        for (WebElement element : orderNumberElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isOrderCustomerNameDisplayed() {
        for (WebElement element : orderCustomerNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isOrderProductCountDisplayed() {
        for (WebElement element : orderProductNumberElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isOrderStatusDisplayed() {
        for (WebElement element : orderStatusElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isOrderPriceDisplayed() {
        for (WebElement element : orderPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isOrderDateDisplayed() {
        for (WebElement element : orderDateElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isOrderViewButtonDisplayed(){return orderViewButton.isDisplayed();}

}
