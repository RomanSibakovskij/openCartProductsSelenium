package com.opencart;

import org.junit.jupiter.api.*;

public class OpenCartProductPageTest extends TestMethods{

    //Test 007 -> view all available cameras on product page (since it doesn't have a general product page, categories are being used for filtering purposes)
    @Test
    @DisplayName("View All Available Cameras Test")
    @Tag("Available_Products_View")
    void availableCamerasListTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        availableProductListDisplayTest();
    }

    //Test 007a -> view all available desktops on product page
    @Test
    @DisplayName("View All Available Desktops Test")
    @Tag("Available_Products_View")
    void availableDesktopsListTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableDesktopsTest();
    }

    //Test 007b -> view all available desktops on product page
    @Test
    @DisplayName("View All Available Desktops Test (25 per page)")
    @Tag("Available_Products_View")
    void availableDesktops25PerPageListTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableDesktops25PerPageTest();
    }

    //Test 007c -> view all available laptops on product page
    @Test
    @DisplayName("View All Available Laptops Test")
    @Tag("Available_Products_View")
    void availableLaptopsListTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableLaptopsTest();
    }

    //Test 007d -> view all available components on product page
    @Test
    @DisplayName("View All Available Components Test (Monitors)")
    @Tag("Available_Products_View")
    void availableComponentsMonitorsListTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableComponentsTest();
    }

    //Test 007e -> view all available tablets on product page
    @Test
    @DisplayName("View All Available Tablets Test")
    @Tag("Available_Products_View")
    void availableTabletsListTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableTabletsTest();
    }

    //Test 007f -> view all available software on product page (there are none available)
    @Test
    @DisplayName("View All Available Software Test")
    @Tag("Available_Products_View")
    void availableSoftwareListTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableSoftwareTest();
    }

    //Test 007g -> view all available phones on product page
    @Test
    @DisplayName("View All Available Phones Test")
    @Tag("Available_Products_View")
    void availablePhonesListTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailablePhonesTest();
    }

    //Test 007h -> view all available mp3 players on product page
    @Test
    @DisplayName("View All Available MP3 Players Test")
    @Tag("Available_Products_View")
    void availableMP3PlayersListTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableMP3PlayersTest();
    }
}
