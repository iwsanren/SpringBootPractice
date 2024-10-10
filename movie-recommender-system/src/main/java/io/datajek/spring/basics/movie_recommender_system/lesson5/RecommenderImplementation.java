package io.datajek.spring.basics.movie_recommender_system.lesson5;

import io.datajek.spring.basics.movie_recommender_system.lesson5.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    @Qualifier("CBF")
    private Filter filter;

    public RecommenderImplementation(){}

    public RecommenderImplementation(Filter filter){
        super();
        this.filter = filter;
    }

    public String[] recommendMovies(String movie){
        System.out.println("Name of the filter in use is: "+ filter + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
