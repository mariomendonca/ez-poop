package com.ezpoop.ezpoopbackend.domains.dtos.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserRequest {
    private String name;
    private String email;
    private String username;
    private String password;
}
