package com.example.hathara_hina.controller;

import com.example.hathara_hina.dto.ImageWishlistDTO;
import com.example.hathara_hina.service.ImageWishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/image-wishlist")
public class ImageWishlistController {

    @Autowired
    ImageWishlistService imageWishlistService;

    @PostMapping("/add-joke")
    public ResponseEntity<?> addImageWishlist(@RequestBody ImageWishlistDTO imageWishlistDTO){
            return imageWishlistService.addImageWishlist(imageWishlistDTO);
    }

    @GetMapping("/all-jokes")
    public ResponseEntity<?> getImageJokeFromWishlist(){

        return imageWishlistService.getImageJokeFromWishlist();
    }


    @DeleteMapping("/delete-joke/{joke_id}")
    public ResponseEntity<?> deleteImageJokeFromWishlist(@PathVariable("joke_id") Integer id){

        return imageWishlistService.deleteImageJokeFromWishlist(id);
    }

}
