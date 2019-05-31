package com.stackroute.main;

import com.stackroute.model.Actor;
import com.stackroute.model.Movie;
import com.stackroute.service.MovieManager;
import com.stackroute.service.MovieManagerImpl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionManagerMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");

        MovieManager movieManager = ctx.getBean("MovieManager", MovieManagerImpl.class);

        Movie movie = createDummyMovie();
        movieManager.createMovie(movie);

        ctx.close();
    }

    private static Movie createDummyMovie() {
        Movie movie = new Movie();
        movie.setMovie_id(3);
        movie.setMovie_name("Rutu");
        movie.setRelease_year(2019);
        movie.setRating(8);
        Actor actor=new Actor();
        actor.setActor_id(3);
        actor.setActor_name("sallu");
        // setting value more than 20 chars, so that SQLException occurs
        actor.setActor_gender("M");
        actor.setActor_age(56);
        movie.setActor(actor);
        return movie;
    }

}
