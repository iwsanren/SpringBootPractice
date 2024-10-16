package io.datajek.spring.basics.movie_recommender_system.lesson14;

import org.springframework.stereotype.Component;

import javax.inject.Named;

@Component
public class ContentBasedFilter implements Filter {
    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
