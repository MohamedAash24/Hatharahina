package com.example.hathara_hina.repository;

import com.example.hathara_hina.entity.CommonJoke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonJokeRepository extends JpaRepository<CommonJoke, Integer> {

    List<CommonJoke> findById(int commonJokeId);

}
