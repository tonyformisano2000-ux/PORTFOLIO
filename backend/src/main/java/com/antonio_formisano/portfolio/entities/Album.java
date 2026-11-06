package com.antonio_formisano.portfolio.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table (name="albums")
public class Album {
   @Id
   @GeneratedValue (strategy=GenerationType.IDENTITY)
   private Long id;
   @Column (nullable = false, length = 100)
   private String name;
   @Column
   private String description;
   @Column (nullable = false)
   private LocalDateTime createdAt;

   public Album() {}
}
