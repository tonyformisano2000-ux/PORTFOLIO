package com.antonio_formisano.portfolio.entities;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CollectionPhotoId implements Serializable {
    private Long photoCollectionId;
    private Long photoId;
}
