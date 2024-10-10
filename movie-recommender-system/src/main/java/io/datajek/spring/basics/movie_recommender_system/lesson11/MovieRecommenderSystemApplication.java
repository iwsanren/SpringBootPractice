package io.datajek.spring.basics.movie_recommender_system.lesson11;

import io.datajek.spring.basics.movie_recommender_system.lesson6.RecommenderImplementation2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
	public static void main(String[] args) {
		//ApplicationContext manages the beans and dependencies:
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class,args);
		//ApplicationContext appContext: get information about a bean
		//SpringApplication.run: return the ApplicationContext

		System.out.println("Setter injection in RecommenderImplementation2 class");

		//use ApplicationContext to find which filter is being used:
		RecommenderImplementation2 recommender = appContext.getBean(RecommenderImplementation2.class);
		//the getBean() method of ApplicationContext can be used to get the bean of a particular class.

		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));

	}
}
