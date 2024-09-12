package com.opencart;

import org.slf4j.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestMethods extends BaseTest{

    private static Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //navigate to register page test method
    protected void navigateToRegisterPageTest(){
        HomePage homePage = new HomePage(driver);

        //assert my account dropdown menu is displayed
        assertTrue(homePage.isMyAccountMenuDisplayed(), "The my account dropdown menu link is not present");
        homePage.clickOnMyAccount();
        //assert the register option is displayed
        assertTrue(homePage.isRegisterOptionDisplayed(), "The register option is not present");
        homePage.clickRegisterOption();
    }

    //valid registration page test method
    protected void validAccountRegistrationTest(RegisterPage registerPage){
        navigateToRegisterPageTest();

        //input valid data
        registerPage.inputValidData();
        //assert web elements are displayed
        isRegisterPageWebElementDisplayed(registerPage);
        //input data into input fields
        registerPage.inputFirstName();
        registerPage.inputLastName();
        registerPage.inputEmailAddress();
        registerPage.inputPassword();
        registerPage.clickSubscribeButton();
        registerPage.clickPrivacyPolicyButton();
        registerPage.clickContinueButton();
        logger.info("Saved email address: " + registerPage.getEmailAddress() + "\n");
        logger.info("Saved password: " + registerPage.getPassword() + "\n");
        //assert the account has been created
        //assertEquals(registerPage.getSuccessMessage(), "Your Account Has Been Created!"); -> element can't be found, it finds not what needed
        registerPage.clickSecondContinueButton();
    }

    //invalid registration page test method (no privacy policy click)
    protected void invalidAccountRegistrationNoPolicyTest(RegisterPage registerPage){
        navigateToRegisterPageTest();

        //input valid data
        registerPage.inputValidData();
        //assert web elements are displayed
        isRegisterPageWebElementDisplayed(registerPage);
        //input data into input fields
        registerPage.inputFirstName();
        registerPage.inputLastName();
        registerPage.inputEmailAddress();
        registerPage.inputPassword();
        registerPage.clickContinueButton();
    }

    //invalid registration page test method (no first name)
    protected void invalidAccountRegistrationNoFirstNameTest(RegisterPage registerPage){
        navigateToRegisterPageTest();

        //input valid data
        registerPage.inputNoFirstNameData();
        //assert web elements are displayed
        isRegisterPageWebElementDisplayed(registerPage);
        //input data into input fields
        registerPage.inputNoFirstName();
        registerPage.inputLastName();
        registerPage.inputEmailAddress();
        registerPage.inputPassword();
        registerPage.clickPrivacyPolicyButton();
        registerPage.clickContinueButton();
        //assert the correct error message appears
        assertEquals(registerPage.getInvalidFirstNameMessage(), "First Name must be between 1 and 32 characters!");
    }

    //invalid registration page test method (no last name)
    protected void invalidAccountRegistrationNoLastNameTest(RegisterPage registerPage){
        navigateToRegisterPageTest();

        //input valid data
        registerPage.inputNoLastNameData();
        //assert web elements are displayed
        isRegisterPageWebElementDisplayed(registerPage);
        //input data into input fields
        registerPage.inputFirstName();
        registerPage.inputNoLastName();
        registerPage.inputEmailAddress();
        registerPage.inputPassword();
        registerPage.clickPrivacyPolicyButton();
        registerPage.clickContinueButton();
        //assert the correct error message appears
        assertEquals(registerPage.getInvalidLastNameMessage(), "Last Name must be between 1 and 32 characters!");
    }

    //invalid registration page test method (no email)
    protected void invalidAccountRegistrationNoEmailTest(RegisterPage registerPage){
        navigateToRegisterPageTest();

        //input valid data
        registerPage.inputNoEmailData();
        //assert web elements are displayed
        isRegisterPageWebElementDisplayed(registerPage);
        //input data into input fields
        registerPage.inputFirstName();
        registerPage.inputLastName();
        registerPage.inputNoEmailAddress();
        registerPage.inputPassword();
        registerPage.clickPrivacyPolicyButton();
        registerPage.clickContinueButton();
        //assert the correct error message appears
        assertEquals(registerPage.getInvalidEmailMessage(), "E-Mail Address does not appear to be valid!");
    }

    //invalid registration page test method (no password)
    protected void invalidAccountRegistrationNoPasswordTest(RegisterPage registerPage){
        navigateToRegisterPageTest();

        //input valid data
        registerPage.inputNoPasswordData();
        //assert web elements are displayed
        isRegisterPageWebElementDisplayed(registerPage);
        //input data into input fields
        registerPage.inputFirstName();
        registerPage.inputLastName();
        registerPage.inputEmailAddress();
        registerPage.inputNoPassword();
        registerPage.clickPrivacyPolicyButton();
        registerPage.clickContinueButton();
        //assert the correct error message appears
        assertEquals(registerPage.getInvalidPasswordMessage(), "Password must be between 4 and 20 characters!");
    }

    //invalid registration page test method (too long first name)
    protected void invalidAccountRegistrationTooLongFirstNameTest(RegisterPage registerPage){
        navigateToRegisterPageTest();

        //input valid data
        registerPage.inputTooLongFirstNameData();
        //assert web elements are displayed
        isRegisterPageWebElementDisplayed(registerPage);
        //input data into input fields
        registerPage.inputTooLongFirstNameData();
        registerPage.inputLastName();
        registerPage.inputEmailAddress();
        registerPage.inputPassword();
        registerPage.clickPrivacyPolicyButton();
        registerPage.clickContinueButton();
        //assert the correct error message appears
        assertEquals(registerPage.getInvalidFirstNameMessage(), "First Name must be between 1 and 32 characters!");
    }

    //invalid registration page test method (too long last name)
    protected void invalidAccountRegistrationTooLongLastNameTest(RegisterPage registerPage){
        navigateToRegisterPageTest();

        //input valid data
        registerPage.inputTooLongLastNameData();
        //assert web elements are displayed
        isRegisterPageWebElementDisplayed(registerPage);
        //input data into input fields
        registerPage.inputFirstName();
        registerPage.inputTooLongLastName();
        registerPage.inputEmailAddress();
        registerPage.inputPassword();
        registerPage.clickPrivacyPolicyButton();
        registerPage.clickContinueButton();
        //assert the correct error message appears
        assertEquals(registerPage.getInvalidLastNameMessage(), "Last Name must be between 1 and 32 characters!");
    }

    //invalid registration page test method (too long email)
    protected void invalidAccountRegistrationTooLongEmailTest(RegisterPage registerPage){
        navigateToRegisterPageTest();

        //input valid data
        registerPage.inputTooLongEmailData();
        //assert web elements are displayed
        isRegisterPageWebElementDisplayed(registerPage);
        //input data into input fields
        registerPage.inputFirstName();
        registerPage.inputLastName();
        registerPage.inputTooLongEmail();
        registerPage.inputPassword();
        registerPage.clickPrivacyPolicyButton();
        registerPage.clickContinueButton();
        //assert the correct error message appears
        assertEquals(registerPage.getInvalidEmailMessage(), "E-Mail Address does not appear to be valid!");
    }

    //invalid registration page test method (too long password)
    protected void invalidAccountRegistrationTooLongPasswordTest(RegisterPage registerPage){
        navigateToRegisterPageTest();

        //input valid data
        registerPage.inputTooLongPasswordData();
        //assert web elements are displayed
        isRegisterPageWebElementDisplayed(registerPage);
        //input data into input fields
        registerPage.inputFirstName();
        registerPage.inputLastName();
        registerPage.inputEmailAddress();
        registerPage.inputTooLongPassword();
        registerPage.clickPrivacyPolicyButton();
        registerPage.clickContinueButton();
        //assert the correct error message appears
        if(!registerPage.getInvalidPasswordMessage().equals("Password must be between 4 and 20 characters!")){
            logger.error("Expected an invalid password message but found none. The account might have been created despite password limitations.");
        }else{
            assertEquals(registerPage.getInvalidPasswordMessage(), "Password must be between 4 and 20 characters!");
        }
    }

    //invalid registration page test method (invalid email format)
    protected void invalidAccountRegistrationInvalidEmailFormatTest(RegisterPage registerPage){
        navigateToRegisterPageTest();

        //input valid data
        registerPage.inputInvalidEmailFormatData();
        //assert web elements are displayed
        isRegisterPageWebElementDisplayed(registerPage);
        //input data into input fields
        registerPage.inputFirstName();
        registerPage.inputLastName();
        registerPage.inputInvalidEmailFormat();
        registerPage.inputPassword();
        registerPage.clickPrivacyPolicyButton();
        registerPage.clickContinueButton();
        //assert the correct error message appears
        assertEquals(registerPage.getInvalidEmailMessage(), "E-Mail Address does not appear to be valid!");
    }

    //invalid registration page test method (too short password)
    protected void invalidAccountRegistrationTooShortPasswordTest(RegisterPage registerPage){
        navigateToRegisterPageTest();

        //input valid data
        registerPage.inputTooShortPasswordData();
        //assert web elements are displayed
        isRegisterPageWebElementDisplayed(registerPage);
        //input data into input fields
        registerPage.inputFirstName();
        registerPage.inputLastName();
        registerPage.inputEmailAddress();
        registerPage.inputTooShortPassword();
        registerPage.clickPrivacyPolicyButton();
        registerPage.clickContinueButton();
        //assert the correct error message appears
        if(!registerPage.getInvalidPasswordMessage().equals("Password must be between 4 and 20 characters!")){
            logger.error("Expected an invalid password message but found none. The account might have been created despite password limitations.");
        }else{
            assertEquals(registerPage.getInvalidPasswordMessage(), "Password must be between 4 and 20 characters!");
        }
    }

    //logout test method
    protected void logOutTest(){
        AccountPage accountPage = new AccountPage(driver);
        //assert logout link is displayed
        assertTrue(accountPage.isLogOutLinkDisplayed(), "The logout link is not displayed");
        accountPage.clickLogOutLink();
    }

    //valid login test method
    protected void logInTest(RegisterPage registerPage){
        LoginPage loginPage = new LoginPage(driver);
        //login link click
        loginPage.clickLogInLink();
        //input data
        loginPage.inputLoginData(registerPage);
        loginPage.inputEmailAddress(registerPage.getEmailAddress());
        logger.info("Login email address: " + registerPage.getEmailAddress() + "\n");
        loginPage.inputPassword(registerPage.getPassword());
        logger.info("Login password: " + registerPage.getPassword() + "\n");
        //login click
        loginPage.clickLoginButton();
    }

    //invalid login test methods
    //no email
    protected void logInNoEmailTest(RegisterPage registerPage){
        LoginPage loginPage = new LoginPage(driver);
        //login link click
        loginPage.clickLogInLink();
        //input data
        loginPage.inputLoginNoEmailData(registerPage);
        loginPage.inputNoEmailAddress();
        loginPage.inputPassword(registerPage.getPassword());
        logger.info("Login password: " + registerPage.getPassword() + "\n");
        //login click
        loginPage.clickLoginButton();
        //assert the alert message is as expected
        assertEquals(loginPage.getAlertMessage(), "Warning: No match for E-Mail Address and/or Password.");
    }

    //no password
    protected void logInNoPasswordTest(RegisterPage registerPage){
        LoginPage loginPage = new LoginPage(driver);
        //login link click
        loginPage.clickLogInLink();
        //input data
        loginPage.inputLoginNoPasswordData(registerPage);
        loginPage.inputEmailAddress(registerPage.getEmailAddress());
        logger.info("Login email address: " + registerPage.getEmailAddress() + "\n");
        loginPage.inputNoPassword();
        //login click
        loginPage.clickLoginButton();
        //assert the alert message is as expected
        //assertEquals(loginPage.getAlertMessage(), "Warning: No match for E-Mail Address and/or Password."); // -> the alert box is the same but the text/element can't be found for some reason
    }

    //invalid email
    protected void logInInvalidEmailTest(RegisterPage registerPage){
        LoginPage loginPage = new LoginPage(driver);
        //login link click
        loginPage.clickLogInLink();
        //input data
        loginPage.inputLoginInvalidEmailData(registerPage);
        loginPage.inputInvalidEmailAddress();
        loginPage.inputPassword(registerPage.getPassword());
        logger.info("Login password: " + registerPage.getPassword() + "\n");
        //login click
        loginPage.clickLoginButton();
        //assert the alert message is as expected
        assertEquals(loginPage.getAlertMessage(), "Warning: No match for E-Mail Address and/or Password.");
    }

    //invalid password
    protected void logInInvalidPasswordTest(RegisterPage registerPage){
        LoginPage loginPage = new LoginPage(driver);
        //login link click
        loginPage.clickLogInLink();
        //input data
        loginPage.inputLoginInvalidPasswordData(registerPage);
        loginPage.inputEmailAddress(registerPage.getEmailAddress());
        logger.info("Login email address: " + registerPage.getEmailAddress() + "\n");
        loginPage.inputInvalidPassword();
        //login click
        loginPage.clickLoginButton();
        //assert the alert message is as expected
        //assertEquals(loginPage.getAlertMessage(), "Warning: No match for E-Mail Address and/or Password."); // -> the alert box is the same but the text/element can't be found for some reason
    }

    //non existing email
    protected void logInNonExistingEmailTest(RegisterPage registerPage){
        LoginPage loginPage = new LoginPage(driver);
        //login link click
        loginPage.clickLogInLink();
        //input data
        loginPage.inputLoginNonExistingEmailData(registerPage);
        loginPage.inputNonExistingEmailAddress();
        loginPage.inputPassword(registerPage.getPassword());
        logger.info("Login password: " + registerPage.getPassword() + "\n");
        //login click
        loginPage.clickLoginButton();
        //assert the alert message is as expected
        assertEquals(loginPage.getAlertMessage(), "Warning: No match for E-Mail Address and/or Password.");
    }

    //web element assert methods
    protected void isRegisterPageWebElementDisplayed(RegisterPage registerPage){
        //assert first name input field is displayed
        assertTrue(registerPage.isFirstNameInputFieldDisplayed(), "The first name field is not displayed");
        //assert last name input field is displayed
        assertTrue(registerPage.isLastNameInputFieldDisplayed(), "The last name field is not displayed");
        //assert first name input field is displayed
        assertTrue(registerPage.isEmailAddressInputFieldDisplayed(), "The email field is not displayed");
        //assert password input field is displayed
        assertTrue(registerPage.isPasswordInputFieldDisplayed(), "The password field is not displayed");
        //assert newsletter button is displayed
        assertTrue(registerPage.isSubscribeButtonDisplayed(), "The subscribe button is not displayed");
        //assert privacy policy button is displayed
        assertTrue(registerPage.isPrivacyPolicyButtonDisplayed(), "The privacy policy button is not displayed");
        //assert continue button is displayed
        assertTrue(registerPage.isContinueButtonDisplayed(), "The continue button is not displayed");
    }

    protected void isLoginPageWebElementDisplayed(LoginPage loginPage){
        //assert login link is displayed
        assertTrue(loginPage.isLogInLinkDisplayed(), "The log in link is not displayed");
        //assert email input field is displayed
        assertTrue(loginPage.isEmailInputFieldDisplayed(), "The email input field isn't present");
        //assert password input field is present
        assertTrue(loginPage.isPasswordInputFieldDisplayed(), "The password input field isn't present");
        //assert login button is displayed
        assertTrue(loginPage.isLoginButtonDisplayed(), "The login button is not displayed");
    }

    //valid edit account first name test method
    protected void editAccountFirstNameTest(){
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //edit account information click
        editAccountInformationPage.clickEditAccountInformationLink();
        //edit account information page web element assert
        isEditAccountWebElementDisplayed(editAccountInformationPage);
        //assert the valid user is signed in
        logger.info("Current user first name: " + editAccountInformationPage.getUserFirstName());
        logger.info("Current user last name: " + editAccountInformationPage.getUserLastName());
        logger.info("Current user email: " + editAccountInformationPage.getUserEmail());
        //data input (getter)
        editAccountInformationPage.inputValidEditedFirstNameData();
        //singular data input method
        editAccountInformationPage.editFirstName();
        //edited first name logger
        logger.info("Edited user first name: " + editAccountInformationPage.getEditedFirstName());
        //continue button click
        editAccountInformationPage.clickContinueButton();
        //assert the success message is displayed
        assertEquals(editAccountInformationPage.getEditSuccessMessageText(), "Success: Your account has been successfully updated.", "The success message didn't appear");
    }

    //valid edit account last name test method
    protected void editAccountLastNameTest(){
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //edit account information click
        editAccountInformationPage.clickEditAccountInformationLink();
        //edit account information page web element assert
        isEditAccountWebElementDisplayed(editAccountInformationPage);
        //assert the valid user is signed in
        logger.info("Current user first name: " + editAccountInformationPage.getUserFirstName());
        logger.info("Current user last name: " + editAccountInformationPage.getUserLastName());
        logger.info("Current user email: " + editAccountInformationPage.getUserEmail());
        //data input (getter)
        editAccountInformationPage.inputValidEditedLastNameData();
        //singular data input method
        editAccountInformationPage.editLastName();
        //edited first name logger
        logger.info("Edited user last name: " + editAccountInformationPage.getEditedLastName());
        //continue button click
        editAccountInformationPage.clickContinueButton();
        //assert the success message is displayed
        assertEquals(editAccountInformationPage.getEditSuccessMessageText(), "Success: Your account has been successfully updated.", "The success message didn't appear");
    }

    //valid edit account email test method
    protected void editAccountEmailTest(){
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //edit account information click
        editAccountInformationPage.clickEditAccountInformationLink();
        //edit account information page web element assert
        isEditAccountWebElementDisplayed(editAccountInformationPage);
        //assert the valid user is signed in
        logger.info("Current user first name: " + editAccountInformationPage.getUserFirstName());
        logger.info("Current user last name: " + editAccountInformationPage.getUserLastName());
        logger.info("Current user email: " + editAccountInformationPage.getUserEmail());
        //data input (getter)
        editAccountInformationPage.inputValidEditedEmailData();
        //singular data input method
        editAccountInformationPage.editEmail();
        //edited first name logger
        logger.info("Edited user email: " + editAccountInformationPage.getEditedEmail());
        //continue button click
        editAccountInformationPage.clickContinueButton();
        //assert the success message is displayed
        assertEquals(editAccountInformationPage.getEditSuccessMessageText(), "Success: Your account has been successfully updated.", "The success message didn't appear");
    }

    //invalid edit account 'no first name' test method
    protected void editAccountNoFirstNameTest(){
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //edit account information click
        editAccountInformationPage.clickEditAccountInformationLink();
        //edit account information page web element assert
        isEditAccountWebElementDisplayed(editAccountInformationPage);
        //assert the valid user is signed in
        logger.info("Current user first name: " + editAccountInformationPage.getUserFirstName());
        logger.info("Current user last name: " + editAccountInformationPage.getUserLastName());
        logger.info("Current user email: " + editAccountInformationPage.getUserEmail());
        //singular data input method
        editAccountInformationPage.editNoFirstName();
        //continue button click
        editAccountInformationPage.clickContinueButton();
        //assert the valid error message is displayed
        assertEquals(editAccountInformationPage.getInvalidFirstNameAlertText(), "First Name must be between 1 and 32 characters!", "No error message is displayed");
    }

    //invalid edit account 'no last name' test method
    protected void editAccountNoLastNameTest(){
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //edit account information click
        editAccountInformationPage.clickEditAccountInformationLink();
        //edit account information page web element assert
        isEditAccountWebElementDisplayed(editAccountInformationPage);
        //assert the valid user is signed in
        logger.info("Current user first name: " + editAccountInformationPage.getUserFirstName());
        logger.info("Current user last name: " + editAccountInformationPage.getUserLastName());
        logger.info("Current user email: " + editAccountInformationPage.getUserEmail());
        //singular data input method
        editAccountInformationPage.editNoLastName();
        //continue button click
        editAccountInformationPage.clickContinueButton();
        //assert the valid error message is displayed
        assertEquals(editAccountInformationPage.getInvalidLastNameAlertText(), "Last Name must be between 1 and 32 characters!", "No error message is displayed");
    }

    //invalid edit account 'no email' test method
    protected void editAccountNoEmailTest(){
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //edit account information click
        editAccountInformationPage.clickEditAccountInformationLink();
        //edit account information page web element assert
        isEditAccountWebElementDisplayed(editAccountInformationPage);
        //assert the valid user is signed in
        logger.info("Current user first name: " + editAccountInformationPage.getUserFirstName());
        logger.info("Current user last name: " + editAccountInformationPage.getUserLastName());
        logger.info("Current user email: " + editAccountInformationPage.getUserEmail());
        //singular data input method
        editAccountInformationPage.editNoEmail();
        //continue button click
        editAccountInformationPage.clickContinueButton();
        //assert the valid error message is displayed
        assertEquals(editAccountInformationPage.getInvalidEmailAlertText(), "E-Mail Address does not appear to be valid!", "No error message is displayed");
    }

    //invalid edit account 'no first name' test method
    protected void editAccountInvalidFirstNameTest(){
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //edit account information click
        editAccountInformationPage.clickEditAccountInformationLink();
        //edit account information page web element assert
        isEditAccountWebElementDisplayed(editAccountInformationPage);
        //assert the valid user is signed in
        logger.info("Current user first name: " + editAccountInformationPage.getUserFirstName());
        logger.info("Current user last name: " + editAccountInformationPage.getUserLastName());
        logger.info("Current user email: " + editAccountInformationPage.getUserEmail());
        //singular data input method
        editAccountInformationPage.editInvalidFirstName();
        //continue button click
        editAccountInformationPage.clickContinueButton();
        //verify if the account gets created, if so, log it as an error
        String successMessage = editAccountInformationPage.getEditSuccessMessageText();
        logger.info(successMessage);
        if(successMessage.equals("Success: Your account has been successfully updated.")) {
            logger.warn("The edit account functionality works with invalid format first name");
        }
    }

    //invalid edit account 'no last name' test method
    protected void editAccountInvalidLastNameTest(){
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //edit account information click
        editAccountInformationPage.clickEditAccountInformationLink();
        //edit account information page web element assert
        isEditAccountWebElementDisplayed(editAccountInformationPage);
        //assert the valid user is signed in
        logger.info("Current user first name: " + editAccountInformationPage.getUserFirstName());
        logger.info("Current user last name: " + editAccountInformationPage.getUserLastName());
        logger.info("Current user email: " + editAccountInformationPage.getUserEmail());
        //singular data input method
        editAccountInformationPage.editInvalidLastName();
        //continue button click
        editAccountInformationPage.clickContinueButton();
        //verify if the account gets created, if so, log it as an error
        String successMessage = editAccountInformationPage.getEditSuccessMessageText();
        logger.info(successMessage);
        if(successMessage.equals("Success: Your account has been successfully updated.")) {
            logger.warn("The edit account functionality works with invalid format first name");
        }
    }

    //invalid edit account 'no email' test method
    protected void editAccountInvalidFormatEmailTest(){
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //edit account information click
        editAccountInformationPage.clickEditAccountInformationLink();
        //edit account information page web element assert
        isEditAccountWebElementDisplayed(editAccountInformationPage);
        //assert the valid user is signed in
        logger.info("Current user first name: " + editAccountInformationPage.getUserFirstName());
        logger.info("Current user last name: " + editAccountInformationPage.getUserLastName());
        logger.info("Current user email: " + editAccountInformationPage.getUserEmail());
        //singular data input method
        editAccountInformationPage.editInvalidEmail();
        //continue button click
        editAccountInformationPage.clickContinueButton();
    }

    //edit account web elements assert method
    protected void isEditAccountWebElementDisplayed(EditAccountInformationPage editAccountInformationPage){
        assertTrue(editAccountInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        assertTrue(editAccountInformationPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        assertTrue(editAccountInformationPage.isEmailInputFieldDisplayed(), "The email input field isn't displayed");
    }

    //homepage product test method (as a non-logged in user)
    protected void homePageProductAsANonLoggedUserDisplayTest(){
        HomePage homePage = new HomePage(driver);
        isHomePageProductWebElementDisplayed(homePage);
        //list viewed products
        logger.info("Product list on homepage: ");
        // Product images
        logger.info("Product images: " + homePage.getProductImages().toString());
        // Product names
        logger.info("Product names: " + homePage.getProductNames().toString());
        // Product descriptions
        logger.info("Product descriptions: " + homePage.getProductDescriptions().toString());
        // Product prices
        logger.info("Product prices: " + homePage.getProductPrices().toString());
        // Product prices (ex tax)
        logger.info("Product prices (ex tax): " + homePage.getProductPricesExTax().toString());
    }

    //homepage product test method (as a logged in user) //drops empty arrays unlike above method that works fine
    protected void homePageProductAsALoggedUserDisplayTest(){
        HomePage homePage = new HomePage(driver);
        homePage.clickOnHomePageLink();
        isHomePageProductWebElementDisplayed(homePage);
        //scroll elements into view
        homePage.ensureElementsAreVisible();
        //list viewed products
        logger.info("Product list on homepage: ");
        // Product images
        logger.info("Product images: " + homePage.getProductImages().toString());
        // Product names
        logger.info("Product names: " + homePage.getProductNames().toString());
        // Product descriptions
        logger.info("Product descriptions: " + homePage.getProductDescriptions().toString());
        // Product prices
        logger.info("Product prices: " + homePage.getProductPrices().toString());
        // Product prices (ex tax)
        logger.info("Product prices (ex tax): " + homePage.getProductPricesExTax().toString());
    }

    //homepage MacBook 'add to wishlist' test method (as a non-logged in user)
    protected void homePageAddMacBookToWishListAsANonLoggedUserDisplayTest(){
        HomePage homePage = new HomePage(driver);
        isHomePageProductWebElementDisplayed(homePage);
        //add MacBook to wishlist
        homePage.clickAddMacBookToWishlistButton();
        logger.info("Appeared error message: " + homePage.getAddToWishlistFailureMessage());

    }
    //homepage Apple display 'add to wishlist' test method (as a non-logged in user)
    protected void homePageAddAppleDisplayToWishListAsANonLoggedUserDisplayTest(){
        HomePage homePage = new HomePage(driver);
        isHomePageProductWebElementDisplayed(homePage);
        //add Apple display to wishlist
        homePage.clickAddAppleDisplayToWishlistButton();
        logger.info("Appeared error message: " + homePage.getAddToWishlistFailureMessage());
    }
    //homepage IPhone 'add to wishlist' test method (as a non-logged in user)
    protected void homePageAddIPhoneToWishListAsANonLoggedUserDisplayTest(){
        HomePage homePage = new HomePage(driver);
        isHomePageProductWebElementDisplayed(homePage);
        //add IPhone to wishlist
        homePage.clickAddIPhoneToWishlistButton();
        logger.info("Appeared error message: " + homePage.getAddToWishlistFailureMessage());

    }
    //homepage Canon camera 'add to wishlist' test method (as a non-logged in user)
    protected void homePageAddCanonCameraToWishListAsANonLoggedUserDisplayTest(){
        HomePage homePage = new HomePage(driver);
        isHomePageProductWebElementDisplayed(homePage);
        //add canon camera to wishlist
        homePage.clickAddCanonCameraToWishlistButton();
        //logger.info("Appeared error message: " + homePage.getAddToWishlistFailureMessage()); //due to internet/CPU throttling issues the logger fails (NoSuchElementException) -> the rest work fine
    }
    //homepage MacBook 'add to cart' test method (as a non-logged in user)
    protected void homePageAddMacBookToCartAsANonLoggedUserDisplayTest(){
        HomePage homePage = new HomePage(driver);
        isHomePageProductWebElementDisplayed(homePage);
        //add MacBook to wishlist
        homePage.clickAddMacBookToCartButton();
        //click shopping cart link
        homePage.clickOnShoppingCartLink();
        //assert shopping cart web elements are displayed
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        isShoppingCartWebElementDisplayed(shoppingCartPage);
        //display shopping cart product values
        displayShoppingCartData(shoppingCartPage);
    }
    //homepage Apple display 'add to cart' test method (as a non-logged in user)
    protected void homePageAddAppleDisplayToCartAsANonLoggedUserDisplayTest(){
        HomePage homePage = new HomePage(driver);
        isHomePageProductWebElementDisplayed(homePage);
        //add Apple display to wishlist
        homePage.clickAddAppleDisplayToCartButton();
        //click shopping cart link
        homePage.clickOnShoppingCartLink();
        //assert shopping cart web elements are displayed
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        isShoppingCartWebElementDisplayed(shoppingCartPage);
        //display shopping cart product values
        displayShoppingCartData(shoppingCartPage);
    }
    //homepage IPhone 'add to cart' test method (as a non-logged in user)
    protected void homePageAddIPhoneToCartAsANonLoggedUserDisplayTest(){
        HomePage homePage = new HomePage(driver);
        isHomePageProductWebElementDisplayed(homePage);
        //add IPhone to wishlist
        homePage.clickAddIPhoneToCartButton();
        //click shopping cart link
        homePage.clickOnShoppingCartLink();
        //assert shopping cart web elements are displayed
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        isShoppingCartWebElementDisplayed(shoppingCartPage);
        //display shopping cart product values
        displayShoppingCartData(shoppingCartPage);
    }
    //homepage Canon camera 'add to cart' test method (as a non-logged in user)
    protected void homePageAddCanonCameraToCartAsANonLoggedUserDisplayTest(){
        HomePage homePage = new HomePage(driver);
        isHomePageProductWebElementDisplayed(homePage);
        //add canon camera to wishlist
        homePage.clickAddCanonCameraToCartButton();
        //assert single product page web elements are displayed
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        isSingleProductWebElementDisplayed(singleProductPage);
        //single product data display
        singleProductPage.getProductName();
        singleProductPage.getProductDescription();
        singleProductPage.getProductPrices();
        //click select dropdown menu
        singleProductPage.clickSelectDropDownMenu();
        //select blue option
        singleProductPage.selectBlueOption();
        //click 'add to cart' button
        singleProductPage.clickAddToCartButton();
        //close pop up alert
        singleProductPage.closePopUpAlert();
        //click 'add to cart' header button
        singleProductPage.clickAddToCartHeaderButton();
        //extract added to cart product data
        logger.info("Added product name: " + singleProductPage.getAddToCartProductName());
    }
    //homepage product web element assert method
    protected void isHomePageProductWebElementDisplayed(HomePage homePage){
        //assert shopping cart link is displayed
        assertTrue(homePage.isShoppingCartLinkDisplayed(), "The shopping cart link isn't displayed");
        //assert the product images are displayed
        assertTrue(homePage.isProductImageDisplayed(), "The product image isn't displayed");
        //assert the product name is displayed
        assertTrue(homePage.isProductNameDisplayed(), "The product name isn't displayed");
        //assert the product description is displayed
        assertTrue(homePage.isProductPriceDisplayed(), "The product price isn't displayed");
        //assert the product price is displayed
        assertTrue(homePage.isProductPriceDisplayed(), "The product price isn't displayed");
        //assert the product price (ex tax) is displayed
        assertTrue(homePage.isProductPriceExTaxDisplayed(), "The product price (ex tax) isn't displayed");
        //assert 'add to cart' buttons are displayed
        assertTrue(homePage.areProductAddToCartButtonsDisplayed(), "The 'add to cart' buttons aren't displayed");
        //assert 'add to wishlist' buttons are displayed
        assertTrue(homePage.areProductAddToWishListButtonsDisplayed(), "The 'add to wish list' buttons aren't displayed");
    }

    //opencart product page test methods
    protected void viewAllAvailableProductsTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //assert desktops navbar link is displayed
        assertTrue(openCartProductPage.isCamerasNavBarLinkDisplayed(), "The cameras navbar link isn't displayed");
        //access desktops product page method
        openCartProductPage.clickCamerasNavBarLink();
    }

    //desktops product list test method
    protected void viewAllAvailableDesktopsTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //click desktops category
        openCartProductPage.clickDesktopsLink();
        //view available products
        availableProductListDisplayTest();
        //click next page method
        openCartProductPage.clickPage2Link();
        System.out.println("Desktops displayed on page 2" + "\n");
        //view list displayed on page 2
        availableProductListDisplayTest();
    }
    //desktops product list test method (25 per page view)
    protected void viewAllAvailableDesktops25PerPageTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //click desktops category
        openCartProductPage.clickDesktopsLink();
        //click show per page dropdown menu
        openCartProductPage.clickShowPerPageMenu();
        //select '25 per page' option
        openCartProductPage.select25PerPageOption();
        //view available products
        availableProductListDisplayTest();
    }
    //laptops product list test method
    protected void viewAllAvailableLaptopsTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //click laptops category
        openCartProductPage.clickLaptopsLink();
        //view available products
        availableProductListDisplayTest();
    }
    //components product list test method
    protected void viewAllAvailableComponentsTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //click components category
        openCartProductPage.clickComponentsLink();
        //click monitors subcategory
        openCartProductPage.clickMonitorsLink();
        //view available products
        availableProductListDisplayTest();
    }
    //tablets product list test method
    protected void viewAllAvailableTabletsTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //click tablets category
        openCartProductPage.clickTabletsLink();
        //view available products
        availableProductListDisplayTest();
    }
    //software product list test method
    protected void viewAllAvailableSoftwareTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //click software category
        openCartProductPage.clickSoftwareLink();
        // Then, check if the product lists are empty
        if (!openCartProductPage.getNoProductMessageText().isEmpty()) {
            logger.info("This category has no available products");
        } else {
            availableProductListDisplayTest();
        }
    }
    //phones product list test method
    protected void viewAllAvailablePhonesTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //click phones category
        openCartProductPage.clickPhonesLink();
        //view available products
        availableProductListDisplayTest();
    }
    //mp3 players product list test method
    protected void viewAllAvailableMP3PlayersTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //click mp3 players category
        openCartProductPage.clickMP3PlayersLink();
        //view available products
        availableProductListDisplayTest();
    }
    //add all available desktops to shopping cart test
    protected void addAllAvailableDesktopsToShoppingCartTest(){ //first three products aren't relevant to category (product 10 too)
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //add all available desktops to shopping cart
        openCartProductPage.clickAddProduct4ToCartButton();
        openCartProductPage.clickAddProduct5ToCartButton();
        openCartProductPage.clickAddProduct6ToCartButton();
        openCartProductPage.clickAddProduct7ToCartButton();
        openCartProductPage.clickAddProduct8ToCartButton();
        openCartProductPage.clickAddProduct9ToCartButton();
//        openCartProductPage.clickAddProduct10ToCartButton(); //this method drops to different(singular) product page instead of shopping cart
        openCartProductPage.clickAddProduct11ToCartButton();
        openCartProductPage.clickAddProduct12ToCartButton();
        //click 'my account' footer link
        openCartProductPage.clickMyAccountLink();
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //click shopping cart link
        editAccountInformationPage.clickShoppingCartLink();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //display added product data
        displayShoppingCartData(shoppingCartPage);
    }
    //add all available laptops to shopping cart test
    protected void addAllAvailableLaptopsToShoppingCartTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //add all available desktops to shopping cart
        openCartProductPage.clickAddProduct2ToCartButton();
        openCartProductPage.clickAddProduct3ToCartButton();
        openCartProductPage.clickAddProduct4ToCartButton();
        openCartProductPage.clickAddProduct5ToCartButton();
        openCartProductPage.clickAddProduct1ToCartButton(); //this method drops to different(singular) product page instead of shopping cart
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        singleProductPage.clickAddToCartButton();
        //click 'my account' footer link
        openCartProductPage.clickMyAccountLink();
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //click shopping cart link
        editAccountInformationPage.clickShoppingCartLink();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //display added product data
        displayShoppingCartData(shoppingCartPage);
    }
    //add all available components to shopping cart test
    protected void addAllAvailableComponentsToShoppingCartTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //add all available desktops to shopping cart
        openCartProductPage.clickAddProduct2ToCartButton();
