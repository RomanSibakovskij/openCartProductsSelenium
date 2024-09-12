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

public class OpenCartProductPage extends BasePage{

    //desktops navbar link elements
    @FindBy(xpath = "//li[@class='nav-item'][4]/a")
    private WebElement camerasNavBarLink;
    //view per page dropdown menu web element
    @FindBy(xpath = "//select[@id='input-limit']")
    private WebElement showPerPageDropDownMenu;
    //'25 per page' view option web element
    @FindBy(xpath = "//select[@id='input-limit']/option[text()='25']")
    private WebElement show25PerPageOption;
    //product category link elements
    @FindBy(xpath = "//div[@class='list-group mb-3']/a[1]")
    private WebElement desktopsLink;
    @FindBy(xpath = "//div[@class='list-group mb-3']/a[2]")
    private WebElement laptopsLink;
    @FindBy(xpath = "//div[@class='list-group mb-3']/a[3]")
    private WebElement componentsLink;
    @FindBy(xpath = "//div[@class='list-group mb-3']/a[4]")
    private WebElement tabletsLink;
    @FindBy(xpath = "//div[@class='list-group mb-3']/a[5]")
    private WebElement softwareLink;
    @FindBy(xpath = "//div[@class='list-group mb-3']/a[6]")
    private WebElement phonesLink;
    @FindBy(xpath = "//div[@class='list-group mb-3']/a[7]")
    private WebElement camerasLink;
    @FindBy(xpath = "//div[@class='list-group mb-3']/a[8]")
    private WebElement mp3PlayersLink;

    //monitors component web element
    @FindBy(xpath = "//div[@class='list-group mb-3']/a[5]")
    private WebElement monitorsLink;

    //no products in list web element
    @FindBy(xpath = "//div[@id='content']/p")
    private WebElement noProductsMessage;

    //product web element list
    @FindBy(xpath = "//div[@class='image']/a/img")
    private List<WebElement> productImageElements;
    @FindBy(xpath = "//div[@class='description']/h4/a")
    private List<WebElement> productNameElements;
    @FindBy(xpath = "//div[@class='description']/p")
    private List<WebElement> productDescriptionElements;
    @FindBy(xpath = "//div[@class='price']/span[@class='price-new']")
    private List<WebElement> productPriceElements;
    @FindBy(xpath = "//div[@class='price']/span[@class='price-tax']")
    private List<WebElement> productPriceExTaxElements;

    //product interactive buttons list
    private List<WebElement> productAddToCartButton= driver.findElements(By.xpath("//button[@title='Add to Cart']"));
    private List<WebElement> productAddToWishlistButton = driver.findElements(By.xpath("//button[@title='Add to Wish List']"));
    private List<WebElement> productCompareProductsButton = driver.findElements(By.xpath("//button[@title='Compare this Product']"));

    //product page pagination web elements
    @FindBy(xpath = "//ul[@class='pagination']/li[1]")
    private WebElement page1Link;
    @FindBy(xpath = "//ul[@class='pagination']/li[2]")
    private WebElement page2Link;
    @FindBy(xpath = "//ul[@class='pagination']/li[3]")
    private WebElement nextPageLink;
    @FindBy(xpath = "//ul[@class='pagination']/li[4]")
    private WebElement finalPageLink;

    //footer my account page link
    @FindBy(css = "div:nth-of-type(4) > .list-unstyled > li:nth-of-type(1) > a")
    private WebElement footerMyAccountLink;
    //footer wishlist page link
    @FindBy(css = "div:nth-of-type(4) > .list-unstyled > li:nth-of-type(3) > a")
    private WebElement footerWishlistLink;

    public OpenCartProductPage(WebDriver driver) {
        super(driver);
    }

