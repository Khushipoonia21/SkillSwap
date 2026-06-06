package com.skillswap.skillswap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skillswap.skillswap.entity.User;
import com.skillswap.skillswap.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
    return userRepository.findById(id).orElse(null);
}

    public void deleteUser(Long id) {
    userRepository.deleteById(id);
}
    
    public User updateUser(Long id, User updatedUser) {

    User existingUser = userRepository.findById(id).orElse(null);

    if (existingUser != null) {
        existingUser.setName(updatedUser.getName());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPassword(updatedUser.getPassword());
        existingUser.setSkillsOffered(updatedUser.getSkillsOffered());
        existingUser.setSkillsWanted(updatedUser.getSkillsWanted());

        return userRepository.save(existingUser);
    }

    return null;
}
}