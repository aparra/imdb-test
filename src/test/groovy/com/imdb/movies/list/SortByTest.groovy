package com.imdb.movies.list

import com.imdb.BaseTest
import com.imdb.pages.TopRatedMovies
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

public class SortByTest extends BaseTest {

    private TopRatedMovies topRatedMovies

    @Test
    public void topListShouldContainAtLeastOneMovie(){
        topRatedMovies = new TopRatedMovies(driver)
        assert !topRatedMovies.isMovieListEmpty()
    }

    @Test
    public void sortByRankingShouldContainAtLeastOneMovie(){
        topRatedMovies = new TopRatedMovies(driver)
        assert !topRatedMovies.sortByRanking()
                .isMovieListEmpty()
    }

    @Test
    public void sortByImdbRatingShouldContainAtLeastOneMovie(){
        topRatedMovies = new TopRatedMovies(driver)
        assert !topRatedMovies.sortByImdbRating()
                .isMovieListEmpty()
    }

    @Test
    public void sortByReleaseDateShouldContainAtLeastOneMovie(){
        topRatedMovies = new TopRatedMovies(driver)
        assert !topRatedMovies.sortByReleaseDate()
                .isMovieListEmpty()
    }

    @Test
    public void sortByNumberOfRatingsShouldContainAtLeastOneMovie(){
        topRatedMovies = new TopRatedMovies(driver)
        assert !topRatedMovies.sortByNumberOfRatings()
                .isMovieListEmpty()
    }

    @Test
    public void sortByYourRatingShouldContainAtLeastOneMovie(){
        topRatedMovies = new TopRatedMovies(driver)
        assert !topRatedMovies.sortByYourRating()
                .isMovieListEmpty()
    }
}
