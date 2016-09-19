package com.imdb

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass

public class BrowserFactory {

    public static chromeDriver() {
        setSystemPathForDrivers()
        return new ChromeDriver()
    }

    private static setSystemPathForDrivers() {
        String os = null
        String osFullName = System.getProperty("os.name")

        if (osFullName.toLowerCase().contains("mac")) {
            os = "mac"
        } else if (osFullName.toLowerCase().contains("linux")) {
            os = "linux"
        } else if (osFullName.toLowerCase().contains("windows")) {
            os = "windows"
        } else {
            throw new IllegalStateException("OS not supported")
        }

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/" + os + "/chromedriver")
    }

}
