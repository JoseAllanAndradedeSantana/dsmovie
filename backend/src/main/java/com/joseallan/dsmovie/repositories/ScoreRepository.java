package com.joseallan.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseallan.dsmovie.entities.Score;
import com.joseallan.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
