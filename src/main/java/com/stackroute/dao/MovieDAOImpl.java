package com.stackroute.dao;

import com.stackroute.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class MovieDAOImpl implements MovieDAO{
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void create(Movie movie) {
        String queryMovie = "insert into movies values (?,?,?,?)";
        String queryActor = "insert into actor values (?,?,?,?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(queryMovie, new Object[] { movie.getMovie_id(), movie.getMovie_name(), movie.getRelease_year(), movie.getRating() });
        System.out.println("Inserted into Customer Table Successfully");
        jdbcTemplate.update(queryActor, new Object[] { movie.getActor().getActor_id(), movie.getActor().getActor_name(), movie.getActor().getActor_gender(), movie.getActor().getActor_age() });
        System.out.println("Inserted into Address Table Successfully");
    }
}
