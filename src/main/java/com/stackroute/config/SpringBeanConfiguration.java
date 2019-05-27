package com.stackroute.config;

import com.stackroute.awareinterface.ApplicationContextAwareDemo;
import com.stackroute.awareinterface.BeanFactoryAwareDemo;
import com.stackroute.awareinterface.BeanNameAwareDemo;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration{

    @Bean(name="actor")
    public Actor getActor(){
        return new Actor("sai","female",22);
    }

     @Bean(name = "actor1")
     public Actor getActor1(){
      return new Actor("vinay","male",26);
    }

    @Bean(name="actor2")
    public Actor getActor2(){
        return new Actor("subbareddy","male",50);
    }

    @Bean(name="movie")
    public Movie getMovie(){
        return new Movie(100,"Hello",getActor());

    }

    @Bean(name="movie1")
   // @Scope("prototype")
    public Movie getMovie1(){
        return new Movie(101,"Mirchi",getActor1());
    }

    @Bean(name="movie2")
    public Movie getMovie2(){
        return new Movie(102,"Julai",getActor2());
    }

    @Bean(name="applicationContextAwareDemo")
    public ApplicationContextAwareDemo getApplicationContextAwareDemo(){
        return new ApplicationContextAwareDemo();
    }

    @Bean(name="beanFactoryAwareDemo")
    public BeanFactoryAwareDemo getBeanFactoryAwareDemo(){
        return new BeanFactoryAwareDemo();
    }

    @Bean(name="beanNameAwareDemo")
    public BeanNameAwareDemo getBeanNameAwareDemo(){
        return new BeanNameAwareDemo();
    }
}
