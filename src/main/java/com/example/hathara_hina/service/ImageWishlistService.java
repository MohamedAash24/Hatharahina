package com.example.hathara_hina.service;

import com.example.hathara_hina.dto.ImageWishlistDTO;
import org.springframework.http.ResponseEntity;

public interface ImageWishlistService {
    ResponseEntity<?> addImageWishlist(ImageWishlistDTO imageWishlistDTO);

    ResponseEntity<?> getImageJokeFromWishlist();

    ResponseEntity<?> deleteImageJokeFromWishlist(Integer id);
}
