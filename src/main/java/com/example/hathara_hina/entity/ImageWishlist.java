package com.example.hathara_hina.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "image_wishlist")
public class ImageWishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "imagejoke_id" )
    private int imagejokeId;

    @ManyToOne
    @JoinColumn(name ="imagejoke_id", referencedColumnName = "id", updatable = false, insertable = false)
    private ImageJoke imageJoke;

}
