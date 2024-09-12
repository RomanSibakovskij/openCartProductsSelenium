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

public class SingularOrderPage extends BasePage{

    //order data table web element
    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement orderNumber;
    @FindBy(xpath = "//td[strong[text()='Order Status']]/following-sibling::td")
    private WebElement orderStatus;
    @FindBy(xpath = "//div[@class='col'][2]/table/tbody/tr[1]/td[2]")
    private WebElement orderShippingMethod;
    @FindBy(xpath = "//div[@class='col'][2]/table/tbody/tr[2]/td[2]")
    private WebElement orderPaymentMethod;
    @FindBy(xpath = "//div[@class='col'][2]/table/tbody/tr[3]/td[2]")
    private WebElement orderDate;
    @FindBy(xpath = "//div[@id='content']/table/tbody/tr/td")
    private WebElement orderShippingAddress;
    @FindBy(xpath = "//div[@id='content']/div[@class='table-responsive']/table/tfoot/tr[1]/td[@class='text-end'][2]")
    private WebElement orderProductSubTotalPrice;
    @FindBy(xpath = "//div[@id='content']/div[@class='table-responsive']/table/tfoot/tr[2]/td[@class='text-end'][2]")
    private WebElement orderProductFlatShippingRate;
    @FindBy(xpath = "//div[@id='content']/div[@class='table-responsive']/table/tfoot/tr[3]/td[@class='text-end'][2]")
    private WebElement orderProductTotalPrice;

    //product data table web element lists
    @FindBy(xpath = "//div[@id='content']/div[@class='table-responsive']/table/tbody/tr/td[1]")
    private List<WebElement> orderProductNameElements;
    @FindBy(xpath = "//div[@id='content']/div[@class='table-responsive']/table/tbody/tr/td[2]")
    private List<WebElement> orderProductModelElements;
    @FindBy(xpath = "//div[@id='content']/div[@class='table-responsive']/table/tbody/tr/td[3]")
    private List<WebElement> orderProductQuantityElements;
    @FindBy(xpath = "//div[@id='content']/div[@class='table-responsive']/table/tbody/tr/td[4]")
    private List<WebElement> orderProductPriceElements;
    @FindBy(xpath = "//div[@id='content']/div[@class='table-responsive']/table/tbody/tr/td[5]")
    private List<WebElement> orderProductTotalPriceElements;

    //return order list button web elements
    private List<WebElement> returnOrderButtons = driver.findElements(By.xpath("//div[@id='content']/div[@class='table-responsive']/table/tbody/tr/td[6]/a[2]"));

    public SingularOrderPage(WebDriver driver) {
        super(driver);
    }

    //order page product data getters
    public String getOrderNumber() {return orderNumber.getText();}
    public String getOrderStatus() {return orderStatus.getText();}
    public String getOrderShippingMethod() {return orderShippingMethod.getText();}
    public String getOrderPaymentMethod() {return orderPaymentMethod.getText();}
    public String getOrderDate() {return orderDate.getText();}
    public String getOrderShippingAddress() {return orderShippingAddress.getText();}
    public String getOrderProductSubTotalPrice() {return orderProductSubTotalPrice.getText();}
    public String getOrderProductFlatShippingRate() {return orderProductFlatShippingRate.getText();}
    public String getOrderProductTotalPrice() {return orderProductTotalPrice.getText();}

    //order page product data getters(list elements)
    public List<String> getProductNames() {
        List<String> productName = new ArrayList<>();
        for (WebElement element : orderProductNameElements) {
            productName.add(element.getText());
        }
        return productName;
    }
    public List<String> getProductModels() {
        List<String> productModel = new ArrayList<>();
        for (WebElement element : orderProductModelElements) {
            productModel.add(element.getText());
        }
        return productModel;
    }
    public List<String> getProductQuantity() {
        List<String> productQuantity = new ArrayList<>();
        for (WebElement element : orderProductQuantityElements) {
            productQuantity.add(element.getText());
        }
        return productQuantity;
    }
    public List<String> getProductPrice() {
        List<String> productPrice = new ArrayList<>();
        for (WebElement element : orderProductPriceElements) {
            productPrice.add(element.getText());
        }
        return productPrice;
    }
    public List<String> getProductTotalPrice() {
        List<String> productTotalPrice = new ArrayList<>();
        for (WebElement element : orderProductTotalPriceElements) {
            productTotalPrice .add(element.getText());
        }
        return productTotalPrice ;
    }

    //return order button click method
    //add homepage features products to cart click methods
    public void clickReturnOrderButton(int productIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(720));
        wait.until(ExpectedConditions.elementToBeClickable(returnOrderButtons.get(productIndex)));
        returnOrderButtons.get(productIndex).click();
    }
    public void clickReturnOrderButton1() {
        clickReturnOrderButton(0);
    }
    public void clickReturnOrderButton2() {
        clickReturnOrderButton(1);
    }
    public void clickReturnOrderButton3() {
        clickReturnOrderButton(2);
    }
    public void clickReturnOrderButton4() {
        clickReturnOrderButton(3);
    }
    public void clickReturnOrderButton5() {
        clickReturnOrderButton(4);
    }
    public void clickReturnOrderButton6() {
        clickReturnOrderButton(5);
    }
    public void clickReturnOrderButton7() {
        clickReturnOrderButton(6);
    }
    public void clickReturnOrderButton8() {
        clickReturnOrderButton(7);
    }
    public void clickReturnOrderButton9() {
        clickReturnOrderButton(8);
    }
    public void clickReturnOrderButton10() {
        clickReturnOrderButton(9);
    }
    public void clickReturnOrderButton11() {
        clickReturnOrderButton(10);
    }
    public void clickReturnOrderButton12() {
        clickReturnOrderButton(11);
    }


    //order page web element asserts
    public boolean isOrderNumberDisplayed(){return orderNumber.isDisplayed();}
    public boolean isOrderStatusDisplayed(){return orderStatus.isDisplayed();}
    public boolean isOrderShippingMethodDisplayed(){return orderShippingMethod.isDisplayed();}
    public boolean isOrderPaymentMethodDisplayed(){return orderPaymentMethod.isDisplayed();}
    public boolean isOrderDateDisplayed(){return orderDate.isDisplayed();}
    public boolean isOrderShippingAddressDisplayed(){return orderShippingAddress.isDisplayed();}
    public boolean isOrderProductSubTotalPriceDisplayed() {return orderProductSubTotalPrice.isDisplayed();}
    public boolean isOrderProductFlatShippingRateDisplayed() {return orderProductFlatShippingRate.isDisplayed();}
    public boolean isOrderProductTotalFinalPriceDisplayed() {return orderProductTotalPrice.isDisplayed();}
    //list elements
    public boolean isOrderProductNameDisplayed() {
        for (WebElement element : orderProductNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isOrderProductModelDisplayed() {
        for (WebElement element : orderProductModelElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isOrderProductQuantityDisplayed() {
        for (WebElement element : orderProductQuantityElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isOrderProductPriceDisplayed() {
        for (WebElement element : orderProductPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isOrderProductTotalPriceDisplayed() {
        for (WebElement element : orderProductTotalPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
}
