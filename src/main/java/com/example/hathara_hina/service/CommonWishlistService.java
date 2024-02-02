package com.example.hathara_hina.service;

import com.example.hathara_hina.dto.CommonWishlistDTO;
import com.example.hathara_hina.dto.ImageWishlistDTO;
import org.springframework.http.ResponseEntity;

public interface CommonWishlistService {

    ResponseEntity<?> addCommonWishlist(CommonWishlistDTO commonWishlistDTO);

    ResponseEntity<?> getCommonJokeFromWishlist();

    ResponseEntity<?> deleteCommonJokeFromWishlist(Integer id);
}
