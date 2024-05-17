package com.ezpoop.ezpoopbackend.controllers;

import com.ezpoop.ezpoopbackend.domains.entities.Review;
import com.ezpoop.ezpoopbackend.services.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/reviews")
@AllArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Review review) {
        return ResponseEntity.status(HttpStatus.CREATED).body(reviewService.createReview(review));
    }

    @GetMapping("/{locationId}")
    public ResponseEntity<List<Review>> getReviewsByLocationId(@PathVariable Long locationId) {
        return ResponseEntity.ok(reviewService.getByLocationId(locationId));
    }
}
