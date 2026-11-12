CREATE TABLE photos(
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    title VARCHAR(100),
    description TEXT,
    photo_url VARCHAR(500) NOT NULL ,
    photo_public_id VARCHAR(500) NOT NULL ,
    visible BOOLEAN NOT NULL DEFAULT FALSE,
    featured BOOLEAN NOT NULL DEFAULT FALSE,
    home_position INT,
    created_at TIMESTAMP NOT NULL
);

ALTER TABLE photo_collections ADD CONSTRAINT fk_photo_collections_cover_photo FOREIGN KEY (cover_photo_id) REFERENCES photos(id) ON DELETE SET NULL;