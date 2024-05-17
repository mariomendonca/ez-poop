CREATE TABLE reviews (
    id SERIAL PRIMARY KEY,
    location_id bigint NOT NULL,
    rating integer NOT NULL,
    comment TEXT NOT NULL,
    created_at DATE,
    CONSTRAINT fk_location
    FOREIGN KEY (location_id)
    REFERENCES locations(id)
);