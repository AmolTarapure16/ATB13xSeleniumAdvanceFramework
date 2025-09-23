package com.amoltarapure.tests.vwo.pageObjectModelTC;


import com.amoltarapure.base.CommonToAllTest;
import com.amoltarapure.listeners.RetryAnalyzer;
import com.amoltarapure.listeners.ScreenshotListener;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.amoltarapure.driver.DriverManger.getDriver;

@Listeners(ScreenshotListener.class)
@Test(retryAnalyzer = RetryAnalyzer.class)
public class TestVWOLogin_05_TakeScreen_Retry_Prop_Improved_POM extends CommonToAllTest
{
    private static final Logger logger = LogManager.getLogger(TestVWOLogin_05_TakeScreen_Retry_Prop_Improved_POM.class);

    @Owner("Amol")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testFail() {
        getDriver().get("https://app.vwo.com");
        logger.info("Starting the Testcases Page Object Model");
//        Allure.addAttachment("Log output", "text/plain", "This is some log text");
        Assert.assertTrue(false);
    }

    @Owner("Amol")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testPass() {
        getDriver().get("https://app.vwo.com");
        logger.info("Starting the Testcases Page Object Model");
        Assert.assertTrue(true);
    }

}
