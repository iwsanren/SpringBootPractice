package io.datajek.spring.basics.movie_recommender_system.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
//want Spring to create and manage this object
public class ContentBasedFilter implements Filter {
    private static int instances = 0;

    @Autowired
    private Movie movie;

    public ContentBasedFilter(){
        instances++;
        System.out.println("ContentBasedFilter constructor called");
    }
    @Lookup
    public Movie getMovie(){
        return movie;
    }
    public static int getInstances(){
        return instances;
    }

    public String[] getRecommendations(String movie){
        //logic of content based filter
        return new String[]{"Content", "Happy Feet", "Ice Age", "Shark Tale"};
    }
}
