package com.example.hathara_hina.service.serviceImpl;

import com.example.hathara_hina.dto.CommonWishlistDTO;
import com.example.hathara_hina.entity.CommonWishlist;
import com.example.hathara_hina.entity.ImageWishlist;
import com.example.hathara_hina.repository.CommonJokeRepository;
import com.example.hathara_hina.repository.CommonWishlistRepository;
import com.example.hathara_hina.service.CommonWishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommonWishlistImpl implements CommonWishlistService {

    @Autowired
    CommonWishlistRepository commonWishlistRepository;

    @Override
    public ResponseEntity<?> addCommonWishlist(CommonWishlistDTO commonWishlistDTO) {
        if (commonWishlistRepository.findByCommonjokeId(commonWishlistDTO.getCommanjokeId()).isEmpty()) {

            CommonWishlist commonWishlist = new CommonWishlist();
            commonWishlist.setCommonjokeId(commonWishlistDTO.getCommanjokeId());
            commonWishlistRepository.save(commonWishlist);
            return ResponseEntity.status(HttpStatus.OK).body("Common joke added to wishlist");

        }else{

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Common joke already exists");
        }
    }

    @Override
    public ResponseEntity<?> getCommonJokeFromWishlist() {
        List<CommonWishlist> allJokes = commonWishlistRepository.findAll();
        ArrayList<CommonWishlist> jokeArrayList = new ArrayList<>();
        allJokes.forEach(jokes -> {
            jokeArrayList.add(jokes);
        });
        return ResponseEntity.status(HttpStatus.OK).body(jokeArrayList);
    }

    @Override
    public ResponseEntity<?> deleteCommonJokeFromWishlist(Integer id) {
        if(commonWishlistRepository.findById(id).isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid Wishlist Id");
        }else {
            CommonWishlist commonWishlist = commonWishlistRepository.findById(id).get();
            commonWishlistRepository.delete(commonWishlist);
            return ResponseEntity.status(HttpStatus.OK).body("Delete Success");
        }
    }
}
