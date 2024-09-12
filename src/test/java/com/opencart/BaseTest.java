package com.opencart;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        // Add arguments to disable popups and notifications
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("disable-infobars");
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false); // disables Chrome password manager
        prefs.put("profile.password_manager_enabled", false); // disables password save prompt
        prefs.put("autofill.profile_enabled", false); // disables autofill for addresses
        prefs.put("profile.default_content_setting_values.notifications", 2); // block notifications
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://192.168.8.193");
    }



    @AfterEach
    public void close() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
