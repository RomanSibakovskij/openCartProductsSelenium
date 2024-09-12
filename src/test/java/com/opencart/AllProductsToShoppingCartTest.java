package com.opencart;

import org.junit.jupiter.api.*;

public class AllProductsToShoppingCartTest extends TestMethods{

    //Test 015 -> add available desktops into shopping cart
    @Test
    @DisplayName("Add All Desktops Into Shopping Cart")
    @Tag("Add_All_Available_Products_To_Shopping_Cart")
    void addAllDesktopsToShoppingCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableDesktops25PerPageTest();
        addAllAvailableDesktopsToShoppingCartTest();
    }

    //Test 015a -> add available laptops into shopping cart
    @Test
    @DisplayName("Add All Laptops Into Shopping Cart")
    @Tag("Add_All_Available_Products_To_Shopping_Cart")
    void addAllLaptopsToShoppingCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableLaptopsTest();
        addAllAvailableLaptopsToShoppingCartTest();
    }

    //Test 015b -> add available components into shopping cart
    @Test
    @DisplayName("Add All Components Into Shopping Cart")
    @Tag("Add_All_Available_Products_To_Shopping_Cart")
    void addAllComponentsToShoppingCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableComponentsTest();
        addAllAvailableComponentsToShoppingCartTest();
    }

    //Test 015c -> add available tablets into shopping cart
    @Test
    @DisplayName("Add All Tablets Into Shopping Cart")
    @Tag("Add_All_Available_Products_To_Shopping_Cart")
    void addAllTabletsToShoppingCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableTabletsTest();
        addAllAvailableTabletsToShoppingCartTest();
    }

    //Test 015d -> add available phones into shopping cart
    @Test
    @DisplayName("Add All Phones Into Shopping Cart")
    @Tag("Add_All_Available_Products_To_Shopping_Cart")
    void addAllPhonesToShoppingCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailablePhonesTest();
        addAllAvailablePhonesToShoppingCartTest();
    }

    //Test 015e -> add available cameras into shopping cart
    @Test
    @DisplayName("Add All Cameras Into Shopping Cart")
    @Tag("Add_All_Available_Products_To_Shopping_Cart")
    void addAllCamerasToShoppingCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        addAllAvailableCamerasToShoppingCartTest();
    }

    //Test 015f -> add available mp3 players into shopping cart
    @Test
    @DisplayName("Add All MP3 Players Into Shopping Cart")
    @Tag("Add_All_Available_Products_To_Shopping_Cart")
    void addAllMP3PlayersToShoppingCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableMP3PlayersTest();
        addAllAvailableMP3PlayersToShoppingCartTest();
    }
}
