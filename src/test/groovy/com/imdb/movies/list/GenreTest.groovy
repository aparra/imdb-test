package com.imdb.movies.list

import com.imdb.BaseTest
import com.imdb.pages.TopRatedMovies
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

public class GenreTest extends BaseTest {

    private TopRatedMovies topRatedMovies

    @Test
    public void westernGenreShouldContainAtLeastOneMovie(){
        topRatedMovies = new TopRatedMovies(driver)
        assert !topRatedMovies.selectWesternGenre().isMovieListEmpty()
    }
}
