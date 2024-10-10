package io.datajek.spring.basics.movie_recommender_system.lesson4;

import org.springframework.stereotype.Component;

@Component
//want Spring to create and manage this object
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie){
        //logic of content based filter
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
