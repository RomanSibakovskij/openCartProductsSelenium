package com.opencart;

import org.junit.jupiter.api.*;

public class AllProductsToCheckoutTest extends TestMethods{

    //Test 016 -> add available desktops to checkout
    @Test
    @DisplayName("Add All Desktops Into Checkout")
    @Tag("Add_All_Available_Products_To_Checkout")
    void addAllDesktopsToCheckoutTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableDesktops25PerPageTest();
        addAllAvailableDesktopsToShoppingCartTest();
        addAllAvailableDesktopsToCheckoutTest(registerPage);
    }

    //Test 016a -> add available laptops to checkout
    @Test
    @DisplayName("Add All Laptops Into Checkout")
    @Tag("Add_All_Available_Products_To_Checkout")
    void addAllLaptopsToCheckoutTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableLaptopsTest();
        addAllAvailableLaptopsToShoppingCartTest();
        addAllAvailableLaptopsToCheckoutTest(registerPage);
    }

    //Test 016b -> add available components to checkout
    @Test
    @DisplayName("Add All Components Into Checkout")
    @Tag("Add_All_Available_Products_To_Checkout")
    void addAllComponentsToCheckoutTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableComponentsTest();
        addAllAvailableComponentsToShoppingCartTest();
        addAllAvailableComponentsToCheckoutTest(registerPage);
    }

    //Test 016c -> add available phones to checkout
    @Test
    @DisplayName("Add All Phones Into Checkout")
    @Tag("Add_All_Available_Products_To_Checkout")
    void addAllPhonesToCheckoutTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailablePhonesTest();
        addAllAvailablePhonesToShoppingCartTest();
        addAllAvailablePhonesToCheckoutTest(registerPage);
    }

    //Test 016d -> add available cameras to checkout
    @Test
    @DisplayName("Add All Cameras Into Checkout")
    @Tag("Add_All_Available_Products_To_Checkout")
    void addAllCamerasToCheckoutTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        addAllAvailableCamerasToShoppingCartTest();
        addAllAvailableCamerasToCheckoutTest(registerPage);
    }

    //Test 016e -> add available mp3 players to checkout
    @Test
    @DisplayName("Add All MP3 Players Into Checkout")
    @Tag("Add_All_Available_Products_To_Checkout")
    void addAllMP3PlayersToCheckoutTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableMP3PlayersTest();
        addAllAvailableMP3PlayersToShoppingCartTest();
        addAllAvailableMP3PlayersToCheckoutTest(registerPage);
    }
}
