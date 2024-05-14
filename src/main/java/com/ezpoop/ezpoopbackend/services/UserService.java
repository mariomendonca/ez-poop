package com.ezpoop.ezpoopbackend.services;

import com.ezpoop.ezpoopbackend.domains.entities.User;
import com.ezpoop.ezpoopbackend.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
