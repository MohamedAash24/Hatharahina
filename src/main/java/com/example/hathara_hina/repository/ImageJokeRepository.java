package com.example.hathara_hina.repository;

import com.example.hathara_hina.entity.CommonJoke;
import com.example.hathara_hina.entity.ImageJoke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageJokeRepository extends JpaRepository<ImageJoke, Integer> {
    List<ImageJoke> findById(int commonJokeId);
}
