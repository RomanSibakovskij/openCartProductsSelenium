package com.opencart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartPage extends BasePage{

    //not in stock error message web element
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement itemNotInStockError;

    //shopping cart product table web elements
    @FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr/td[@class='text-center']")
    private List<WebElement> productImageElements;
    @FindBy(xpath = "//td[@class='text-start text-wrap']/a")
    private List<WebElement> productNameElements;
    @FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr/td[3]")
    private List<WebElement> productModelElements;
    @FindBy(xpath = "//input[@name='quantity']")
    private List<WebElement> productQuantityElements;
    @FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr/td[@class='text-end'][1]")
    private List<WebElement> productUnitPriceElements;
    @FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr/td[@class='text-end'][2]")
    private List<WebElement> productTotalPriceElements;
    @FindBy(xpath = "//tfoot[@id='checkout-total']/tr[1]/td[@class='text-end'][2]")
    private List<WebElement> productSubTotalPriceElements;
    @FindBy(xpath = "//tfoot[@id='checkout-total']/tr[2]/td[@class='text-end'][2]")
    private List<WebElement> productEcoTaxElements;
    @FindBy(xpath = "//tfoot[@id='checkout-total']/tr[3]/td[@class='text-end'][2]")
    private List<WebElement> productVATElements;
    @FindBy(xpath = "//tfoot[@id='checkout-total']/tr[4]/td[@class='text-end'][2]")
    private List<WebElement> productAfterTaxTotalPriceElements;

    //checkout button
    @FindBy(xpath = "//div[@class='col text-end']/a[@class='btn btn-primary']")
    private WebElement productCheckoutButton;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    //shopping cart product table value getters
    //product details lists
    // product images list
    public List<String> getProductImage() {
        List<String> productImages = new ArrayList<>();
        for (WebElement element : productImageElements) {
            productImages.add(element.getText());
        }
        return productImages;
    }
    // product names list
    public List<String> getProductName() {
        List<String> productNames = new ArrayList<>();
        for (WebElement element : productNameElements) {
            productNames.add(element.getText());
        }
        return productNames;
    }

    // product models list
    public List<String> getProductModel() {
        List<String> productModel = new ArrayList<>();
        for (WebElement element : productModelElements) {
            productModel.add(element.getText());
        }
        return productModel;
    }

    // product quantity list
    public List<String> getProductQuantity() {
        List<String> productQuantity = new ArrayList<>();
        for (WebElement element : productQuantityElements) {
            productQuantity.add(element.getAttribute("value"));
        }
        return productQuantity;
    }
    // product unit prices list
    public List<String> getProductUnitPrice() {
        List<String> productTotalPrice = new ArrayList<>();
        for (WebElement element : productUnitPriceElements) {
            productTotalPrice.add(element.getText());
        }
        return productTotalPrice;
    }
    // product total prices list
    public List<String> getProductTotalPrice() {
        List<String> productTotalPrice = new ArrayList<>();
        for (WebElement element : productTotalPriceElements) {
            productTotalPrice.add(element.getText());
        }
        return productTotalPrice;
    }
    // product unit prices list
    public List<String> getProductSubTotalPrice() {
        List<String> productSubTotalPrice = new ArrayList<>();
        for (WebElement element : productSubTotalPriceElements) {
            productSubTotalPrice.add(element.getText());
        }
        return productSubTotalPrice;
    }
    // product unit prices list
    public List<String> getProductEcoTax() {
        List<String> productEcoTax = new ArrayList<>();
        for (WebElement element : productEcoTaxElements) {
            productEcoTax.add(element.getText());
        }
        return productEcoTax;
    }
    // product unit prices list
    public List<String> getProductVAT() {
        List<String> productVAT = new ArrayList<>();
        for (WebElement element : productVATElements) {
            productVAT.add(element.getText());
        }
        return productVAT;
    }
    // product unit prices list
    public List<String> getProductAfterTaxTotalPrice() {
        List<String> productAfterTaxTotalPrice = new ArrayList<>();
        for (WebElement element : productAfterTaxTotalPriceElements) {
            productAfterTaxTotalPrice.add(element.getText());
        }
        return productAfterTaxTotalPrice;
    }

    //checkout button click method
    public void clickCheckoutButton(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", productCheckoutButton);
        productCheckoutButton.click();
    }

    //shopping cart product table web element assert methods
    //product web element asserts(on homepage)
    public boolean isProductImageDisplayed() {
        for (WebElement element : productImageElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductNameDisplayed() {
        for (WebElement element : productNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductModelDisplayed() {
        for (WebElement element : productModelElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductQuantityDisplayed() {
        for (WebElement element : productQuantityElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductUnitPriceDisplayed() {
        for (WebElement element : productUnitPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductTotalPriceDisplayed() {
        for (WebElement element : productTotalPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductSubTotalPriceDisplayed() {
        for (WebElement element : productSubTotalPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductEcoTaxDisplayed() {
        for (WebElement element : productEcoTaxElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductVATDisplayed() {
        for (WebElement element : productVATElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductAfterTaxTotalPriceDisplayed() {
        for (WebElement element : productAfterTaxTotalPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    //checkout button web element assert method
    public boolean isProductCheckoutButtonDisplayed() {return productCheckoutButton.isDisplayed();}
    //not in stock item error getter
    public String getNotInStockErrorMessage(){return itemNotInStockError.getText();}

}
