package io.datajek.spring.basics.movie_recommender_system.lesson8;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CollaborativeFilter implements Filter {
    public CollaborativeFilter() {
        super();
        System.out.println("CollaborativeFilter bean created");
    }

    public String[] getRecommendations(String movie){
        return new String[]{"Collaborative","Finding Nemo", "Ice Age", "Toy Story"};
    }
}
