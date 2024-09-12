package com.opencart;

import org.junit.jupiter.api.*;

public class AllProductsToWishlistTest extends TestMethods{

    //Test 008 -> add available desktops into wishlist
    @Test
    @DisplayName("Add All Desktops Into Wishlist")
    @Tag("Add_All_Available_Products_To_Wishlist")
    void addAllDesktopsToWishlistTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableDesktops25PerPageTest();
        addAllAvailableDesktopsToWishListTest();
    }

//    @Test
//    @DisplayName("Remove All Desktops From Wishlist") //multiple button clicks throw StaleElementReferenceException even though the selectors themselves are correct
//    @Tag("Remove_All_Available_Products_From_Wishlist")
//    void removeAllDesktopsFromWishlistTest() {
//        RegisterPage registerPage = new RegisterPage(driver);
//        validAccountRegistrationTest(registerPage);
//        viewAllAvailableProductsTest();
//        viewAllAvailableDesktops25PerPageTest();
//        addAllAvailableDesktopsToWishListTest();
//        removeAllAvailableDesktopsFromWishlistTest();
//    }

//    @Test
//    @DisplayName("Add All Desktops To Cart") //multiple button clicks throw StaleElementReferenceException even though the selectors themselves are correct
//    @Tag("Add_All_Available_Products_To_Cart")
//    void addAllDesktopsToShoppingCartTest() {
//        RegisterPage registerPage = new RegisterPage(driver);
//        validAccountRegistrationTest(registerPage);
//        viewAllAvailableProductsTest();
//        viewAllAvailableDesktops25PerPageTest();
//        addAllAvailableDesktopsToWishListTest();
//        addAllAvailableDesktopsToCartTest();
//    }

    //Test 009 -> add available laptops into wishlist
    @Test
    @DisplayName("Add All Laptops Into Wishlist")
    @Tag("Add_All_Available_Products_To_Wishlist")
    void addAllLaptopsToWishlistTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableLaptopsTest();
        addAllAvailableLaptopsToWishListTest();
    }

//    @Test
//    @DisplayName("Remove All Laptops From Wishlist") //multiple button clicks throw StaleElementReferenceException even though the selectors themselves are correct
//    @Tag("Remove_All_Available_Products_From_Wishlist")
//    void removeAllLaptopsFromWishlistTest() {
//        RegisterPage registerPage = new RegisterPage(driver);
//        validAccountRegistrationTest(registerPage);
//        viewAllAvailableProductsTest();
//        viewAllAvailableLaptopsTest();
//        addAllAvailableLaptopsToWishListTest();
//        removeAllAvailableLaptopsFromWishlistTest();
//    }

//    @Test
//    @DisplayName("Add All Laptops To Cart") //multiple button clicks throw StaleElementReferenceException even though the selectors themselves are correct
//    @Tag("Add_All_Available_Products_To_Cart")
//    void addAllLaptopsToShoppingCartTest() {
//        RegisterPage registerPage = new RegisterPage(driver);
//        validAccountRegistrationTest(registerPage);
//        viewAllAvailableProductsTest();
//        viewAllAvailableLaptopsTest();
//        addAllAvailableLaptopsToWishListTest();
//        addAllAvailableLaptopsToShoppingCartTest();
//    }

    //Test 010 -> add available components into wishlist
    @Test
    @DisplayName("Add All Components Into Wishlist")
    @Tag("Add_All_Available_Products_To_Wishlist")
    void addAllComponentsToWishlistTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableComponentsTest();
        addAllAvailableComponentsToWishListTest();
    }

//    @Test
//    @DisplayName("Remove All Components From Wishlist") //multiple button clicks throw StaleElementReferenceException even though the selectors themselves are correct
//    @Tag("Remove_All_Available_Products_From_Wishlist")
//    void removeAllComponentsFromWishlistTest() {
//        RegisterPage registerPage = new RegisterPage(driver);
//        validAccountRegistrationTest(registerPage);
//        viewAllAvailableProductsTest();
//        viewAllAvailableComponentsTest();
//        addAllAvailableComponentsToWishListTest();
//        removeAllAvailableComponentsFromWishlistTest();
//    }

//    @Test //due to internet/cpu issues the test doesn't always run correctly
//    @DisplayName("Add All Components To Cart")
//    @Tag("Add_All_Available_Products_To_Cart")
//    void addAllLaptopsToShoppingCartTest() {
//        RegisterPage registerPage = new RegisterPage(driver);
//        validAccountRegistrationTest(registerPage);
//        viewAllAvailableProductsTest();
//        viewAllAvailableComponentsTest();
//        addAllAvailableComponentsToWishListTest();
//        addAllAvailableComponentsToShoppingCartTest();
//    }

    //Test 011 -> add available tablets into wishlist
    @Test
    @DisplayName("Add All Tablets Into Wishlist")
    @Tag("Add_All_Available_Products_To_Wishlist")
    void addAllTabletsToWishlistTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableTabletsTest();
        addAllAvailableTabletsToWishListTest();
    }

    //Test 011a -> remove available tablets into wishlist
    @Test
    @DisplayName("Remove All Tablets From Wishlist")
    @Tag("Remove_All_Available_Products_From_Wishlist")
    void removeAllTabletsFromWishlistTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableTabletsTest();
        addAllAvailableTabletsToWishListTest();
        removeAllAvailableTabletsFromWishlistTest();
    }

    //Test 011b -> add available tablets into wishlist (into shopping cart functionality)
    @Test
    @DisplayName("Add All Tablets To Shopping Cart") //since technically it's not viewed to be 'in stock' the operation shouldn't have been executed (bug - medium priority/high severity)
    @Tag("Add_All_Available_Products_To_Shopping_Cart")
    void addAllTabletsToShoppingCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableTabletsTest();
        addAllAvailableTabletsToWishListTest();
        addAllTabletsToCartTest();
    }

    //Test 012 -> add available phones into wishlist
    @Test
    @DisplayName("Add All Phones Into Wishlist")
    @Tag("Add_All_Available_Products_To_Wishlist")
    void addAllPhonesToWishlistTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailablePhonesTest();
        addAllAvailablePhonesToWishListTest();
    }

