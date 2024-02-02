package com.example.hathara_hina.repository;

import com.example.hathara_hina.entity.CommonWishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommonWishlistRepository extends JpaRepository<CommonWishlist, Integer> {

    Optional<CommonWishlist> findByCommonjokeId (int wishlistId);

}
