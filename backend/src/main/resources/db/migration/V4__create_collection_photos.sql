CREATE TABLE collection_photos
(
    photo_collection_id BIGINT NOT NULL,
    photo_id            BIGINT NOT NULL,
    position            INT    NOT NULL,
    PRIMARY KEY (photo_collection_id, photo_id),
    CONSTRAINT fk_collection_photos_photo_collection_id FOREIGN KEY (photo_collection_id) REFERENCES photo_collections (id) ON DELETE CASCADE,
    CONSTRAINT fk_collection_photos_photo_id FOREIGN KEY (photo_id) REFERENCES photos (id) ON DELETE CASCADE
);