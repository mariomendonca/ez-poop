package com.ezpoop.ezpoopbackend.repositories;

import com.ezpoop.ezpoopbackend.domains.entities.Location;
import com.ezpoop.ezpoopbackend.domains.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByLocationId(Long locationId);
}
