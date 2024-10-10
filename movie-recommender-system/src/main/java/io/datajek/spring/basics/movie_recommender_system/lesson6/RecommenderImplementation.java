package io.datajek.spring.basics.movie_recommender_system.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class RecommenderImplementation {
    private Filter filter;

    @Autowired
    public RecommenderImplementation(@Qualifier("collaborativeFilter")Filter filter){
    //Adding @Qualifier annotation as an argument
    //The @Qualifier annotation cannot be used on the constructor
        super();
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }

    public String[] recommendMovies(String movie){
        System.out.println("Name of the filter in use is: "+ filter + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
