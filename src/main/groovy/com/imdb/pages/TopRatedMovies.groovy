package com.imdb.pages

import com.imdb.BrowserFactory
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

public class TopRatedMovies {

    private WebDriver driver

    def TopRatedMovies(driver) {
        this.driver = driver
    }

    def isMovieListEmpty() {
        def movieList = driver.findElements(By.cssSelector(".lister-list tr"))
        return movieList.isEmpty()
    }

    def sortByRanking() {
        WebElement ranking = driver.findElement(By.cssSelector(".lister-sort-by option:nth-child(1)"))
        ranking.click()
        assert ranking.getAttribute("selected")
        return this
    }

    def sortByImdbRating() {
        WebElement imdbRating = driver.findElement(By.cssSelector(".lister-sort-by option:nth-child(2)"))
        imdbRating.click()
        assert imdbRating.getAttribute("selected")
        return this
    }

    def sortByReleaseDate() {
        WebElement releaseDate = driver.findElement(By.cssSelector(".lister-sort-by option:nth-child(3)"))
        releaseDate.click()
        assert releaseDate.getAttribute("selected")
        return this
    }

    def sortByNumberOfRatings() {
        WebElement numberOfRatings = driver.findElement(By.cssSelector(".lister-sort-by option:nth-child(4)"))
        numberOfRatings.click()
        assert numberOfRatings.getAttribute("selected")
        return this
    }

    def sortByYourRating() {
        WebElement yourRating = driver.findElement(By.cssSelector(".lister-sort-by option:nth-child(5)"))
        yourRating.click()
        assert yourRating.getAttribute("selected")
        return this
    }

    def selectWesternGenre() {
        WebElement westernGenre = driver.findElement(By.cssSelector(".quicklinks li:nth-child(21)"))
        westernGenre.click()
        return this
    }
}