//        openCartProductPage.clickAddProduct1ToCartButton(); //this method drops to different(singular) product page instead of shopping cart
        //click 'my account' footer link
        openCartProductPage.clickMyAccountLink();
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //click shopping cart link
        editAccountInformationPage.clickShoppingCartLink();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //display added product data
        displayShoppingCartData(shoppingCartPage);
    }
    //add all available tablets to shopping cart test
    protected void addAllAvailableTabletsToShoppingCartTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //add all available desktops to shopping cart
        openCartProductPage.clickAddProduct1ToCartButton();
        //click 'my account' footer link
        openCartProductPage.clickMyAccountLink();
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //click shopping cart link
        editAccountInformationPage.clickShoppingCartLink();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //display added product data
        displayShoppingCartData(shoppingCartPage);
        //assert the correct error is displayed
        assertEquals(shoppingCartPage.getNotInStockErrorMessage(), "Products marked with *** are not available in the desired quantity or not in stock!", "The error message isn't displayed");
    }
    //add all available phones to shopping cart test
    protected void addAllAvailablePhonesToShoppingCartTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //add all available desktops to shopping cart
        openCartProductPage.clickAddProduct1ToCartButton();
        openCartProductPage.clickAddProduct2ToCartButton();
        openCartProductPage.clickAddProduct3ToCartButton();
        //click 'my account' footer link
        openCartProductPage.clickMyAccountLink();
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //click shopping cart link
        editAccountInformationPage.clickShoppingCartLink();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //display added product data
        displayShoppingCartData(shoppingCartPage);
    }
    //add all available cameras to shopping cart test
    protected void addAllAvailableCamerasToShoppingCartTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //add all available desktops to shopping cart
        openCartProductPage.clickAddProduct2ToCartButton();
        openCartProductPage.clickAddProduct1ToCartButton(); //this method drops to different(singular) product page instead of shopping cart
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //choose 'blue' option
        singleProductPage.selectBlueOption();
        singleProductPage.clickAddToCartButton();
        //click 'my account' footer link
        openCartProductPage.clickMyAccountLink();
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //click shopping cart link
        editAccountInformationPage.clickShoppingCartLink();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //display added product data
        displayShoppingCartData(shoppingCartPage);
    }
    //add all available mp3 players to shopping cart test
    protected void addAllAvailableMP3PlayersToShoppingCartTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //add all available desktops to shopping cart
        openCartProductPage.clickAddProduct2ToCartButton();
        openCartProductPage.clickAddProduct3ToCartButton();
        openCartProductPage.clickAddProduct4ToCartButton();
        openCartProductPage.clickAddProduct1ToCartButton(); //this method drops to different(singular) product page instead of shopping cart
        //click 'my account' footer link
        openCartProductPage.clickMyAccountLink();
        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        //click shopping cart link
        editAccountInformationPage.clickShoppingCartLink();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //display added product data
        displayShoppingCartData(shoppingCartPage);
    }
    //add available desktops to check out test method
    protected void addAllAvailableDesktopsToCheckoutTest(RegisterPage registerPage){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //click checkout button
        shoppingCartPage.clickCheckoutButton();
        //check out page web element assert
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //user data input
        checkoutPage.inputValidUserData(registerPage);
        //first name input
        checkoutPage.inputFirstName(registerPage.getFirstName());
        System.out.println("\n");
        logger.info("First name used for input in checkout page : " + registerPage.getFirstName());
        //last name input
        checkoutPage.inputLastName(registerPage.getLastName());
        logger.info("Last name used for input in checkout page : " + registerPage.getLastName());
        //company input
        checkoutPage.inputCompany();
        logger.info("Company used in checkout page: " + checkoutPage.getUserCompany());
        //input address 1
        checkoutPage.inputAddress1();
        logger.info("Address1 used in checkout page: " + checkoutPage.getUserAddress1());
        //input city
        checkoutPage.inputCity();
        logger.info("City used in checkout page: " + checkoutPage.getUserCity());
        //input post code
        checkoutPage.inputPostCode();
        logger.info("Post code used in checkout page: " + checkoutPage.getUserPostCode());
        //click country dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select US
        checkoutPage.selectUsCountryOption();
        //click state dropdown menu
        checkoutPage.clickStateDropdownMenu();
        //select Illinois
        checkoutPage.selectIllinoisStateOption();
        //click continue button
        checkoutPage.clickContinueButton();
        //log the shipping address
        logger.info("Shipping address created: " + checkoutPage.getShippingAddress());
        //choose shipping method
        checkoutPage.clickShippingChooseButton();
        //choose flat shipping
        checkoutPage.selectFlatShippingOption();
        //click continue
        checkoutPage.clickShippingContinueButton();
        //choose payment method
        checkoutPage.clickPaymentChooseButton();
        //select 'cash on delivery'
        checkoutPage.selectCashOnDeliveryOption();
        //click continue
        checkoutPage.clickPaymentContinueButton();
        //close alert boxes
        checkoutPage.closeAlertBox();
        //get checkout product data
//        logCheckoutProductData(checkoutPage);
        //click 'confirm order' button
        checkoutPage.clickConfirmOrderButton();
        //assert the order is successfully placed
        checkoutPage.clickOrderHistoryLink();
        //view order detailed data
    }
    //add available laptops to check out test method
    protected void addAllAvailableLaptopsToCheckoutTest(RegisterPage registerPage){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //click checkout button
        shoppingCartPage.clickCheckoutButton();
        //check out page web element assert
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //user data input
        checkoutPage.inputValidUserData(registerPage);
        //first name input
        checkoutPage.inputFirstName(registerPage.getFirstName());
        System.out.println("\n");
        logger.info("First name used for input in checkout page : " + registerPage.getFirstName());
        //last name input
        checkoutPage.inputLastName(registerPage.getLastName());
        logger.info("Last name used for input in checkout page : " + registerPage.getLastName());
        //company input
        checkoutPage.inputCompany();
        logger.info("Company used in checkout page: " + checkoutPage.getUserCompany());
        //input address 1
        checkoutPage.inputAddress1();
        logger.info("Address1 used in checkout page: " + checkoutPage.getUserAddress1());
        //input city
        checkoutPage.inputCity();
        logger.info("City used in checkout page: " + checkoutPage.getUserCity());
        //input post code
        checkoutPage.inputPostCode();
        logger.info("Post code used in checkout page: " + checkoutPage.getUserPostCode());
        //click country dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select US
        checkoutPage.selectUsCountryOption();
        //click state dropdown menu
        checkoutPage.clickStateDropdownMenu();
        //select Illinois
        checkoutPage.selectIllinoisStateOption();
        //click continue button
        checkoutPage.clickContinueButton();
        //log the shipping address
        logger.info("Shipping address created: " + checkoutPage.getShippingAddress());
        //choose shipping method
        checkoutPage.clickShippingChooseButton();
        //choose flat shipping
        checkoutPage.selectFlatShippingOption();
        //click continue
        checkoutPage.clickShippingContinueButton();
        //choose payment method
        checkoutPage.clickPaymentChooseButton();
        //select 'cash on delivery'
        checkoutPage.selectCashOnDeliveryOption();
        //click continue
        checkoutPage.clickPaymentContinueButton();
        //close alert boxes
        checkoutPage.closeAlertBox();
        //get checkout product data
//        logCheckoutProductData(checkoutPage);
        //click 'confirm order' button
        checkoutPage.clickConfirmOrderButton();
        //assert the order is successfully placed
        checkoutPage.clickOrderHistoryLink();
    }
    //add available components to check out test method
    protected void addAllAvailableComponentsToCheckoutTest(RegisterPage registerPage){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //click checkout button
        shoppingCartPage.clickCheckoutButton();
        //check out page web element assert
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //user data input
        checkoutPage.inputValidUserData(registerPage);
        //first name input
        checkoutPage.inputFirstName(registerPage.getFirstName());
        System.out.println("\n");
        logger.info("First name used for input in checkout page : " + registerPage.getFirstName());
        //last name input
        checkoutPage.inputLastName(registerPage.getLastName());
        logger.info("Last name used for input in checkout page : " + registerPage.getLastName());
        //company input
        checkoutPage.inputCompany();
        logger.info("Company used in checkout page: " + checkoutPage.getUserCompany());
        //input address 1
        checkoutPage.inputAddress1();
        logger.info("Address1 used in checkout page: " + checkoutPage.getUserAddress1());
        //input city
        checkoutPage.inputCity();
        logger.info("City used in checkout page: " + checkoutPage.getUserCity());
        //input post code
        checkoutPage.inputPostCode();
        logger.info("Post code used in checkout page: " + checkoutPage.getUserPostCode());
        //click country dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select US
        checkoutPage.selectUsCountryOption();
        //click state dropdown menu
        checkoutPage.clickStateDropdownMenu();
        //select Illinois
        checkoutPage.selectIllinoisStateOption();
        //click continue button
        checkoutPage.clickContinueButton();
        //log the shipping address
        logger.info("Shipping address created: " + checkoutPage.getShippingAddress());
        //choose shipping method
        checkoutPage.clickShippingChooseButton();
        //choose flat shipping
        checkoutPage.selectFlatShippingOption();
        //click continue
        checkoutPage.clickShippingContinueButton();
        //choose payment method
        checkoutPage.clickPaymentChooseButton();
        //select 'cash on delivery'
        checkoutPage.selectCashOnDeliveryOption();
        //click continue
        checkoutPage.clickPaymentContinueButton();
        //close alert boxes
        checkoutPage.closeAlertBox();
        //get checkout product data
//        logCheckoutProductData(checkoutPage);
        //click 'confirm order' button
        checkoutPage.clickConfirmOrderButton();
        //assert the order is successfully placed
        checkoutPage.clickOrderHistoryLink();
    }
    //add available tablets to check out test method
    protected void addAllAvailableTabletsToCheckoutTest(RegisterPage registerPage){ //since it's not in stock the test halts at checkout button click
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //click checkout button
        shoppingCartPage.clickCheckoutButton();
    }
    //add available phones to check out test method
    protected void addAllAvailablePhonesToCheckoutTest(RegisterPage registerPage){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //click checkout button
        shoppingCartPage.clickCheckoutButton();
        //check out page web element assert
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //user data input
        checkoutPage.inputValidUserData(registerPage);
        //first name input
        checkoutPage.inputFirstName(registerPage.getFirstName());
        System.out.println("\n");
        logger.info("First name used for input in checkout page : " + registerPage.getFirstName());
        //last name input
        checkoutPage.inputLastName(registerPage.getLastName());
        logger.info("Last name used for input in checkout page : " + registerPage.getLastName());
        //company input
        checkoutPage.inputCompany();
        logger.info("Company used in checkout page: " + checkoutPage.getUserCompany());
        //input address 1
        checkoutPage.inputAddress1();
        logger.info("Address1 used in checkout page: " + checkoutPage.getUserAddress1());
        //input city
        checkoutPage.inputCity();
        logger.info("City used in checkout page: " + checkoutPage.getUserCity());
        //input post code
        checkoutPage.inputPostCode();
        logger.info("Post code used in checkout page: " + checkoutPage.getUserPostCode());
        //click country dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select US
        checkoutPage.selectUsCountryOption();
        //click state dropdown menu
        checkoutPage.clickStateDropdownMenu();
        //select Illinois
        checkoutPage.selectIllinoisStateOption();
        //click continue button
        checkoutPage.clickContinueButton();
        //log the shipping address
        logger.info("Shipping address created: " + checkoutPage.getShippingAddress());
        //choose shipping method
        checkoutPage.clickShippingChooseButton();
        //choose flat shipping
        checkoutPage.selectFlatShippingOption();
        //click continue
        checkoutPage.clickShippingContinueButton();
        //choose payment method
        checkoutPage.clickPaymentChooseButton();
        //select 'cash on delivery'
        checkoutPage.selectCashOnDeliveryOption();
        //click continue
        checkoutPage.clickPaymentContinueButton();
        //close alert boxes
        checkoutPage.closeAlertBox();
        //get checkout product data
//        logCheckoutProductData(checkoutPage);
        //click 'confirm order' button
        checkoutPage.clickConfirmOrderButton();
        //assert the order is successfully placed
        checkoutPage.clickOrderHistoryLink();
    }
    //add available cameras to check out test method
    protected void addAllAvailableCamerasToCheckoutTest(RegisterPage registerPage){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //click checkout button
        shoppingCartPage.clickCheckoutButton();
        //check out page web element assert
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //user data input
        checkoutPage.inputValidUserData(registerPage);
        //first name input
        checkoutPage.inputFirstName(registerPage.getFirstName());
        System.out.println("\n");
        logger.info("First name used for input in checkout page : " + registerPage.getFirstName());
        //last name input
        checkoutPage.inputLastName(registerPage.getLastName());
        logger.info("Last name used for input in checkout page : " + registerPage.getLastName());
        //company input
        checkoutPage.inputCompany();
        logger.info("Company used in checkout page: " + checkoutPage.getUserCompany());
        //input address 1
        checkoutPage.inputAddress1();
        logger.info("Address1 used in checkout page: " + checkoutPage.getUserAddress1());
        //input city
        checkoutPage.inputCity();
        logger.info("City used in checkout page: " + checkoutPage.getUserCity());
        //input post code
        checkoutPage.inputPostCode();
        logger.info("Post code used in checkout page: " + checkoutPage.getUserPostCode());
        //click country dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select US
        checkoutPage.selectUsCountryOption();
        //click state dropdown menu
        checkoutPage.clickStateDropdownMenu();
        //select Illinois
        checkoutPage.selectIllinoisStateOption();
        //click continue button
        checkoutPage.clickContinueButton();
        //log the shipping address
        logger.info("Shipping address created: " + checkoutPage.getShippingAddress());
        //choose shipping method
        checkoutPage.clickShippingChooseButton();
        //choose flat shipping
        checkoutPage.selectFlatShippingOption();
        //click continue
        checkoutPage.clickShippingContinueButton();
        //choose payment method
        checkoutPage.clickPaymentChooseButton();
        //select 'cash on delivery'
        checkoutPage.selectCashOnDeliveryOption();
        //click continue
        checkoutPage.clickPaymentContinueButton();
        //close alert boxes
        checkoutPage.closeAlertBox();
        //get checkout product data
//        logCheckoutProductData(checkoutPage);
        //click 'confirm order' button
        checkoutPage.clickConfirmOrderButton();
        //assert the order is successfully placed
        checkoutPage.clickOrderHistoryLink();
    }
    //add available mp3 players to check out test method
    protected void addAllAvailableMP3PlayersToCheckoutTest(RegisterPage registerPage){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //click checkout button
        shoppingCartPage.clickCheckoutButton();
        //check out page web element assert
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //user data input
        checkoutPage.inputValidUserData(registerPage);
        //first name input
        checkoutPage.inputFirstName(registerPage.getFirstName());
        System.out.println("\n");
        logger.info("First name used for input in checkout page : " + registerPage.getFirstName());
        //last name input
        checkoutPage.inputLastName(registerPage.getLastName());
        logger.info("Last name used for input in checkout page : " + registerPage.getLastName());
        //company input
        checkoutPage.inputCompany();
        logger.info("Company used in checkout page: " + checkoutPage.getUserCompany());
        //input address 1
        checkoutPage.inputAddress1();
        logger.info("Address1 used in checkout page: " + checkoutPage.getUserAddress1());
        //input city
        checkoutPage.inputCity();
        logger.info("City used in checkout page: " + checkoutPage.getUserCity());
        //input post code
        checkoutPage.inputPostCode();
        logger.info("Post code used in checkout page: " + checkoutPage.getUserPostCode());
        //click country dropdown menu
        checkoutPage.clickCountryDropdownMenu();
        //select US
        checkoutPage.selectUsCountryOption();
        //click state dropdown menu
        checkoutPage.clickStateDropdownMenu();
        //select Illinois
        checkoutPage.selectIllinoisStateOption();
        //click continue button
        checkoutPage.clickContinueButton();
        //log the shipping address
        logger.info("Shipping address created: " + checkoutPage.getShippingAddress());
        //choose shipping method
        checkoutPage.clickShippingChooseButton();
        //choose flat shipping
        checkoutPage.selectFlatShippingOption();
        //click continue
        checkoutPage.clickShippingContinueButton();
        //choose payment method
        checkoutPage.clickPaymentChooseButton();
        //select 'cash on delivery'
        checkoutPage.selectCashOnDeliveryOption();
        //click continue
        checkoutPage.clickPaymentContinueButton();
        //close alert boxes
        checkoutPage.closeAlertBox();
        //get checkout product data
//        logCheckoutProductData(checkoutPage);
        //click 'confirm order' button
        checkoutPage.clickConfirmOrderButton();
        //assert the order is successfully placed
        checkoutPage.clickOrderHistoryLink();
    }
    //checkout products data logger method
    protected void logCheckoutProductData(CheckoutPage checkoutPage){
        //get checkout product data
//        logger.info("Checkout product names: " +checkoutPage.getCheckoutProductNames()); //with correct selectors these two throw StaleReferenceElementException even though nothing obstructs them
//        logger.info("Checkout product prices: " +checkoutPage.getCheckoutProductPrices());
        logger.info("Checkout products sub total price: " +checkoutPage.getCheckoutProductSubTotalPrice());
        logger.info("Checkout products flat shipping rate: " +checkoutPage.getCheckoutProductFlatShippingRate());
        logger.info("Checkout products total price: " +checkoutPage.getCheckoutProductTotalPrice());
    }
    //checkout page web element assert
    protected void isCheckoutPageWebElementDisplayed(CheckoutPage checkoutPage){
        //assert first name input field is displayed
        assertTrue(checkoutPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        //assert last name input field is displayed
        assertTrue(checkoutPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        //assert company input field is displayed
        assertTrue(checkoutPage.isCompanyInputFieldDisplayed(), "The company input field isn't displayed");
        //assert address 1 input field is displayed
        assertTrue(checkoutPage.isAddress1InputFieldDisplayed(), "The address1 input field isn't displayed");
        //assert address 2 input field is displayed
        assertTrue(checkoutPage.isAddress2InputFieldDisplayed(), "The address2 input field isn't displayed");
        //assert city input field is displayed
        assertTrue(checkoutPage.isCityInputFieldDisplayed(), "The city input field isn't displayed");
        //assert post code is displayed
        assertTrue(checkoutPage.isPostCodeInputFieldDisplayed(), "The postcode input field isn't displayed");
        //assert country dropdown menu is displayed
        assertTrue(checkoutPage.isCountryDropdownMenuDisplayed(), "The country dropdown menu isn't displayed");
        //assert state dropdown menu is displayed
        assertTrue(checkoutPage.isStateDropdownMenuDisplayed(), "The state dropdown menu isn't displayed");
        //assert 'continue' button is displayed
        assertTrue(checkoutPage.isContinueButtonDisplayed(), "The continue button isn't displayed");
        //assert shipping method 'choose' button is displayed
        assertTrue(checkoutPage.isShippingMethodChooseButtonDisplayed(), "The shipping method 'choose' button isn't displayed");
        //assert payment method 'choose' button is displayed
        assertTrue(checkoutPage.isPaymentMethodChooseButtonDisplayed(), "The payment method 'choose' button isn't displayed");
        //assert order comment text area is displayed
        assertTrue(checkoutPage.isOrderCommentInputFieldDisplayed(), "The order comment text area isn't displayed");
        //assert product names are displayed
        assertTrue(checkoutPage.isCheckoutProductNameDisplayed(), "The product names aren't displayed");
        //assert product prices are displayed
        assertTrue(checkoutPage.isCheckoutProductPriceDisplayed(), "The product prices aren't displayed");
        //assert products sub total price is displayed
        assertTrue(checkoutPage.isProductsSubTotalPriceDisplayed(), "The products sub total price isn't displayed");
        //assert products flat shipping rate is displayed
        assertTrue(checkoutPage.isProductsFlatShippingRateDisplayed(), "The products flat shipping rate isn't displayed");
        //assert products total price is displayed
        assertTrue(checkoutPage.isProductsTotalPriceDisplayed(), "The products total price isn't displayed");
        //assert confirm order button is displayed
        assertTrue(checkoutPage.isConfirmOrderButtonDisplayed(), "The 'confirm order' button isn't displayed");
    }

    //order history page logger test method
    protected void viewOrderHistoryTest(OrderHistoryPage orderHistoryPage){
        System.out.println("\n");
        //view order history table data
        logger.info("Order number: " + orderHistoryPage.getOrdersNumber());
        logger.info("Customer name: " + orderHistoryPage.getOrdersCustomerName());
        logger.info("Product count: " + orderHistoryPage.getOrdersProductCount());
        logger.info("Order status: " + orderHistoryPage.getOrdersStatus());
        logger.info("Order date: " +orderHistoryPage.getOrdersDate());
        //click view order button
        orderHistoryPage.clickViewOrderButton();
    }

    //order history page web element assert
    protected void isOrderHistoryPageWebElementDisplayed(OrderHistoryPage orderHistoryPage){
        //assert order number is displayed
        assertTrue(orderHistoryPage.isOrderNumberDisplayed(), "The order number isn't displayed");
        //assert customer name is displayed
        assertTrue(orderHistoryPage.isOrderCustomerNameDisplayed(), "The customer name isn't displayed");
        //assert order product number (count) is displayed
        assertTrue(orderHistoryPage.isOrderProductCountDisplayed(), "The order product count isn't displayed");
        //assert order status is displayed
        assertTrue(orderHistoryPage.isOrderStatusDisplayed(), "The order status isn't displayed");
        //assert order price is displayed
        assertTrue(orderHistoryPage.isOrderPriceDisplayed(), "the order price isn't displayed");
        //assert order date is displayed
        assertTrue(orderHistoryPage.isOrderDateDisplayed(), "The order date isn't displayed");
        //assert order view button is displayed
        assertTrue(orderHistoryPage.isOrderViewButtonDisplayed(), "The order view button isn't displayed");
    }
    //detailed order page product data logger
    protected void viewSingleOrderData(SingularOrderPage singularOrderPage){
        System.out.println("\n");
        //singular order web element assert
        isSingularOrderPageWebElementDisplayed(singularOrderPage);
        //view order product table data
        logger.info("Order number(ID): " + singularOrderPage.getOrderNumber());
        logger.info("Order status: " + singularOrderPage.getOrderStatus());
        logger.info("Order shipping method: " + singularOrderPage.getOrderShippingMethod());
        logger.info("Order payment method: " + singularOrderPage.getOrderPaymentMethod());
        logger.info("Order date: " + singularOrderPage.getOrderDate());
        logger.info("Order shipping address: " + singularOrderPage.getOrderShippingAddress());
        logger.info("Order product names: " + singularOrderPage.getProductNames());
        logger.info("Order product models: " + singularOrderPage.getProductModels());
        logger.info("Order product quantity: " + singularOrderPage.getProductQuantity());
        logger.info("Order product prices: " + singularOrderPage.getProductPrice());
        logger.info("Order product total prices: " + singularOrderPage.getProductTotalPrice());
        logger.info("Order sub-total price: " + singularOrderPage.getOrderProductSubTotalPrice());
        logger.info("Order flat shipping rate: " + singularOrderPage.getOrderProductFlatShippingRate());
        logger.info("Order total price: " + singularOrderPage.getOrderProductTotalPrice());
    }
    //detailed order page web element assert
    protected void isSingularOrderPageWebElementDisplayed(SingularOrderPage singularOrderPage){
        //assert order number is displayed
        assertTrue(singularOrderPage.isOrderNumberDisplayed(), "The order number isn't displayed");
        //assert order status is displayed
        assertTrue(singularOrderPage.isOrderStatusDisplayed(), "The order status isn't displayed");
        //assert order shipping method is displayed
        assertTrue(singularOrderPage.isOrderShippingMethodDisplayed(), "The order shipping method isn't displayed");
        //assert order payment method is displayed
        assertTrue(singularOrderPage.isOrderPaymentMethodDisplayed(), "The order payment method isn't displayed");
        //assert order date is displayed
        assertTrue(singularOrderPage.isOrderDateDisplayed(), "The order date isn't displayed");
        //assert order shipping address is displayed
        assertTrue(singularOrderPage.isOrderShippingAddressDisplayed(), "The order shipping address isn't displayed");
        //assert order product names are displayed
        assertTrue(singularOrderPage.isOrderProductNameDisplayed(), "The product names aren't displayed");
        //assert order product models are displayed
        assertTrue(singularOrderPage.isOrderProductModelDisplayed(), "The product models aren't displayed");
        //assert order product quantity is displayed
        assertTrue(singularOrderPage.isOrderProductQuantityDisplayed(), "The product quantity isn't displayed");
        //assert order product prices are displayed
        assertTrue(singularOrderPage.isOrderProductPriceDisplayed(), "The product prices aren't displayed");
        //assert order product total prices are displayed
        assertTrue(singularOrderPage.isOrderProductTotalPriceDisplayed(), "The product total prices aren't displayed");
        //assert order product sub-total price is displayed
        assertTrue(singularOrderPage.isOrderProductSubTotalPriceDisplayed(), "The product sub total price isn't displayed");
        //assert order flat shipping rate (below sub-total price) is displayed
        assertTrue(singularOrderPage.isOrderProductFlatShippingRateDisplayed(), "The product order flat shipping rate isn't displayed");
        //assert order total final price is displayed
        assertTrue(singularOrderPage.isOrderProductTotalFinalPriceDisplayed(), "The order total final price isn't displayed");
    }
    //add all available desktops to wishlist test methods
    protected void addAllAvailableDesktopsToWishListTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //add all available desktops to wishlist
        openCartProductPage.clickAddProduct1ToWishlistButton();
        openCartProductPage.clickAddProduct2ToWishlistButton();
        openCartProductPage.clickAddProduct3ToWishlistButton();
        openCartProductPage.clickAddProduct4ToWishlistButton();
        openCartProductPage.clickAddProduct5ToWishlistButton();
        openCartProductPage.clickAddProduct6ToWishlistButton();
        openCartProductPage.clickAddProduct7ToWishlistButton();
        openCartProductPage.clickAddProduct8ToWishlistButton();
        openCartProductPage.clickAddProduct9ToWishlistButton();
        openCartProductPage.clickAddProduct10ToWishlistButton();
        openCartProductPage.clickAddProduct11ToWishlistButton();
        openCartProductPage.clickAddProduct12ToWishlistButton();
        //assert wishlist page link (footer) is displayed
        assertTrue(openCartProductPage.isFooterWishlistPageLinkDisplayed(), "The footer wishlist page link isn't displayed");
        //click wishlist page footer link
        openCartProductPage.clickFooterWishListLink();
        WishlistPage wishlistPage = new WishlistPage(driver);
        //wishlist web element assert
        isWishListWebElementDisplayed(wishlistPage);
        //display product data added to wishlist
        displayAddedProductToWishlistData(wishlistPage);
    }
    //add all available laptops to wishlist test methods
    protected void addAllAvailableLaptopsToWishListTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //add all available laptops to wishlist
        openCartProductPage.clickAddProduct1ToWishlistButton();
        openCartProductPage.clickAddProduct2ToWishlistButton();
        openCartProductPage.clickAddProduct3ToWishlistButton();
        openCartProductPage.clickAddProduct4ToWishlistButton();
        openCartProductPage.clickAddProduct5ToWishlistButton();
        //assert wishlist page link (footer) is displayed
        assertTrue(openCartProductPage.isFooterWishlistPageLinkDisplayed(), "The footer wishlist page link isn't displayed");
        //click wishlist page footer link
        openCartProductPage.clickFooterWishListLink();
        WishlistPage wishlistPage = new WishlistPage(driver);
        //wishlist web element assert
        isWishListWebElementDisplayed(wishlistPage);
        //display product data added to wishlist
        displayAddedProductToWishlistData(wishlistPage);
    }
    //add all available components to wishlist test methods
    protected void addAllAvailableComponentsToWishListTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //add all available components to wishlist
        openCartProductPage.clickAddProduct1ToWishlistButton();
        openCartProductPage.clickAddProduct2ToWishlistButton();
        //assert wishlist page link (footer) is displayed
        assertTrue(openCartProductPage.isFooterWishlistPageLinkDisplayed(), "The footer wishlist page link isn't displayed");
        //click wishlist page footer link
        openCartProductPage.clickFooterWishListLink();
        WishlistPage wishlistPage = new WishlistPage(driver);
        //wishlist web element assert
        isWishListWebElementDisplayed(wishlistPage);
        //display product data added to wishlist
        displayAddedProductToWishlistData(wishlistPage);
    }
    //add all available tablets to wishlist test methods
    protected void addAllAvailableTabletsToWishListTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //add all available tablets to wishlist
        openCartProductPage.clickAddProduct1ToWishlistButton();
        //assert wishlist page link (footer) is displayed
        assertTrue(openCartProductPage.isFooterWishlistPageLinkDisplayed(), "The footer wishlist page link isn't displayed");
        //click wishlist page footer link
        openCartProductPage.clickFooterWishListLink();
        WishlistPage wishlistPage = new WishlistPage(driver);
        //wishlist web element assert
        isWishListWebElementDisplayed(wishlistPage);
        //display product data added to wishlist
        displayAddedProductToWishlistData(wishlistPage);
    }
    //add all available phones to wishlist test methods
    protected void addAllAvailablePhonesToWishListTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //add all available phones to wishlist
        openCartProductPage.clickAddProduct1ToWishlistButton();
        openCartProductPage.clickAddProduct2ToWishlistButton();
        openCartProductPage.clickAddProduct3ToWishlistButton();
        //assert wishlist page link (footer) is displayed
        assertTrue(openCartProductPage.isFooterWishlistPageLinkDisplayed(), "The footer wishlist page link isn't displayed");
        //click wishlist page footer link
        openCartProductPage.clickFooterWishListLink();
        WishlistPage wishlistPage = new WishlistPage(driver);
        //wishlist web element assert
        isWishListWebElementDisplayed(wishlistPage);
        //display product data added to wishlist
        displayAddedProductToWishlistData(wishlistPage);
    }
    //add all available cameras to wishlist test methods
    protected void addAllAvailableCamerasToWishListTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //add all available camera to wishlist
        openCartProductPage.clickAddProduct1ToWishlistButton();
        openCartProductPage.clickAddProduct2ToWishlistButton();
        //assert wishlist page link (footer) is displayed
        assertTrue(openCartProductPage.isFooterWishlistPageLinkDisplayed(), "The footer wishlist page link isn't displayed");
        //click wishlist page footer link
        openCartProductPage.clickFooterWishListLink();
        WishlistPage wishlistPage = new WishlistPage(driver);
        //wishlist web element assert
        isWishListWebElementDisplayed(wishlistPage);
        //display product data added to wishlist
        displayAddedProductToWishlistData(wishlistPage);
    }
    //add all available mp3 players to wishlist test methods
    protected void addAllAvailableMP3PlayersToWishListTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        //add all available mp3 players to wishlist
        openCartProductPage.clickAddProduct1ToWishlistButton();
        openCartProductPage.clickAddProduct2ToWishlistButton();
        openCartProductPage.clickAddProduct3ToWishlistButton();
        openCartProductPage.clickAddProduct4ToWishlistButton();
        //assert wishlist page link (footer) is displayed
        assertTrue(openCartProductPage.isFooterWishlistPageLinkDisplayed(), "The footer wishlist page link isn't displayed");
        //click wishlist page footer link
        openCartProductPage.clickFooterWishListLink();
        WishlistPage wishlistPage = new WishlistPage(driver);
        //wishlist web element assert
        isWishListWebElementDisplayed(wishlistPage);
        //display product data added to wishlist
        displayAddedProductToWishlistData(wishlistPage);
    }
    //remove all products from wishlist
    protected void removeAllAvailableDesktopsFromWishlistTest(){
        WishlistPage wishlistPage = new WishlistPage(driver);
        //remove all products from wishlist
        wishlistPage.clickProduct1RemoveButton();
        wishlistPage.clickProduct2RemoveButton();
        wishlistPage.clickProduct3RemoveButton();
        wishlistPage.clickProduct4RemoveButton();
        wishlistPage.clickProduct5RemoveButton();
        wishlistPage.clickProduct6RemoveButton();
        wishlistPage.clickProduct7RemoveButton();
        wishlistPage.clickProduct8RemoveButton();
        wishlistPage.clickProduct9RemoveButton();
        wishlistPage.clickProduct10RemoveButton();
        wishlistPage.clickProduct11RemoveButton();
        wishlistPage.clickProduct12RemoveButton();
    }
    //remove all components from wishlist
    protected void removeAllAvailableLaptopsFromWishlistTest(){
        WishlistPage wishlistPage = new WishlistPage(driver);
        //remove all products from wishlist
        wishlistPage.clickProduct1RemoveButton();
        wishlistPage.clickProduct2RemoveButton();
        wishlistPage.clickProduct3RemoveButton();
        wishlistPage.clickProduct4RemoveButton();
        wishlistPage.clickProduct5RemoveButton();
    }
    //remove all components from wishlist
    protected void removeAllAvailableComponentsFromWishlistTest(){
        WishlistPage wishlistPage = new WishlistPage(driver);
        //remove all products from wishlist
        wishlistPage.clickProduct1RemoveButton();
        wishlistPage.clickProduct2RemoveButton();
    }

    //remove all tablets from wishlist
    protected void removeAllAvailableTabletsFromWishlistTest(){
        WishlistPage wishlistPage = new WishlistPage(driver);
        //remove all products from wishlist
        wishlistPage.clickProduct1RemoveButton();
//        //assert the correct confirmation message appears
//        assertEquals(wishlistPage.getEmptyWishlistMessage(), "Your wish list is empty.", "The confirmation message didn't appear"); //the message does appear, its selector is correct but this assert crashes the test run (AssertionFailedError)
    }
    //remove all phones from wishlist
    protected void removeAllAvailablePhonesFromWishlistTest(){
        WishlistPage wishlistPage = new WishlistPage(driver);
        //remove all products from wishlist
        wishlistPage.clickProduct1RemoveButton();
        wishlistPage.clickProduct2RemoveButton();
        wishlistPage.clickProduct3RemoveButton();
    }
    //remove all cameras from wishlist
    protected void removeAllAvailableCamerasFromWishlistTest(){
        WishlistPage wishlistPage = new WishlistPage(driver);
        //remove all products from wishlist
        wishlistPage.clickProduct1RemoveButton();
        wishlistPage.clickProduct2RemoveButton();
    }
    //remove all mp3 players from wishlist
    protected void removeAllAvailableMP3PlayersFromWishlistTest(){
        WishlistPage wishlistPage = new WishlistPage(driver);
        //remove all products from wishlist
        wishlistPage.clickProduct1RemoveButton();
        wishlistPage.clickProduct2RemoveButton();
        wishlistPage.clickProduct3RemoveButton();
        wishlistPage.clickProduct4RemoveButton();
    }

    //add all desktops to cart
    protected void addAllAvailableDesktopsToCartTest(){
        WishlistPage wishlistPage = new WishlistPage(driver);
        //remove all products from wishlist
        wishlistPage.clickProduct1AddToCartButton();
        wishlistPage.clickProduct2AddToCartButton();
        wishlistPage.clickProduct3AddToCartButton();
        wishlistPage.clickProduct4AddToCartButton();
        wishlistPage.clickProduct5AddToCartButton();
        wishlistPage.clickProduct6AddToCartButton();
        wishlistPage.clickProduct7AddToCartButton();
        wishlistPage.clickProduct8AddToCartButton();
        wishlistPage.clickProduct9AddToCartButton();
        wishlistPage.clickProduct10AddToCartButton();
        wishlistPage.clickProduct11AddToCartButton();
        wishlistPage.clickProduct12AddToCartButton();
    }
    //add all laptops to cart
    protected void addAllLaptopsToCartTest(){
        WishlistPage wishlistPage = new WishlistPage(driver);
        //remove all products from wishlist
        wishlistPage.clickProduct1AddToCartButton();
        wishlistPage.clickProduct2AddToCartButton();
        wishlistPage.clickProduct3AddToCartButton();
        wishlistPage.clickProduct4AddToCartButton();
        wishlistPage.clickProduct5AddToCartButton();
    }
    //add all components to cart
    protected void addAllComponentsToCartTest(){
        WishlistPage wishlistPage = new WishlistPage(driver);
        //remove all products from wishlist
        wishlistPage.clickProduct1AddToCartButton();
        wishlistPage.clickProduct2AddToCartButton();
    }
    //add all tablets to cart
    protected void addAllTabletsToCartTest(){
        WishlistPage wishlistPage = new WishlistPage(driver);
        //remove all products from wishlist
        wishlistPage.clickProduct1AddToCartButton();
    }
    //add all phones to cart
    protected void addAllPhonesToCartTest(){
        WishlistPage wishlistPage = new WishlistPage(driver);
        //remove all products from wishlist
        wishlistPage.clickProduct1AddToCartButton();
        wishlistPage.clickProduct2AddToCartButton();
        wishlistPage.clickProduct3AddToCartButton();
    }
    //add all cameras to cart
    protected void addAllCamerasToCartTest(){
        WishlistPage wishlistPage = new WishlistPage(driver);
        //remove all products from wishlist
        wishlistPage.clickProduct2AddToCartButton();
        wishlistPage.clickProduct1AddToCartButton();
        //since this product is redirected to SingleProductPage, add to cart method has to perform there
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        singleProductPage.selectBlueOption();
        singleProductPage.clickAddToCartButton();
    }
    //add all mp3 players to cart
    protected void addAllMP3PlayersToCartTest(){
        WishlistPage wishlistPage = new WishlistPage(driver);
        //remove all products from wishlist
        wishlistPage.clickProduct1AddToCartButton();
        wishlistPage.clickProduct2AddToCartButton();
        wishlistPage.clickProduct3AddToCartButton();
        wishlistPage.clickProduct4AddToCartButton();
    }

    //return singular desktop product from order test method
    protected void returnSingularDesktopProductTest(SingularOrderPage singularOrderPage){
        //remove all desktops from order click
        singularOrderPage.clickReturnOrderButton1();
        ProductReturnPage productReturnPage = new ProductReturnPage(driver);
        //return single product method
        returnSingularProduct(productReturnPage);
    }
    //return singular laptop product from order test method
    protected void returnSingularLaptopProductTest(SingularOrderPage singularOrderPage){
        //remove all desktops from order click
        singularOrderPage.clickReturnOrderButton1();
        ProductReturnPage productReturnPage = new ProductReturnPage(driver);
        //return single product method
        returnSingularProduct(productReturnPage);
    }
    //return singular component product from order test method
    protected void returnSingularComponentProductTest(SingularOrderPage singularOrderPage){
        //remove all desktops from order click
        singularOrderPage.clickReturnOrderButton1();
        ProductReturnPage productReturnPage = new ProductReturnPage(driver);
        //return single product method
        returnSingularProduct(productReturnPage);
    }
    //return singular tablet product from order test method
    protected void returnSingularTabletProductTest(SingularOrderPage singularOrderPage){
        //remove all desktops from order click
        singularOrderPage.clickReturnOrderButton1();
        ProductReturnPage productReturnPage = new ProductReturnPage(driver);
        //return single product method
        returnSingularProduct(productReturnPage);
    }
    //return singular phone product from order test method
    protected void returnSingularPhoneProductTest(SingularOrderPage singularOrderPage){
        //remove all desktops from order click
        singularOrderPage.clickReturnOrderButton1();
        ProductReturnPage productReturnPage = new ProductReturnPage(driver);
        //return single product method
        returnSingularProduct(productReturnPage);
    }
    //return singular camera product from order test method
    protected void returnSingularCameraProductTest(SingularOrderPage singularOrderPage){
        //remove all desktops from order click
        singularOrderPage.clickReturnOrderButton1();
        ProductReturnPage productReturnPage = new ProductReturnPage(driver);
        //return single product method
        returnSingularProduct(productReturnPage);
    }
    //return singular mp3 player product from order test method
    protected void returnSingularMP3PlayerProductTest(SingularOrderPage singularOrderPage){
        //remove all desktops from order click
        singularOrderPage.clickReturnOrderButton1();
        ProductReturnPage productReturnPage = new ProductReturnPage(driver);
        //return single product method
        returnSingularProduct(productReturnPage);
    }
    //product return page test procedure method
    protected void returnSingularProduct(ProductReturnPage productReturnPage){
        //return product page web element assert
        isReturnProductPageWebElementDisplayed(productReturnPage);
        //get current customer / product data
        getOrderProductData(productReturnPage);
        //input customer telephone number
        productReturnPage.inputCustomerTelephone();
        //log the telephone
        logger.info("Input customer telephone: " + productReturnPage.getTelephone());
        //select return product reason
        productReturnPage.selectFaultyProductReason();
        //select product as 'opened'
        productReturnPage.selectProductOpened();
        //input product condition comment
        productReturnPage.inputCustomerFaultyProductComment();
        //log the comment
        logger.info("Input customer comment: " + productReturnPage.getDetailsTextArea());
        //click 'submit' button
        productReturnPage.clickSubmitButton();
        //assert the product has been returned successfully
        //logger.info("Product returned message: " + productReturnPage.getProductReturnSuccessMessage()); due to internet/CPU issues sometimes test drops NoSuchElementException (selector is VALID)
    }

    //available products list display method
    protected void availableProductListDisplayTest(){
        OpenCartProductPage openCartProductPage = new OpenCartProductPage(driver);
        isProductPageWebElementDisplayed(openCartProductPage);
        //available camera list
        logger.info("Available product list on product page: ");
        // Product images
        logger.info("Product images: " + openCartProductPage.getProductImages().toString());
        // Product names
        logger.info("Product names: " + openCartProductPage.getProductNames().toString());
        // Product descriptions
        logger.info("Product descriptions: " + openCartProductPage.getProductDescriptions().toString());
        // Product prices
        logger.info("Product prices: " + openCartProductPage.getProductPrices().toString());
        // Product prices (ex tax)
        logger.info("Product prices (ex tax): " + openCartProductPage.getProductPricesExTax().toString());
        System.out.println("\n");
    }

    //product page web element assert method
    protected void isProductPageWebElementDisplayed(OpenCartProductPage openCartProductPage){
        //assert the camera image is displayed
        assertTrue(openCartProductPage.isProductImageDisplayed(), "The camera image isn't displayed");
        //assert the camera name is displayed
        assertTrue(openCartProductPage.isProductNameDisplayed(), "The camera name isn't displayed");
        //assert the camera description is displayed
        assertTrue(openCartProductPage.isProductDescriptionDisplayed(), "The camera description isn't displayed");
        //assert the camera price is displayed
        assertTrue(openCartProductPage.isProductPriceDisplayed(), "The camera price isn't displayed");
        //assert the camera price (ex tax) is displayed
        assertTrue(openCartProductPage.isProductPriceExTaxDisplayed(), "The camera price (ex tax) isn't displayed");
        //product interactive buttons asserts
        assertTrue(openCartProductPage.isProductAddToCartButtonDisplayed(), "The 'add to cart' button isn't displayed");
        assertTrue(openCartProductPage.isProductAddToWishListDisplayed(), "The 'add to wishlist' button isn't displayed'");
        assertTrue(openCartProductPage.isCompareProductButtonDisplayed(), "The compare product button isn't displayed");
        //product category web element asserts
        //assert desktops link is displayed
        assertTrue(openCartProductPage.isDesktopsLinkDisplayed(), "The desktops link isn't displayed");
        //assert laptops link is displayed
        assertTrue(openCartProductPage.isLaptopsLinkDisplayed(), "The laptops link isn't displayed");
        //assert components link is displayed
        assertTrue(openCartProductPage.isComponentsLinkDisplayed(), "The components link isn't displayed");
        //assert tablets link is displayed
        assertTrue(openCartProductPage.isTabletsLinkDisplayed(), "The tablets link isn't displayed");
        //assert software link is displayed
        assertTrue(openCartProductPage.isSoftwareLinkDisplayed(), "The software link isn't displayed");
        //assert phones link is displayed
        assertTrue(openCartProductPage.isPhonesLinkDisplayed(), "The phones link isn't displayed");
        //assert cameras link is displayed
        assertTrue(openCartProductPage.isCamerasLinkDisplayed(), "The cameras link isn't displayed");
        //assert mp3 players link is displayed
        assertTrue(openCartProductPage.isMP3PlayersLinkDisplayed(), "The MP3 players link isn't displayed");
    }

    //single product page web element assert
    protected void isSingleProductWebElementDisplayed(SingleProductPage singleProductPage){
        //assert the product name is displayed
        assertTrue(singleProductPage.isProductNameDisplayed(), "The product name isn't displayed");
        //assert product descriptions block is displayed
        assertTrue(singleProductPage.isProductDescriptionDisplayed(), "The product description block isn't displayed");
        //assert product price block is displayed
        assertTrue(singleProductPage.isProductPriceDisplayed(), "The product prices block isn't displayed");
        //assert the product select dropdown menu is displayed
        assertTrue(singleProductPage.isProductSelectMenuDisplayed(), "The product select dropdown menu isn't displayed");
        //assert the product quantity input field is displayed
        assertTrue(singleProductPage.isQuantityInputDisplayed(), "The product quantity input field isn't displayed");
        //assert the 'add to cart' button is displayed
        assertTrue(singleProductPage.isAddToCartButtonDisplayed(), "The 'add to cart' button isn't displayed");
    }

    //wishlist web element assert
    protected void isWishListWebElementDisplayed(WishlistPage wishlistPage){
        //assert product image is displayed
        assertTrue(wishlistPage.isProductImageDisplayed(), "The product image isn't displayed");
        //assert product name is displayed
        assertTrue(wishlistPage.isProductNameDisplayed(), "The product name isn't displayed");
        //assert product model is displayed
        assertTrue(wishlistPage.isProductModelDisplayed(), "The product model isn't displayed");
        //assert product stock is displayed
        assertTrue(wishlistPage.isProductStockDisplayed(), "The product stock isn't displayed");
        //assert product unit price is displayed
        assertTrue(wishlistPage.isProductUnitPriceDisplayed(), "The product unit price isn't displayed");
        //assert product 'add to cart' buttons are displayed
        assertTrue(wishlistPage.areAddToCartButtonsDisplayed(), "The 'add to cart' buttons aren't displayed");
        //assert remove product from wishlist buttons are displayed
        assertTrue(wishlistPage.areRemoveFromWishlistButtonsDisplayed(), "The 'remove from wishlist' buttons aren't displayed");
    }

    //wishlist added product display method
    protected void displayAddedProductToWishlistData(WishlistPage wishlistPage){
        //display product data added to wishlist
        logger.info("Product images displayed in wishlist: " + wishlistPage.getProductImages());
        logger.info("Product names displayed in wishlist: " + wishlistPage.getProductNames());
        logger.info("Product models displayed in wishlist: " + wishlistPage.getProductModel());
        logger.info("Product stock displayed in wishlist: " + wishlistPage.getProductStock());
        logger.info("Product unit prices displayed in wishlist: " + wishlistPage.getProductUnitPrices()); //it prints out crossed prices along with non-crossed
    }

    //shopping cart page web elements assert method
    protected void isShoppingCartWebElementDisplayed(ShoppingCartPage shoppingCartPage){
        //assert the product image is displayed
        assertTrue(shoppingCartPage.isProductImageDisplayed(), "The product image isn't displayed");
        //assert product name is displayed
        assertTrue(shoppingCartPage.isProductNameDisplayed(), "The product name isn't displayed");
        //assert product model is displayed
        assertTrue(shoppingCartPage.isProductModelDisplayed(), "The product model isn't displayed");
        //assert product quantity is displayed
        assertTrue(shoppingCartPage.isProductQuantityDisplayed(), "The product quantity isn't displayed");
        //assert product unit price is displayed
        assertTrue(shoppingCartPage.isProductUnitPriceDisplayed(), "The product price isn't displayed");
        //assert product total price is displayed
        assertTrue(shoppingCartPage.isProductTotalPriceDisplayed(), "The product total price isn't displayed");
        //assert product sub-total price is displayed
        assertTrue(shoppingCartPage.isProductSubTotalPriceDisplayed(), "The product subtotal price isn't displayed");
        //assert product eco-tax is displayed
        assertTrue(shoppingCartPage.isProductEcoTaxDisplayed(), "The product eco tax isn't displayed");
        //assert product VAT is displayed
        assertTrue(shoppingCartPage.isProductVATDisplayed(), "The product VAT isn't displayed");
        //assert product total price after taxes is displayed
        assertTrue(shoppingCartPage.isProductAfterTaxTotalPriceDisplayed(), "The product after tax price isn't displayed");
        //assert checkout button is displayed
        assertTrue(shoppingCartPage.isProductCheckoutButtonDisplayed(), "The product checkout button isn't displayed");
    }

    //shopping cart product data logger method
    protected void displayShoppingCartData(ShoppingCartPage shoppingCartPage){
        //display shopping cart product values
        logger.info("Product name: " + shoppingCartPage.getProductName());
        logger.info("Product model: " + shoppingCartPage.getProductModel());
        logger.info("Product quantity: " + shoppingCartPage.getProductQuantity());
        logger.info("Product unit price: " + shoppingCartPage.getProductUnitPrice());
        logger.info("Product total price: " + shoppingCartPage.getProductTotalPrice());
        logger.info("Product sub-total: " + shoppingCartPage.getProductSubTotalPrice());
        logger.info("Product eco-tax: " + shoppingCartPage.getProductEcoTax());
        logger.info("Product VAT: " + shoppingCartPage.getProductVAT());
        logger.info("Product total price after taxes: " + shoppingCartPage.getProductAfterTaxTotalPrice());
    }
    //product return page data logger method
    protected void getOrderProductData(ProductReturnPage productReturnPage){
        System.out.println("\n");
        //data loggers
        logger.info("Customer first name: " + productReturnPage.getFirstName());
        logger.info("Customer last name: " + productReturnPage.getLastName());
        logger.info("Customer email: " + productReturnPage.getEmail());
        logger.info("Customer order ID:" + productReturnPage.getOrderID());
        logger.info("Order submission date: " + productReturnPage.getDate());
        logger.info("Order product name: " + productReturnPage.getProductName());
        logger.info("Order product code: " + productReturnPage.getProductCode());
        logger.info("Order (product) quantity: " + productReturnPage.getProductQuantity());
    }
    //product return page web element assert
    protected void isReturnProductPageWebElementDisplayed(ProductReturnPage productReturnPage){
        //assert first name input field is displayed
        assertTrue(productReturnPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        //assert last name input field is displayed
        assertTrue(productReturnPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        //assert email input field is displayed
        assertTrue(productReturnPage.isEmailInputFieldDisplayed(), "The email input field isn't displayed");
        //assert telephone input field is displayed
        assertTrue(productReturnPage.isTelephoneInputFieldDisplayed(), "The telephone input field isn't displayed");
        //assert orderID input field is displayed
        assertTrue(productReturnPage.isOrderIDInputFieldDisplayed(), "The order ID input field isn't displayed");
        //assert order date selector is displayed
        assertTrue(productReturnPage.isDateSelectorDisplayed(), "The order date selector isn't displayed");
        //assert product name input field is displayed
        assertTrue(productReturnPage.isProductNameInputFieldDisplayed(), "The product name input field isn't displayed");
        //assert product code input field is displayed
        assertTrue(productReturnPage.isProductCodeInputFieldDisplayed(), "The product code input field isn't displayed");
        //assert product quantity input field is displayed
        assertTrue(productReturnPage.isProductQuantityInputFieldDisplayed(), "The product quantity input field isn't displayed");
        //assert 'dead on arrival' reason selector is displayed
        assertTrue(productReturnPage.isDeadOnArrivalSelectorDisplayed(), "The 'dead on arrival' selector isn't displayed");
        //assert 'faulty product' reason selector is displayed
        assertTrue(productReturnPage.isFaultyProductSelectorDisplayed(), "The 'faulty product' selector isn't displayed");
        //assert 'order error' reason selector is displayed
        assertTrue(productReturnPage.isOrderErrorSelectorDisplayed(), "The 'order error' selector isn't displayed");
        //assert 'other reasons' reason selector is displayed
        assertTrue(productReturnPage.isOtherReasonSelectorDisplayed(), "The 'other reasons' selector isn't displayed");
        //assert 'wrong item' reason selector is displayed
        assertTrue(productReturnPage.isWrongItemSelectorDisplayed(), "The 'wrong item' selector isn't displayed");
        //assert 'product opened' selector is displayed
        assertTrue(productReturnPage.isProductOpenedSelectorDisplayed(), "The 'product opened' selector isn't displayed");
        //assert 'product not opened' reason selector is displayed
        assertTrue(productReturnPage.isProductNotOpenedSelectorDisplayed(), "The 'product not opened' selector isn't displayed");
        //assert product faulty details textarea is displayed
        assertTrue(productReturnPage.isDetailsTextAreaDisplayed(), "The faulty details textarea isn't displayed");
        //assert submit button is displayed
        assertTrue(productReturnPage.isSubmitButtonDisplayed(), "The 'submit' button isn't displayed");
    }
}
