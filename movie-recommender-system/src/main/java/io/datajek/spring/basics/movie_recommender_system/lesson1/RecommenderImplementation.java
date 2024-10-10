package io.datajek.spring.basics.movie_recommender_system.lesson1;

import io.datajek.spring.basics.movie_recommender_system.lesson2.ContentBasedFilter;

public class RecommenderImplementation {
    public String[] recommendMovies(String movie){
        //use content based filter to find similar movies
        //return the results
        io.datajek.spring.basics.movie_recommender_system.lesson2.ContentBasedFilter filter = new ContentBasedFilter();
        String[] result = filter.getRecommendations(movie);
        return result;
    }
}
