package io.datajek.spring.basics.movie_recommender_system.lesson11;

import io.datajek.spring.basics.movie_recommender_system.lesson6.RecommenderImplementation2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
	public static void main(String[] args) {
		//ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		System.out.println();

		//Retrieving singleton bean from application context
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		System.out.println(recommender);

		//Retrieving prototype bean from application context twice
		System.out.println();
		Movie m1 = appContext.getBean(Movie.class);
		System.out.println("==========m1: " + m1);

		System.out.println();
		Movie m2 = appContext.getBean(Movie.class);
		System.out.println("==========m2: " + m2);

		System.out.println();

	}
}
