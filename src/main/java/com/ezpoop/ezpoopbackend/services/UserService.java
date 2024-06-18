package com.ezpoop.ezpoopbackend.services;

import com.ezpoop.ezpoopbackend.domains.dtos.user.CreateUserRequest;
import com.ezpoop.ezpoopbackend.domains.dtos.user.UserResponse;
import com.ezpoop.ezpoopbackend.domains.entities.User;
import com.ezpoop.ezpoopbackend.exceptions.UserAlreadyExistsException;
import com.ezpoop.ezpoopbackend.exceptions.UserNotFoundException;
import com.ezpoop.ezpoopbackend.mappers.UserMapper;
import com.ezpoop.ezpoopbackend.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserResponse createUser(CreateUserRequest userRequest) {
        Optional<User> existentUser = userRepository.findByUsernameOrEmail(userRequest.getUsername(), userRequest.getEmail());

        if (existentUser.isPresent()) {
            throw new UserAlreadyExistsException("User with this username or email already exists");
        }

        User user = userRepository.save(userMapper.CreateUserRequestToUser(userRequest));
        System.out.println(user);
        return userMapper.UserToUserResponse(user);
    }

    public UserResponse getById(UUID id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new UserNotFoundException("Does not exist a user with id " + id);
        }
        return userMapper.UserToUserResponse(user.get());
    }
}
