package io.datajek.spring.basics.movie_recommender_system.lesson14;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//@SpringBootApplication
@Configuration
@ComponentScan
public class MovieRecommenderSystemApplication {
	public static void main(String[] args) {
//		//load the configuration file
//		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
//
//		//check the beans which have been loaded
//		System.out.println("\nBeans loaded:");
//		System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));
//
//		//retrieve bean from the application context
//		RecommenderImplementation recommender = appContext.getBean("recommenderImplementation", RecommenderImplementation.class);
//
//		//call method to get recommendations
//		String[] result = recommender.recommendMovies("Finding Dory");
//
//		//display results
//		System.out.println();
//		System.out.println(Arrays.toString(result));
//
//		appContext.close();



//		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
//		//check the beans which have been loaded
//		System.out.println("\nBeans loaded:");
//		System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));
//
//		//retrieve bean from the application context
//		RecommenderImplementation recommender =
//				appContext.getBean("recommenderImpl", RecommenderImplementation.class);
//
//		//print dependency
//		System.out.println("\nDependency: " + recommender.getFilter());
//		System.out.println();
//
//		appContext.close();


//		// ApplicationContext manages the beans and dependencies
//		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
//
//		//check the beans which have been loaded
//		System.out.println("\nBeans loaded:");
//		System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));
//
//		//retrieve bean from the application context
//		RecommenderImplementation recommender =
//				appContext.getBean("recommenderImpl", RecommenderImplementation.class);
//		//print dependency
//		System.out.println("\nDependency: " + recommender.getFilter());
//		System.out.println();
//
//		appContext.close();




		// ApplicationContext manages the beans and dependencies
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");

		//check the beans which have been loaded
		System.out.println("\nBeans loaded:");
		System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));

		//retrieve bean from the application context
		RecommenderImplementation recommender =
				appContext.getBean("recommenderImpl", RecommenderImplementation.class);
		//print dependency
		System.out.println("\nDependency: " + recommender.getFilter());
		System.out.println();

		appContext.close();


	}

}
