package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration{

    @Bean
    public Actor getActor(){
        return new Actor("sai","female",22);
    }

//   @Bean
//    public Actor getActor1(){
//        return new Actor("vinay","male",26);
//    }

    /*@Bean
    public Actor getActor2(){
        return new Actor("subbareddy","male",50);
    }   */

    @Bean(name="movie")
    public Movie getMovie(){
        return new Movie(100,"Hello");

    }

//    @Bean(name="movie1")
//    @Scope("prototype")
//    public Movie getMovie1(){
//        return new Movie(101,"Mirchi",getActor1());
//    }
//
//    @Bean(name="movie2")
//    public Movie getMovie2(){
//        return new Movie(102,"Julai",getActor2());
//    }
}
