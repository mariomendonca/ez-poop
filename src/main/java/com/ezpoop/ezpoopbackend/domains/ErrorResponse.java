package com.ezpoop.ezpoopbackend.domains;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
@Builder
public class ErrorResponse {
    private HttpStatus httpStatus;
    private Integer HttpStatusCode;
    private String message;
    private final LocalDateTime createdAt = LocalDateTime.now();
}
