package com.crio.coderHack.repositoryServices;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crio.coderHack.dto.User;
import com.crio.coderHack.exceptions.UserNotFoundException;

@Service
public class UserRepositoryServiceImpl implements UserRepositoryService{

    @Override
    public User createUser(String username) {
        return null;
    }

    @Override
    public User updateScore(String userId, int score) throws UserNotFoundException {
        return null;
    }

    @Override
    public User findUser(String userId) throws UserNotFoundException {
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(String userId) throws UserNotFoundException {
        
    }

}
