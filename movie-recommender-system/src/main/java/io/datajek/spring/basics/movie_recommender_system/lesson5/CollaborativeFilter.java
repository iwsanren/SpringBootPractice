package io.datajek.spring.basics.movie_recommender_system.lesson5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie){
        return new String[]{"Collaborative","Finding Nemo", "Ice Age", "Toy Story"};
    }
}
