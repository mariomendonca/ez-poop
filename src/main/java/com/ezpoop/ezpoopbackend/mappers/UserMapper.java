package com.ezpoop.ezpoopbackend.mappers;

import com.ezpoop.ezpoopbackend.domains.dtos.user.CreateUserRequest;
import com.ezpoop.ezpoopbackend.domains.dtos.user.UserResponse;
import com.ezpoop.ezpoopbackend.domains.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User CreateUserRequestToUser(CreateUserRequest createUserRequest);
    UserResponse UserToUserResponse(User user);
}
