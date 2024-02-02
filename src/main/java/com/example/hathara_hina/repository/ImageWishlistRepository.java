package com.example.hathara_hina.repository;

import com.example.hathara_hina.entity.ImageWishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageWishlistRepository extends JpaRepository<ImageWishlist,Integer> {
    Optional<ImageWishlist> findByImagejokeId(int imagejokeId);
}
