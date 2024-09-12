package com.opencart;

import org.junit.jupiter.api.*;


public class LoginPageTest extends TestMethods{

    //Test 003 -> user account login test
    @Test
    @DisplayName("Valid User Account Login")
    @Tag("User_Account_Login")
    void UserAccountLogInTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
        logInTest(registerPage);
    }

    //Test 003a -> user account logout test
    @Test
    @DisplayName("Valid User Account Logout")
    @Tag("User_Account_Logout")
    void UserAccountLogOutTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
    }

    //Test 003b -> user account login without email
    @Test
    @DisplayName("Invalid User Account Login - No Email")
    @Tag("User_Account_Invalid_Login")
    @Tag("User_Account_No_Singular_Input")
    void UserAccountLogInNoEmailTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
        logInNoEmailTest(registerPage);
    }

    //Test 003c -> user account login without password
    @Test
    @DisplayName("Invalid User Account Login - No Password")
    @Tag("User_Account_Invalid_Login")
    @Tag("User_Account_No_Singular_Input")
    void UserAccountLogInNoPasswordTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
        logInNoPasswordTest(registerPage);
    }

    //Test 003d -> user account login with invalid email
    @Test
    @DisplayName("Invalid User Account Login - Invalid Email")
    @Tag("User_Account_Invalid_Login")
    @Tag("User_Account_Invalid_Login_Input")
    void UserAccountLogInInvalidEmailTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
        logInInvalidEmailTest(registerPage);
    }

    //Test 003e -> user account login with invalid password
    @Test
    @DisplayName("Invalid User Account Login - Invalid Password")
    @Tag("User_Account_Invalid_Login")
    @Tag("User_Account_Invalid_Login_Input")
    void UserAccountLogInInvalidPasswordTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
        logInInvalidPasswordTest(registerPage);
    }

    //Test 003f -> user account login with non-existing email(in the database beforehand)
    @Test
    @DisplayName("Invalid User Account Login - Non Existing Email")
    @Tag("User_Account_Invalid_Login")
    void UserAccountLogInNonExistingEmailTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
        logInNonExistingEmailTest(registerPage);
    }

}
