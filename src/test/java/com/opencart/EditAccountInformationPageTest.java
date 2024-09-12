package com.opencart;

import org.junit.jupiter.api.*;

public class EditAccountInformationPageTest extends TestMethods{

    //Test 006 -> edit user account information (first name)
    @Test
    @DisplayName("Edit User Account First Name")
    @Tag("Edit_User_Account_Information")
    void editUserAccountFirstNameTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
        logInTest(registerPage);
        editAccountFirstNameTest();
    }

    //Test 006a -> edit user account information (last name)
    @Test
    @DisplayName("Edit User Account Last Name")
    @Tag("Edit_User_Account_Information")
    void editUserAccountLastNameTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
        logInTest(registerPage);
        editAccountLastNameTest();
    }

    //Test 006b -> edit user account information (email)
    @Test
    @DisplayName("Edit User Account Email")
    @Tag("Edit_User_Account_Information")
    void editUserAccountEmailTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
        logInTest(registerPage);
        editAccountEmailTest();
    }

    //Test 006c -> invalid edit user account information test (no first name)
    @Test
    @DisplayName("Edit User Account - No First Name")
    @Tag("No_Singular_Input")
    @Tag("Edit_User_Account_Information_Invalid_Test")
    void editUserAccountNoFirstNameTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
        logInTest(registerPage);
        editAccountNoFirstNameTest();
    }

    //Test 006d -> invalid edit user account information test (no last name)
    @Test
    @DisplayName("Edit User Account  - No Last Name")
    @Tag("No_Singular_Input")
    @Tag("Edit_User_Account_Information_Invalid_Test")
    void editUserAccountNoLastNameTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
        logInTest(registerPage);
        editAccountNoLastNameTest();
    }

    //Test 006e -> invalid edit user account information test (no email)
    @Test
    @DisplayName("Edit User Account - No Email")
    @Tag("No_Singular_Input")
    @Tag("Edit_User_Account_Information_Invalid_Test")
    void editUserAccountNoEmailTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
        logInTest(registerPage);
        editAccountNoEmailTest();
    }

    //Test 006f -> invalid edit user account information test (invalid first name)
    @Test
    @DisplayName("Edit User Account - Invalid First Name(integer input instead of String)") //the first name gets edited
    @Tag("Invalid_Singular_Input")
    @Tag("Edit_User_Account_Information_Invalid_Test")
    void editUserAccountInvalidFirstNameTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
        logInTest(registerPage);
        editAccountInvalidFirstNameTest();
    }

    //Test 006g -> invalid edit user account information test (invalid last name)
    @Test
    @DisplayName("Edit User Account - Invalid Last Name(integer input instead of String)") //the last name gets edited
    @Tag("Invalid_Singular_Input")
    @Tag("Edit_User_Account_Information_Invalid_Test")
    void editUserAccountInvalidLastNameTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
        logInTest(registerPage);
        editAccountInvalidLastNameTest();
    }

    //Test 006h -> invalid edit user account information test (invalid email format)
    @Test
    @DisplayName("Edit User Account - Invalid Email Format")
    @Tag("No_Singular_Input")
    @Tag("Edit_User_Account_Information_Invalid_Test")
    void editUserAccountInvalidFormatEmailTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        validAccountRegistrationTest(registerPage);
        logOutTest();
        logInTest(registerPage);
        editAccountInvalidFormatEmailTest();
    }
}
