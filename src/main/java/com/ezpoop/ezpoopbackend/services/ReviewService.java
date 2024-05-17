package com.ezpoop.ezpoopbackend.services;

import com.ezpoop.ezpoopbackend.domains.entities.Review;
import com.ezpoop.ezpoopbackend.repositories.ReviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public List<Review> getByLocationId(Long locationId) {
        return reviewRepository.findByLocationId(locationId);
    }
}
