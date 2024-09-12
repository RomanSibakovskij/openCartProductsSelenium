package com.opencart;

import org.junit.jupiter.api.*;
public class ViewOrderHistoryPageTest extends TestMethods{

    //Important note : If some of the tests fail at some point (ElementClickInterceptedException, StaleElementReferenceException etc.) it's likely due to CPU throttling / internet connection issues since the test themselves are written correctly and their structure is identical

    //Test 017 -> view all desktops order submitted in the order history page
    @Test
    @DisplayName("View Order History of All Desktops Order")
    @Tag("View_All_Available_Products_Order")
    void viewAllDesktopsOrderTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableDesktops25PerPageTest();
        addAllAvailableDesktopsToShoppingCartTest();
        addAllAvailableDesktopsToCheckoutTest(registerPage);
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        viewOrderHistoryTest(orderHistoryPage);
        SingularOrderPage singularOrderPage = new SingularOrderPage(driver);
        viewSingleOrderData(singularOrderPage);
    }

    //Test 017a -> view all laptops order submitted in the order history page
    @Test
    @DisplayName("View Order History of All Laptops Order")
    @Tag("View_All_Available_Products_Order")
    void addAllLaptopsToShoppingCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableLaptopsTest();
        addAllAvailableLaptopsToShoppingCartTest();
        addAllAvailableLaptopsToCheckoutTest(registerPage);
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        viewOrderHistoryTest(orderHistoryPage);
        SingularOrderPage singularOrderPage = new SingularOrderPage(driver);
        viewSingleOrderData(singularOrderPage);
    }

    //Test 017b -> view all components order submitted in the order history page
    @Test
    @DisplayName("View Order History of All Components Order")
    @Tag("View_All_Available_Products_Order")
    void addAllComponentsToShoppingCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableComponentsTest();
        addAllAvailableComponentsToShoppingCartTest();
        addAllAvailableComponentsToCheckoutTest(registerPage);
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        viewOrderHistoryTest(orderHistoryPage);
        SingularOrderPage singularOrderPage = new SingularOrderPage(driver);
        viewSingleOrderData(singularOrderPage);
    }

    //Test 017c -> view all phones order submitted in the order history page
    @Test
    @DisplayName("View Order History of All Phones Order")
    @Tag("View_All_Available_Products_Order")
    void addAllPhonesToShoppingCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailablePhonesTest();
        addAllAvailablePhonesToShoppingCartTest();
        addAllAvailablePhonesToCheckoutTest(registerPage);
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        viewOrderHistoryTest(orderHistoryPage);
        SingularOrderPage singularOrderPage = new SingularOrderPage(driver);
        viewSingleOrderData(singularOrderPage);
    }

    //Test 017d -> view all cameras order submitted in the order history page
    @Test
    @DisplayName("View Order History of All Cameras Order")
    @Tag("View_All_Available_Products_Order")
    void addAllCamerasToShoppingCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        addAllAvailableCamerasToShoppingCartTest();
        addAllAvailableCamerasToCheckoutTest(registerPage);
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        viewOrderHistoryTest(orderHistoryPage);
        SingularOrderPage singularOrderPage = new SingularOrderPage(driver);
        viewSingleOrderData(singularOrderPage);
    }

    //Test 017e -> view all mp3 players order submitted in the order history page
    @Test
    @DisplayName("View Order History of All MP3 Players Order")
    @Tag("View_All_Available_Products_Order")
    void addAllMP3PlayersToShoppingCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableMP3PlayersTest();
        addAllAvailableMP3PlayersToShoppingCartTest();
        addAllAvailableMP3PlayersToCheckoutTest(registerPage);
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        viewOrderHistoryTest(orderHistoryPage);
        SingularOrderPage singularOrderPage = new SingularOrderPage(driver);
        viewSingleOrderData(singularOrderPage);
    }

    //return singular product from order tests (due to the necessity of external checks (manual email checks) only singular product return is executed)

    //Test 018 -> return a singular desktop product from all desktops order submitted
    @Test
    @DisplayName("Return A Singular Desktop Product")
    @Tag("Return_Singular_Product_From_Submitted_Order")
    void returnSingularDesktopFromOrderTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableDesktops25PerPageTest();
        addAllAvailableDesktopsToShoppingCartTest();
        addAllAvailableDesktopsToCheckoutTest(registerPage);
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        viewOrderHistoryTest(orderHistoryPage);
        SingularOrderPage singularOrderPage = new SingularOrderPage(driver);
        viewSingleOrderData(singularOrderPage);
        returnSingularDesktopProductTest(singularOrderPage);
    }

    //Test 018a -> return a singular laptop product from all desktops order submitted
    @Test
    @DisplayName("Return A Singular Laptop Product")
    @Tag("Return_Singular_Product_From_Submitted_Order")
    void returnSingularLaptopFromOrderTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableLaptopsTest();
        addAllAvailableLaptopsToShoppingCartTest();
        addAllAvailableLaptopsToCheckoutTest(registerPage);
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        viewOrderHistoryTest(orderHistoryPage);
        SingularOrderPage singularOrderPage = new SingularOrderPage(driver);
        viewSingleOrderData(singularOrderPage);
        returnSingularLaptopProductTest(singularOrderPage);
    }

    //Test 018b -> return a singular component product from all desktops order submitted
    @Test
    @DisplayName("Return A Singular Component Product")
    @Tag("Return_Singular_Product_From_Submitted_Order")
    void returnSingularComponentFromOrderTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableComponentsTest();
        addAllAvailableComponentsToShoppingCartTest();
        addAllAvailableComponentsToCheckoutTest(registerPage);
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        viewOrderHistoryTest(orderHistoryPage);
        SingularOrderPage singularOrderPage = new SingularOrderPage(driver);
        viewSingleOrderData(singularOrderPage);
        returnSingularComponentProductTest(singularOrderPage);
    }

    //Test 018c -> return a singular phone product from all desktops order submitted
    @Test
    @DisplayName("Return A Singular Phone Product")
    @Tag("Return_Singular_Product_From_Submitted_Order")
    void returnSingularPhoneFromOrderTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailablePhonesTest();
        addAllAvailablePhonesToShoppingCartTest();
        addAllAvailablePhonesToCheckoutTest(registerPage);
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        viewOrderHistoryTest(orderHistoryPage);
        SingularOrderPage singularOrderPage = new SingularOrderPage(driver);
        viewSingleOrderData(singularOrderPage);
        returnSingularPhoneProductTest(singularOrderPage);
    }

    //Test 018d -> return a singular camera product from all desktops order submitted
    @Test
    @DisplayName("Return A Singular Camera Product")
    @Tag("Return_Singular_Product_From_Submitted_Order")
    void returnSingularCameraFromOrderTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        addAllAvailableCamerasToShoppingCartTest();
        addAllAvailableCamerasToCheckoutTest(registerPage);
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        viewOrderHistoryTest(orderHistoryPage);
        SingularOrderPage singularOrderPage = new SingularOrderPage(driver);
        viewSingleOrderData(singularOrderPage);
        returnSingularCameraProductTest(singularOrderPage);
    }

    //Test 018e -> return a singular mp3 player product from all desktops order submitted
    @Test
    @DisplayName("Return A Singular MP3 Player Product")
    @Tag("Return_Singular_Product_From_Submitted_Order")
    void returnSingularMP3PlayerFromOrderTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableMP3PlayersTest();
        addAllAvailableMP3PlayersToShoppingCartTest();
        addAllAvailableMP3PlayersToCheckoutTest(registerPage);
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        viewOrderHistoryTest(orderHistoryPage);
        SingularOrderPage singularOrderPage = new SingularOrderPage(driver);
        viewSingleOrderData(singularOrderPage);
        returnSingularMP3PlayerProductTest(singularOrderPage);
    }


}
