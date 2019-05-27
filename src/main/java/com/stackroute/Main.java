package com.stackroute;

import com.stackroute.config.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Movie movie = (Movie) ctx.getBean("movie");
        System.out.println(movie);
        System.out.println();

        Movie movie1 = (Movie) ctx.getBean("movie1");
        System.out.println(movie1);
        System.out.println();

       // Movie movie2 = (Movie) ctx.getBean("movie1");


          //System.out.println(movie1==movie2);


        //System.out.println(movie.getMovieName()+" "+movie.getId());

        ctx.close();
    }
}
