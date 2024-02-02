package com.example.hathara_hina.controller;


import com.example.hathara_hina.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/joke")
public class jokeController {

    @Autowired
    JokeService jokeService;

    @GetMapping("/common_joke")
    public ResponseEntity<?> getCommonJokeTypes(){
        return jokeService.getCommonJokeTypes();
    }

    @GetMapping("/image_joke")
    public ResponseEntity<?> getImageJokeTypes(){
            return jokeService.getImageJokeTypes();
    }
}
