package com.example.hathara_hina.service.serviceImpl;

import com.example.hathara_hina.entity.CommonJoke;
import com.example.hathara_hina.entity.ImageJoke;
import com.example.hathara_hina.repository.CommonJokeRepository;
import com.example.hathara_hina.repository.ImageJokeRepository;
import com.example.hathara_hina.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JokeImpl implements JokeService {

    @Autowired
    CommonJokeRepository commonJokeRepository;
    @Autowired
    ImageJokeRepository imageJokeRepository;

    @Override
    public ResponseEntity<?> getCommonJokeTypes() {
        List<CommonJoke> allProducts = commonJokeRepository.findAll();
        ArrayList<CommonJoke> jokeArrayList = new ArrayList<>();
        allProducts.forEach(jokes -> {
            jokeArrayList.add(jokes);
        });
        return ResponseEntity.status(HttpStatus.OK).body(jokeArrayList);

    }

    @Override
    public ResponseEntity<?> getImageJokeTypes() {
        List<ImageJoke> allProducts = imageJokeRepository.findAll();
        ArrayList<ImageJoke> jokeArrayList = new ArrayList<>();
        allProducts.forEach(jokes -> {
            jokeArrayList.add(jokes);
        });
        return ResponseEntity.status(HttpStatus.OK).body(jokeArrayList);
    }
}
