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

public class WishlistPage extends BasePage{

    //product data web element lists
    @FindBy(xpath = "//table[@class='table table-bordered table-hover']/tbody/tr/td[@class='text-center']/a")
    private List<WebElement> productImageElements;
    @FindBy(xpath = "//table[@class='table table-bordered table-hover']/tbody/tr/td[@class='text-start'][1]")
    private List<WebElement> productNameElements;
    @FindBy(xpath = "//table[@class='table table-bordered table-hover']/tbody/tr/td[@class='text-start'][2]")
    private List<WebElement> productModelElements;
    @FindBy(xpath = "//table[@class='table table-bordered table-hover']/tbody/tr/td[@class='text-end'][1]")
    private List<WebElement> productStockElements;
    @FindBy(xpath = "//table[@class='table table-bordered table-hover']/tbody/tr/td[@class='text-end'][2]")
    private List<WebElement> productUnitPriceElements;

    //product wishlist interactive web element lists
    private List<WebElement> productAddToCartButton = driver.findElements(By.xpath("//form[@data-oc-target='#wishlist']/button[@class='btn btn-primary']"));
    private List<WebElement> productRemoveProductButton = driver.findElements(By.xpath("//form[@data-oc-target='#wishlist']/button[@class='btn btn-danger']"));

    //empty wishlist message text element
    @FindBy(xpath = "//div[@id='wishlist']")
    private WebElement emptyWishlistMessage;


    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    //wishlist product data display methods
    // product images list
    public List<String> getProductImages() {
        List<String> productImages = new ArrayList<>();
        for (WebElement element : productImageElements) {
            productImages.add(element.getText());
        }
        return productImages;
    }
    // product names list
    public List<String> getProductNames() {
        List<String> productNames = new ArrayList<>();
        for (WebElement element : productNameElements) {
            productNames.add(element.getText());
        }
        return productNames;
    }

    // product model list
    public List<String> getProductModel() {
        List<String> productModels = new ArrayList<>();
        for (WebElement element : productModelElements) {
            productModels.add(element.getText());
        }
        return productModels;
    }

    // product stock list
    public List<String> getProductStock() {
        List<String> productStock = new ArrayList<>();
        for (WebElement element : productStockElements) {
            productStock.add(element.getText());
        }
        return productStock;
    }
    // product price list
    public List<String> getProductUnitPrices() {
        List<String> productUnitPrices = new ArrayList<>();
        for (WebElement element : productUnitPriceElements) {
            productUnitPrices.add(element.getText());
        }
        return productUnitPrices;
    }

    //add wishlist products to cart click methods
    public void clickAddToCartButton(int productIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(720));
        wait.until(ExpectedConditions.elementToBeClickable(productAddToCartButton.get(productIndex)));
        productAddToCartButton.get(productIndex).click();
    }
    public void clickProduct1AddToCartButton() {
        clickAddToCartButton(0);
    }
    public void clickProduct2AddToCartButton() {
        clickAddToCartButton(1);
    }
    public void clickProduct3AddToCartButton() {
        clickAddToCartButton(2);
    }
    public void clickProduct4AddToCartButton() {
        clickAddToCartButton(3);
    }
    public void clickProduct5AddToCartButton() {
        clickAddToCartButton(4);
    }
    public void clickProduct6AddToCartButton() {
        clickAddToCartButton(5);
    }
    public void clickProduct7AddToCartButton() {
        clickAddToCartButton(6);
    }
    public void clickProduct8AddToCartButton() {
        clickAddToCartButton(7);
    }
    public void clickProduct9AddToCartButton() {
        clickAddToCartButton(8);
    }
    public void clickProduct10AddToCartButton() {
        clickAddToCartButton(9);
    }
    public void clickProduct11AddToCartButton() {
        clickAddToCartButton(10);
    }
    public void clickProduct12AddToCartButton() {
        clickAddToCartButton(11);
    }

    //add wishlist  products to cart click methods
    public void clickRemoveFromWishListButton(int productIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.elementToBeClickable(productRemoveProductButton.get(productIndex)));
        productRemoveProductButton.get(productIndex).click();
    }
    public void clickProduct1RemoveButton() {
        clickRemoveFromWishListButton(0);
    }
    public void clickProduct2RemoveButton() {clickRemoveFromWishListButton(1);}
    public void clickProduct3RemoveButton() {
        clickRemoveFromWishListButton(2);
    }
    public void clickProduct4RemoveButton() {
        clickRemoveFromWishListButton(3);
    }
    public void clickProduct5RemoveButton() {
        clickRemoveFromWishListButton(4);
    }
    public void clickProduct6RemoveButton() {
        clickRemoveFromWishListButton(5);
    }
    public void clickProduct7RemoveButton() {
        clickRemoveFromWishListButton(6);
    }
    public void clickProduct8RemoveButton() {
        clickRemoveFromWishListButton(7);
    }
    public void clickProduct9RemoveButton() {
        clickRemoveFromWishListButton(8);
    }
    public void clickProduct10RemoveButton() {
        clickRemoveFromWishListButton(9);
    }
    public void clickProduct11RemoveButton() {
        clickRemoveFromWishListButton(10);
    }
    public void clickProduct12RemoveButton() {
        clickRemoveFromWishListButton(11);
    }

    //product web element asserts(wishlist)
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
    public boolean isProductStockDisplayed() {
        for (WebElement element : productStockElements) {
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
    //wishlist product interactive button web element asserts
    public boolean areAddToCartButtonsDisplayed() {
        for (WebElement element : productAddToCartButton) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean areRemoveFromWishlistButtonsDisplayed() {
        for (WebElement element : productRemoveProductButton) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    //empty wishlist message getter
    public String getEmptyWishlistMessage(){return emptyWishlistMessage.getText();}
}
