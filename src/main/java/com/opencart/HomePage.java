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

public class HomePage extends BasePage{
    //homepage link
    @FindBy(css = "div#account-account > ul > li:nth-of-type(1) > a")
    private WebElement homePageLink;
    //shopping cart link
    @FindBy(xpath = "//a[@title='Shopping Cart']")
    private WebElement shoppingCartLink;

    //my account dropdown menu elements
    @FindBy(css = ".float-end.nav > .list-inline .dropdown-toggle")
    private WebElement myAccountDropdownMenu;
    @FindBy(css = ".dropdown-menu.dropdown-menu-right.show > li:nth-of-type(1) > .dropdown-item")
    private WebElement registerOption;
    @FindBy(css = ".dropdown-menu.dropdown-menu-right.show > li:nth-of-type(2) > .dropdown-item")
    private WebElement loginOption;

    //products web elements
    private List<WebElement> productImageElements = driver.findElements(By.xpath("//div[@class='image']/a/img"));
    private List<WebElement> productNameElements = driver.findElements(By.xpath("//div[@class='description']/h4/a"));
    private List<WebElement> productPriceElements = driver.findElements(By.xpath("//div[@class='price']/span[@class='price-new']"));
    private List<WebElement> productPriceExTaxElements = driver.findElements(By.xpath("//div[@class='price']/span[@class='price-tax']"));
    private List<WebElement> productDescriptionElements = driver.findElements(By.xpath("//div[@class='description']/p"));

    //product add button elements
    private List<WebElement> productAddToCartButton = driver.findElements(By.xpath("//button[@title='Add to Cart']"));
    private List<WebElement> productAddToWishlistButton = driver.findElements(By.xpath("//button[@title='Add to Wish List']"));

    //add to wishlist failure alert element
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement addToWishlistFailMessage;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //homepage logo link click
    public void clickOnHomePageLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(900));
        wait.until(ExpectedConditions.elementToBeClickable(homePageLink));
        homePageLink.click();
    }
    //shopping cart link click
    public void clickOnShoppingCartLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(900));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartLink));
        shoppingCartLink.click();
    }

    //my account dropdown menu options methods
    public void clickOnMyAccount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(myAccountDropdownMenu));
        myAccountDropdownMenu.click();
    }

    public void clickRegisterOption() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(registerOption));
        registerOption.click();
    }

    public void clickLoginOption() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(loginOption));
        loginOption.click();
    }
    //add homepage features products to wishlist click methods
    public void clickAddToWishlistButton(int productIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(720));
        wait.until(ExpectedConditions.elementToBeClickable(productAddToWishlistButton.get(productIndex)));
        productAddToWishlistButton.get(productIndex).click();
    }
    public void clickAddMacBookToWishlistButton() {
        clickAddToWishlistButton(0);
    }

    public void clickAddIPhoneToWishlistButton() {
        clickAddToWishlistButton(1);
    }

    public void clickAddAppleDisplayToWishlistButton() {
        clickAddToWishlistButton(2);
    }

    public void clickAddCanonCameraToWishlistButton() {
        clickAddToWishlistButton(3);
    }

    //add homepage features products to cart click methods
    public void clickAddToCartButton(int productIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(720));
        wait.until(ExpectedConditions.elementToBeClickable(productAddToCartButton.get(productIndex)));
        productAddToCartButton.get(productIndex).click();
    }
    public void clickAddMacBookToCartButton() {
        clickAddToCartButton(0);
    }

    public void clickAddIPhoneToCartButton() {
        clickAddToCartButton(1);
    }

    public void clickAddAppleDisplayToCartButton() {
        clickAddToCartButton(2);
    }

    public void clickAddCanonCameraToCartButton() {
        clickAddToCartButton(3);
    }

    //homepage logo link assert method
    public boolean isHomePageLinkDisplayed() {return homePageLink.isDisplayed();}
    //shopping cart link assert method
    public boolean isShoppingCartLinkDisplayed() {return shoppingCartLink.isDisplayed();}
    //my account dropdown menu options
    public boolean isMyAccountMenuDisplayed() {return myAccountDropdownMenu.isDisplayed();}
    public boolean isRegisterOptionDisplayed() {return registerOption.isDisplayed();}
    public boolean isLoginOptionDisplayed() {return loginOption.isDisplayed();}

    //product details lists
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

    // product prices list
    public List<String> getProductPrices() {
        List<String> productPrices = new ArrayList<>();
        for (WebElement element : productPriceElements) {
            productPrices.add(element.getText());
        }
        return productPrices;
    }

    // product prices(ex tax) list
    public List<String> getProductPricesExTax() {
        List<String> productPricesExTax = new ArrayList<>();
        for (WebElement element : productPriceExTaxElements) {
            productPricesExTax.add(element.getText());
        }
        return productPricesExTax;
    }
    // product descriptions list
    public List<String> getProductDescriptions() {
        List<String> productDescriptions = new ArrayList<>();
        for (WebElement element : productDescriptionElements) {
            productDescriptions.add(element.getText());
        }
        return productDescriptions;
    }
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
    public boolean isProductPriceDisplayed() {
        for (WebElement element : productPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductPriceExTaxDisplayed() {
        for (WebElement element : productPriceExTaxElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductDescriptionDisplayed() {
        for (WebElement element : productDescriptionElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean areProductAddToCartButtonsDisplayed() {
        for (WebElement element : productAddToCartButton) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean areProductAddToWishListButtonsDisplayed() {
        for (WebElement element : productAddToWishlistButton) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    //scroll and wait for visibility of elements
    private void scrollAndWaitForVisibility(List<WebElement> elements) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2100));

        for (WebElement element : elements) {
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            wait.until(ExpectedConditions.visibilityOf(element));
        }
    }

    public void ensureElementsAreVisible() {
        scrollAndWaitForVisibility(productNameElements);
        scrollAndWaitForVisibility(productPriceElements);
        scrollAndWaitForVisibility(productPriceExTaxElements);
        scrollAndWaitForVisibility(productDescriptionElements);
    }

    //add to wishlist failure message getter
    public String getAddToWishlistFailureMessage(){return addToWishlistFailMessage.getText();}
}
