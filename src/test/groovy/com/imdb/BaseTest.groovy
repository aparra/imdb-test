package com.imdb

import com.imdb.BrowserFactory
import com.imdb.pages.TopRatedMovies
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterClass
import org.testng.annotations.AfterMethod
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeClass
import org.testng.annotations.BeforeMethod
import org.testng.annotations.BeforeTest

public abstract class BaseTest {

    protected WebDriver driver

    @BeforeClass
    public void setUp() {
        driver = BrowserFactory.chromeDriver()
        driver.get("http://www.imdb.com/chart/top")
    }

    @AfterClass
    public void tearDown() {
        driver.quit()
    }
}
