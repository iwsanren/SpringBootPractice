package io.datajek.spring.basics.movie_recommender_system.lesson6;

import org.springframework.stereotype.Component;

@Component
//want Spring to create and manage this object
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie){
        //logic of content based filter
        return new String[]{"Content", "Happy Feet", "Ice Age", "Shark Tale"};
    }
}
