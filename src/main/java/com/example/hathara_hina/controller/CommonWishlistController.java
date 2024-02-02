package com.example.hathara_hina.controller;

import com.example.hathara_hina.dto.CommonWishlistDTO;
import com.example.hathara_hina.service.CommonWishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/common-wishlist")
public class CommonWishlistController {

    @Autowired
    CommonWishlistService commonWishlistService;

    @PostMapping("/add-joke")
    public ResponseEntity<?> addCommonWishlist(@RequestBody CommonWishlistDTO commonWishlistDTO){
        return commonWishlistService.addCommonWishlist(commonWishlistDTO);
    }

    @GetMapping("/all-jokes")
    public ResponseEntity<?> getCommonJokeFromWishlist(){

        return commonWishlistService.getCommonJokeFromWishlist();
    }


    @DeleteMapping("/delete-joke/{joke_id}")
    public ResponseEntity<?> deleteCommonJokeFromWishlist(@PathVariable("joke_id") Integer id){

        return commonWishlistService.deleteCommonJokeFromWishlist(id);
    }

}
