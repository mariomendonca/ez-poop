package com.ezpoop.ezpoopbackend.services;

import com.ezpoop.ezpoopbackend.domains.entities.User;
import com.ezpoop.ezpoopbackend.exceptions.UserAlreadyExistsException;
import com.ezpoop.ezpoopbackend.exceptions.UserNotFoundException;
import com.ezpoop.ezpoopbackend.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public User createUser(User user) {
        Optional<User> existentUser = userRepository.findByUsernameOrEmail(user.getUsername(), user.getEmail());
        if (existentUser.isPresent()) {
            throw new UserAlreadyExistsException("User with this username or email already exists");
        }


        return userRepository.save(user);
    }

    public User getById(UUID id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new UserNotFoundException("Does not exist a user with id " + id);
        }

        return user.get();
    }
}