    //my account link click method
    public void clickMyAccountLink() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", footerMyAccountLink);
        footerMyAccountLink.click();
    }
    //cameras navbar link click method
    public void clickCamerasNavBarLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(900));
        wait.until(ExpectedConditions.elementToBeClickable(camerasNavBarLink));
        camerasNavBarLink.click();
    }
    //desktops link click method
    public void clickDesktopsLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(desktopsLink));
        desktopsLink.click();
    }
    //click show per page dropdown menu method
    public void clickShowPerPageMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(showPerPageDropDownMenu));
        showPerPageDropDownMenu.click();
    }
    //select '25 per page' option method
    public void select25PerPageOption() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(show25PerPageOption));
        show25PerPageOption.click();
    }
    //laptops link click method
    public void clickLaptopsLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(laptopsLink));
        laptopsLink.click();
    }
    //components link click method
    public void clickComponentsLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(componentsLink));
        componentsLink.click();
    }
    //monitors(components subcategory) link click method
    public void clickMonitorsLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(monitorsLink));
        monitorsLink.click();
    }
    //tablets link click method
    public void clickTabletsLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(tabletsLink));
        tabletsLink.click();
    }
    //software link click method
    public void clickSoftwareLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(softwareLink));
        softwareLink.click();
    }
    //phones link click method
    public void clickPhonesLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(phonesLink));
        phonesLink.click();
    }
    //mp3 players link click method
    public void clickMP3PlayersLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(mp3PlayersLink));
        mp3PlayersLink.click();
    }
    //pagination link click method
    public void clickPage2Link(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", page2Link);
        page2Link.click();
    }
    //footer wishlist click method
    public void clickFooterWishListLink(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", footerWishlistLink);
        footerWishlistLink.click();
    }

    //product details lists
    // product images list
    public List<String> getProductImages() {
        List<String> cameraImages = new ArrayList<>();
        for (WebElement element : productImageElements) {
            cameraImages.add(element.getText());
        }
        return cameraImages;
    }
    // camera names list
    public List<String> getProductNames() {
        List<String> cameraNames = new ArrayList<>();
        for (WebElement element : productNameElements) {
            cameraNames.add(element.getText());
        }
        return cameraNames;
    }

    // camera prices list
    public List<String> getProductPrices() {
        List<String> cameraPrices = new ArrayList<>();
        for (WebElement element : productPriceElements) {
            cameraPrices.add(element.getText());
        }
        return cameraPrices;
    }

    // camera prices(ex tax) list
    public List<String> getProductPricesExTax() {
        List<String> cameraPricesExTax = new ArrayList<>();
        for (WebElement element : productPriceExTaxElements) {
            cameraPricesExTax.add(element.getText());
        }
        return cameraPricesExTax;
    }
    // camera descriptions list
    public List<String> getProductDescriptions() {
        List<String> cameraDescriptions = new ArrayList<>();
        for (WebElement element : productDescriptionElements) {
            cameraDescriptions.add(element.getText());
        }
        return cameraDescriptions;
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

    //product interactive buttons click methods
    //add to wishlist click methods
    public void clickAddToWishlistButton(int productIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(720));
        wait.until(ExpectedConditions.elementToBeClickable(productAddToWishlistButton.get(productIndex)));
        productAddToWishlistButton.get(productIndex).click();
    }
    public void clickAddProduct1ToWishlistButton() {clickAddToWishlistButton(0);}
    public void clickAddProduct2ToWishlistButton() {
        clickAddToWishlistButton(1);
    }
    public void clickAddProduct3ToWishlistButton() {
        clickAddToWishlistButton(2);
    }
    public void clickAddProduct4ToWishlistButton() {
        clickAddToWishlistButton(3);
    }
    public void clickAddProduct5ToWishlistButton() {
        clickAddToWishlistButton(4);
    }
    public void clickAddProduct6ToWishlistButton() {
        clickAddToWishlistButton(5);
    }
    public void clickAddProduct7ToWishlistButton() {
        clickAddToWishlistButton(6);
    }
    public void clickAddProduct8ToWishlistButton() {
        clickAddToWishlistButton(7);
    }
    public void clickAddProduct9ToWishlistButton() {
        clickAddToWishlistButton(8);
    }
    public void clickAddProduct10ToWishlistButton() {
        clickAddToWishlistButton(9);
    }
    public void clickAddProduct11ToWishlistButton() {
        clickAddToWishlistButton(10);
    }
    public void clickAddProduct12ToWishlistButton() {
        clickAddToWishlistButton(11);
    }

    //add to cart click methods
    public void clickAddToCartButton(int productIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(720));
        wait.until(ExpectedConditions.elementToBeClickable(productAddToCartButton.get(productIndex)));
        productAddToCartButton.get(productIndex).click();
    }
    public void clickAddProduct1ToCartButton() {
        clickAddToCartButton(0);
    }
    public void clickAddProduct2ToCartButton() {
        clickAddToCartButton(1);
    }
    public void clickAddProduct3ToCartButton() {
        clickAddToCartButton(2);
    }
    public void clickAddProduct4ToCartButton() {
        clickAddToCartButton(3);
    }
    public void clickAddProduct5ToCartButton() {
        clickAddToCartButton(4);
    }
    public void clickAddProduct6ToCartButton() {
        clickAddToCartButton(5);
    }
    public void clickAddProduct7ToCartButton() {
        clickAddToCartButton(6);
    }
    public void clickAddProduct8ToCartButton() {
        clickAddToCartButton(7);
    }
    public void clickAddProduct9ToCartButton() {
        clickAddToCartButton(8);
    }
    public void clickAddProduct10ToCartButton() {
        clickAddToCartButton(9);
    }
    public void clickAddProduct11ToCartButton() {
        clickAddToCartButton(10);
    }
    public void clickAddProduct12ToCartButton() {
        clickAddToCartButton(11);
    }

    //product interactive web element assert methods
    public boolean isProductAddToCartButtonDisplayed() {
        for (WebElement element : productAddToCartButton) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductAddToWishListDisplayed() {
        for (WebElement element : productAddToWishlistButton) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCompareProductButtonDisplayed() {
        for (WebElement element : productCompareProductsButton) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    //desktops navbar link assert element
    public boolean isCamerasNavBarLinkDisplayed() {return camerasNavBarLink.isDisplayed();}
    //products page link assert methods
    public boolean isDesktopsLinkDisplayed(){return desktopsLink.isDisplayed();}
    public boolean isLaptopsLinkDisplayed(){return laptopsLink.isDisplayed();}
    public boolean isComponentsLinkDisplayed(){return componentsLink.isDisplayed();}
    public boolean isTabletsLinkDisplayed(){return tabletsLink.isDisplayed();}
    public boolean isSoftwareLinkDisplayed(){return softwareLink.isDisplayed();}
    public boolean isPhonesLinkDisplayed(){return phonesLink.isDisplayed();}
    public boolean isCamerasLinkDisplayed(){return camerasLink.isDisplayed();}
    public boolean isMP3PlayersLinkDisplayed(){return mp3PlayersLink.isDisplayed();}

    //products page pagination elements assert methods
    public boolean isPage1LinkDisplayed(){return page1Link.isDisplayed();}
    public boolean isPage2LinkDisplayed(){return page2Link.isDisplayed();}
    public boolean isNextPageLinkDisplayed(){return nextPageLink.isDisplayed();}
    public boolean isFinalPageLinkDisplayed(){return finalPageLink.isDisplayed();}

    //footer wishlist link assert method
    public boolean isFooterWishlistPageLinkDisplayed(){return footerWishlistLink.isDisplayed();}
    //no products in list message getter
    public String getNoProductMessageText(){return noProductsMessage.getText();}
}
