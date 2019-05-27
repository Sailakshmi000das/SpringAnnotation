package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {

    public Actor getActor(){
        return new Actor("sai","female",22);
    }

    public Actor getActor1(){
        return new Actor("vinay","male",26);
    }
    @Bean(name="movie")
    public Movie getMovie(){
        return new Movie(100,"Hello",getActor());

    }

    @Bean(name="movie1")
    public Movie getMovie1(){
        return new Movie(101,"Mirchi",getActor1());
    }
}
