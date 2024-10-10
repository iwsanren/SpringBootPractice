package io.datajek.spring.basics.movie_recommender_system.lesson4;

import io.datajek.spring.basics.movie_recommender_system.lesson4.Filter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie){
        return new String[]{"Collaborative","Finding Nemo", "Ice Age", "Toy Story"};
    }
}
