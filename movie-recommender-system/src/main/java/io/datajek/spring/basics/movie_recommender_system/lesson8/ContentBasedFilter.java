package io.datajek.spring.basics.movie_recommender_system.lesson8;

import org.springframework.stereotype.Component;

@Component
//want Spring to create and manage this object
public class ContentBasedFilter implements Filter {
    public ContentBasedFilter(){
        System.out.println("ContentBasedFilter bean created");
    }
    public String[] getRecommendations(String movie){
        //logic of content based filter
        return new String[]{"Content", "Happy Feet", "Ice Age", "Shark Tale"};
    }
}
