package io.datajek.spring.basics.movie_recommender_system.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {

    private Filter filter;

    public RecommenderImplementation2(){}

    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter method invoked..");
    }

    public RecommenderImplementation2(Filter filter){
        super();
        this.filter = filter;
    }

    public String[] recommendMovies(String movie){
        System.out.println("Name of the filter in use is: "+ filter + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
