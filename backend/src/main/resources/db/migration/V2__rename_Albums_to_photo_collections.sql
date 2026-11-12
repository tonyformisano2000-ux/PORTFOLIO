ALTER TABLE albums RENAME TO photo_collections;
ALTER TABLE photo_collections RENAME COLUMN name TO title;
ALTER TABLE photo_collections RENAME COLUMN description TO mission;
ALTER TABLE photo_collections ADD cover_photo_id BIGINT