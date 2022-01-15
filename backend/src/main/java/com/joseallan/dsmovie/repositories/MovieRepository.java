package com.joseallan.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseallan.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
