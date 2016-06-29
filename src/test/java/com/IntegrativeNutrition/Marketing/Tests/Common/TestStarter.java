package com.IntegrativeNutrition.Marketing.Tests.Common;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date Created: 4/4/14
 * Common methods that all classes need to call.
 */

import com.IntegrativeNutrition.Marketing.Global.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**************************************
 * Prerequisites for all tests classes
 **************************************/

public abstract class TestStarter {

    @BeforeClass(alwaysRun = true)
    public static void TestSetup() {
        TestEnvironment.StartEnvironment(System.getProperty("appPath"),
                System.getProperty("browserName"),
                System.getProperty("browserVersion"),
                System.getProperty("browserPlatform"),
                System.getProperty("appPackage"),
                System.getProperty("appActivity"),
                System.getProperty("testURL"));
    }

    @AfterClass(alwaysRun = true)
    public static void TestCleanUp() {
        TestEnvironment.StopEnvironment();
    }

}
