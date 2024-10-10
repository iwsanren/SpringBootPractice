package io.datajek.spring.basics.movie_recommender_system.lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    //@Autowired: know dependencies of the object
    //The @Autowired annotation tells Spring that RecommenderImplementation needs an object of type Filter.
    //In other words, Filter is a dependency of RecommenderImplementation.
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
