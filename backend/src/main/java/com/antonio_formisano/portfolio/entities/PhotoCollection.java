package com.antonio_formisano.portfolio.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table (name="photo_collections")
public class PhotoCollection {
   @Id
   @GeneratedValue (strategy=GenerationType.IDENTITY)
   private Long id;
   @Column (nullable = false, length = 100)
   private String title;
   @Column
   private String mission;
   @Column (nullable = false)
   private LocalDateTime createdAt;
   @Column
   private Long coverPhotoId;

   public PhotoCollection() {}
}
