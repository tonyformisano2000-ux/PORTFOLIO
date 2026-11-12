package com.antonio_formisano.portfolio.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "photos")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String title;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(nullable = false, length=500)
    private String photoUrl;
    @Column(nullable = false, length=500)
    private String photoPublicId;
    @Column(nullable = false)
    private boolean visible;
    @Column(nullable = false)
    private boolean featured;
    @Column
    private Integer homePosition;
    @Column
    @CreationTimestamp
    private LocalDateTime createdAt;
}
