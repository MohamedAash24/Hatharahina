package com.example.hathara_hina.service.serviceImpl;

import com.example.hathara_hina.dto.ImageWishlistDTO;
import com.example.hathara_hina.entity.ImageWishlist;
import com.example.hathara_hina.repository.ImageWishlistRepository;
import com.example.hathara_hina.service.ImageWishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImageWishlistServiceImpl implements ImageWishlistService {

    @Autowired
    ImageWishlistRepository imageWishlistRepository;

    @Override
    public ResponseEntity<?> addImageWishlist(ImageWishlistDTO imageWishlistDTO) {

        if (imageWishlistRepository.findByImagejokeId(imageWishlistDTO.getImagejokeId()).isEmpty()) {

            ImageWishlist imageWishlist = new ImageWishlist();
            imageWishlist.setImagejokeId(imageWishlistDTO.getImagejokeId());
            imageWishlistRepository.save(imageWishlist);
            return ResponseEntity.status(HttpStatus.OK).body("Image joke added to wishlist");

        }else{

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Image joke already exists");
        }
    }

    @Override
    public ResponseEntity<?> getImageJokeFromWishlist() {
        List<ImageWishlist> allJokes = imageWishlistRepository.findAll();
        ArrayList<ImageWishlist> jokeArrayList = new ArrayList<>();
        allJokes.forEach(jokes -> {
            jokeArrayList.add(jokes);
        });
        return ResponseEntity.status(HttpStatus.OK).body(jokeArrayList);
    }

    @Override
    public ResponseEntity<?> deleteImageJokeFromWishlist(Integer id) {
        if(imageWishlistRepository.findById(id).isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid Wishlist Id");
        }else {
            ImageWishlist imageWishlist = imageWishlistRepository.findById(id).get();
            imageWishlistRepository.delete(imageWishlist);
            return ResponseEntity.status(HttpStatus.OK).body("Delete Success");
        }
    }


}
