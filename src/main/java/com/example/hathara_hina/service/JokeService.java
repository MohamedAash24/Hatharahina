package com.example.hathara_hina.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface JokeService {

    ResponseEntity<?> getCommonJokeTypes();

    ResponseEntity<?> getImageJokeTypes();
}
