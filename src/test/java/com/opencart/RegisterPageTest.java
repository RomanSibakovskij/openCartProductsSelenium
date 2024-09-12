package com.opencart;

import org.junit.jupiter.api.*;

public class RegisterPageTest extends TestMethods{

    //valid registration

    //Test 002 -> valid user account creation
    @Test
    @DisplayName("Valid User Account Registration")
    @Tag("Valid_Account_Registration")
    void validUserAccountRegistrationTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
    }

    //no singular input
    //Test 002a -> user account creation without checking privacy policy checkbox
    @Test
    @DisplayName("Invalid User Account Registration - No Privacy Policy")
    @Tag("Invalid_Account_Registration")
    @Tag("No_Singular_Input")
    void invalidUserAccountRegistrationNoPrivacyTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        invalidAccountRegistrationNoPolicyTest(registerPage);
    }

    //Test 002b -> user account creation without inputting first name
    @Test
    @DisplayName("Invalid User Account Registration - No First Name")
    @Tag("Invalid_Account_Registration")
    @Tag("No_Singular_Input")
    void invalidUserAccountRegistrationNoFirstNameTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        invalidAccountRegistrationNoFirstNameTest(registerPage);
    }

    //Test 002c -> user account creation without inputting last name
    @Test
    @DisplayName("Invalid User Account Registration - No Last Name")
    @Tag("Invalid_Account_Registration")
    @Tag("No_Singular_Input")
    void invalidUserAccountRegistrationNoLastNameTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        invalidAccountRegistrationNoLastNameTest(registerPage);
    }

    //Test 002d -> user account creation without inputting email
    @Test
    @DisplayName("Invalid User Account Registration - No Email Address")
    @Tag("Invalid_Account_Registration")
    @Tag("No_Singular_Input")
    void invalidUserAccountRegistrationNoEmailTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        invalidAccountRegistrationNoEmailTest(registerPage);
    }

    //Test 002e -> user account creation without inputting password
    @Test
    @DisplayName("Invalid User Account Registration - No Password")
    @Tag("Invalid_Account_Registration")
    @Tag("No_Singular_Input")
    void invalidUserAccountRegistrationNoPasswordTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        invalidAccountRegistrationNoPasswordTest(registerPage);
    }

    //too long singular input
    //Test 002f -> user account creation with too long first name
    @Test
    @DisplayName("Invalid User Account Registration - Too Long First Name")
    @Tag("Invalid_Account_Registration")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccountRegistrationTooLongFirstNameTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        invalidAccountRegistrationTooLongFirstNameTest(registerPage);
    }

    //Test 002g -> user account creation with too long last name
    @Test
    @DisplayName("Invalid User Account Registration - Too Long Last Name")
    @Tag("Invalid_Account_Registration")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccountRegistrationTooLongLastNameTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        invalidAccountRegistrationTooLongLastNameTest(registerPage);
    }

    //Test 002h -> user account creation with too long email
    @Test
    @DisplayName("Invalid User Account Registration - Too Long Email")
    @Tag("Invalid_Account_Registration")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccountRegistrationTooLongEmailTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        invalidAccountRegistrationTooLongEmailTest(registerPage);
    }

    //Test 002i -> user account creation with too long password
    @Test //account gets created
    @DisplayName("Invalid User Account Registration - Too Long Password")
    @Tag("Invalid_Account_Registration")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccountRegistrationTooLongPasswordTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        invalidAccountRegistrationTooLongPasswordTest(registerPage);
    }

    //invalid email format
    //Test 002j -> user account creation with invalid first name format
    @Test
    @DisplayName("Invalid User Account Registration - Invalid Email Format")
    @Tag("Invalid_Account_Registration")
    @Tag("Invalid_Format_Input")
    void invalidUserAccountRegistrationInvalidEmailFormatTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        invalidAccountRegistrationInvalidEmailFormatTest(registerPage);
    }

    //Test 002k -> user account creation with too short password
    @Test //account gets created
    @DisplayName("Invalid User Account Registration - Too Short Password")
    @Tag("Invalid_Account_Registration")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountRegistrationTooShortPasswordTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        invalidAccountRegistrationTooShortPasswordTest(registerPage);
    }
}
