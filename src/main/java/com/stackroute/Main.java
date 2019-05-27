package com.stackroute;

import com.stackroute.config.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigRegistry;

public class Main
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Movie movie = (Movie) ctx.getBean("movie");
        System.out.println(movie);

        Movie movie1 = (Movie) ctx.getBean("movie1");
        System.out.println(movie1);

        Movie movie2 = (Movie) ctx.getBean("movie1");
        System.out.println(movie2);

        System.out.println(movie1==movie2);
    }
}