//    @Test
//    @DisplayName("Remove All Phones From Wishlist") //multiple button clicks throw StaleElementReferenceException even though the selectors themselves are correct
//    @Tag("Remove_All_Available_Products_From_Wishlist")
//    void removeAllPhonesFromWishlistTest() {
//        RegisterPage registerPage = new RegisterPage(driver);
//        validAccountRegistrationTest(registerPage);
//        viewAllAvailableProductsTest();
//        viewAllAvailablePhonesTest();
//        addAllAvailablePhonesToWishListTest();
//        removeAllAvailablePhonesFromWishlistTest();
//    }

//    @Test
//    @DisplayName("Add All Phones To Shopping Cart") //multiple button clicks throw StaleElementReferenceException even though the selectors themselves are correct
//    @Tag("Add_All_Available_Products_To_Shopping_Cart")
//    void addAllPhonesToShoppingCartTest() {
//        RegisterPage registerPage = new RegisterPage(driver);
//        validAccountRegistrationTest(registerPage);
//        viewAllAvailableProductsTest();
//        viewAllAvailablePhonesTest();
//        addAllAvailablePhonesToWishListTest();
//        addAllPhonesToCartTest();
//    }

    //Test 013 -> add available cameras into wishlist
    @Test
    @DisplayName("Add All Cameras Into Wishlist")
    @Tag("Add_All_Available_Products_To_Wishlist")
    void addAllCamerasToWishlistTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        addAllAvailableCamerasToWishListTest();
    }

//    @Test
//    @DisplayName("Remove All Cameras From Wishlist") //multiple button clicks throw StaleElementReferenceException even though the selectors themselves are correct
//    @Tag("Remove_All_Available_Products_From_Wishlist")
//    void removeAllCamerasFromWishlistTest() {
//        RegisterPage registerPage = new RegisterPage(driver);
//        validAccountRegistrationTest(registerPage);
//        viewAllAvailableProductsTest();
//        addAllAvailableCamerasToWishListTest();
//        removeAllAvailableCamerasFromWishlistTest();
//    }

//    @Test
//    @DisplayName("Add All Cameras To Shopping Cart") //multiple button clicks throw StaleElementReferenceException even though the selectors themselves are correct
//    @Tag("Add_All_Available_Products_To_Shopping_Cart")
//    void addAllCamerasToShoppingCartTest() {
//        RegisterPage registerPage = new RegisterPage(driver);
//        validAccountRegistrationTest(registerPage);
//        viewAllAvailableProductsTest();
//        addAllAvailableCamerasToWishListTest();
//        addAllCamerasToCartTest();
//    }

    //Test 014 -> add available mp3 players into wishlist
    @Test
    @DisplayName("Add All MP3 Players Into Wishlist")
    @Tag("Add_All_Available_Products_To_Wishlist")
    void addAllMP3PlayersToWishlistTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        viewAllAvailableProductsTest();
        viewAllAvailableMP3PlayersTest();
        addAllAvailableMP3PlayersToWishListTest();
    }

//    @Test
//    @DisplayName("Remove All MP3Players From Wishlist") //multiple button clicks throw StaleElementReferenceException even though the selectors themselves are correct
//    @Tag("Remove_All_Available_Products_From_Wishlist")
//    void removeAllMP3PlayersFromWishlistTest() {
//        RegisterPage registerPage = new RegisterPage(driver);
//        validAccountRegistrationTest(registerPage);
//        viewAllAvailableProductsTest();
//        viewAllAvailableMP3PlayersTest();
//        addAllAvailableMP3PlayersToWishListTest();
//        removeAllAvailableMP3PlayersFromWishlistTest();
//    }

//    @Test
//    @DisplayName("Add All MP3 Players To Shopping Cart") //multiple button clicks throw StaleElementReferenceException even though the selectors themselves are correct
//    @Tag("Add_All_Available_Products_To_Shopping_Cart")
//    void addAllMP3PlayersToShoppingCartTest() {
//        RegisterPage registerPage = new RegisterPage(driver);
//        validAccountRegistrationTest(registerPage);
//        viewAllAvailableProductsTest();
//        viewAllAvailableMP3PlayersTest();
//        addAllAvailableMP3PlayersToWishListTest();
//        addAllMP3PlayersToCartTest();
//    }

}
