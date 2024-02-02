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
@Table(name = "common_wishlist")
public class CommonWishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "commonjoke_id")
    private int commonjokeId;

    @ManyToOne
    @JoinColumn(name ="commonjoke_id", referencedColumnName = "id", updatable = false, insertable = false)
    private CommonJoke commonJoke;


}
