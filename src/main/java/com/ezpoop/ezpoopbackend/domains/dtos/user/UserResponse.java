package com.ezpoop.ezpoopbackend.domains.dtos.user;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class UserResponse {
    private UUID id;
    private String name;
    private String email;
    private String username;
    private LocalDateTime createdAt;
}
