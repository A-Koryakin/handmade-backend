package ru.bstu.ieitus.handmade_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bstu.ieitus.handmade_backend.entity.domain.User;
import ru.bstu.ieitus.handmade_backend.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new RuntimeException("Пользователь с id="+id+" не найден"));
    }

    public User signUpUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    public User updateUser(User user){
        User updatedUser = userRepository.findById(user.getId()).orElseThrow(() -> new RuntimeException("Пользователь не найден"));

        updatedUser.setName(user.getName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setLogin(user.getLogin());
        updatedUser.setPassword(user.getPassword());
        updatedUser.setRole(user.getRole());
        updatedUser.setIsMaster(user.getIsMaster());
        updatedUser.setNote(user.getNote());
        updatedUser.setAbout(user.getAbout());
        updatedUser.setAvatar(user.getAvatar());

        return userRepository.save(updatedUser);
    }
}
