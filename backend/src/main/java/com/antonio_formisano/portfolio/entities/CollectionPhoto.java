package com.antonio_formisano.portfolio.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "collection_photos")
public class CollectionPhoto {

    @EmbeddedId
    private CollectionPhotoId id = new CollectionPhotoId();

    @ManyToOne
    @MapsId("photoCollectionId")
    @JoinColumn(name = "photo_collection_id", nullable = false)
    private PhotoCollection photoCollection;

    @ManyToOne
    @MapsId("photoId")
    @JoinColumn(name = "photo_id", nullable = false)
    private Photo photo;

    @Column(nullable = false)
    private int position;
}
