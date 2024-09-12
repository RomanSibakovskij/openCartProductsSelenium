package com.opencart;

import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods{

    // Test 001 -> navigate to register page test
    @Test
    @DisplayName("User Navigation To Register Page")
    @Tag("Navigate_To_Registration")
    void goToRegisterPageTest(){
        navigateToRegisterPageTest();
    }

    // Test 004 -> view products on homepage as a non-logged in user
    @Test
    @DisplayName("Non Registered User Products View on Homepage")
    @Tag("Products_On_Homepage")
    void viewProductsOnHomePageAsNonRegisteredUserTest(){
        homePageProductAsANonLoggedUserDisplayTest();
    }

    //Test 004a -> view products on homepage as a logged in user
    @Test
    @DisplayName("Registered User Products View on Homepage")
    @Tag("Products_On_Homepage")
    void viewProductsOnHomePageAsARegisteredUserTest(){
        navigateToRegisterPageTest();
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
        logInTest(registerPage);
        homePageProductAsALoggedUserDisplayTest();
    }

    //Test 005 -> add MacBook to wishlist as a non-registered user (featured products)
    @Test
    @DisplayName("Non Registered User Products Add MacBook To Wishlist on Homepage")
    @Tag("Products_On_Homepage")
    void addMacBookToWishListOnHomePageAsNonRegisteredUserTest(){
        homePageAddMacBookToWishListAsANonLoggedUserDisplayTest();
    }

    //Test 005a -> add Apple Display to wishlist as a non-registered user (featured products)
    @Test
    @DisplayName("Non Registered User Products Add Apple Display To Wishlist on Homepage")
    @Tag("Products_On_Homepage")
    void addDisplayToWishListOnHomePageAsNonRegisteredUserTest(){
        homePageAddAppleDisplayToWishListAsANonLoggedUserDisplayTest();
    }

    //Test 005b -> add MacBook to wishlist as a non-registered user (featured products)
    @Test
    @DisplayName("Non Registered User Products Add IPhone To Wishlist on Homepage")
    @Tag("Products_On_Homepage")
    void addIPhoneToWishListOnHomePageAsNonRegisteredUserTest(){
        homePageAddIPhoneToWishListAsANonLoggedUserDisplayTest();
    }

    //Test 005c -> add Canon camera to wishlist as a non-registered user (featured products)
    @Test
    @DisplayName("Non Registered User Products Add Canon Camera To Wishlist on Homepage")
    @Tag("Products_On_Homepage")
    void addCanonToWishListOnHomePageAsNonRegisteredUserTest(){
        homePageAddCanonCameraToWishListAsANonLoggedUserDisplayTest();
    }

    //Test 005d -> add MacBook to shopping cart as a non-registered user (featured products)
    @Test
    @DisplayName("Non Registered User Products Add MacBook To Cart on Homepage")
    @Tag("Products_On_Homepage")
    void addMacBookToCartOnHomePageAsNonRegisteredUserTest(){
        homePageAddMacBookToCartAsANonLoggedUserDisplayTest();
    }

    //Test 005e -> add IPhone to shopping cart as a non-registered user (featured products)
    @Test
    @DisplayName("Non Registered User Products Add IPhone To Cart on Homepage")
    @Tag("Products_On_Homepage")
    void addIPhoneToCartOnHomePageAsNonRegisteredUserTest(){
        homePageAddIPhoneToCartAsANonLoggedUserDisplayTest();
    }

    //Test 005f -> add Canon camera to shopping cart as a non-registered user (featured products)
    @Test
    @DisplayName("Non Registered User Products Add Canon Camera To Cart on Homepage")
    @Tag("Products_On_Homepage")
    void addCanonToCartOnHomePageAsNonRegisteredUserTest(){
        homePageAddCanonCameraToCartAsANonLoggedUserDisplayTest();
    }

//    @Test
//    @DisplayName("Non Registered User Products Add Apple Display To Cart on Homepage") //this method requires additional additions
//    @Tag("Products_On_Homepage")
//    void addDisplayToCartOnHomePageAsNonRegisteredUserTest(){
//        homePageAddAppleDisplayToCartAsANonLoggedUserDisplayTest();
//    }



}
