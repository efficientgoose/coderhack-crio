package com.crio.coderHack.services;

import java.util.List;

import com.crio.coderHack.dto.User;
import com.crio.coderHack.exceptions.UserNotFoundException;

public class UserServiceImpl implements UserService{

    @Override
    public User registerUser(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerUser'");
    }

    @Override
    public User updateScore(String userId, int score) throws UserNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateScore'");
    }

    @Override
    public User findUser(String userId) throws UserNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUser'");
    }

    @Override
    public List<User> findAllUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllUsers'");
    }

    @Override
    public void deregisterUser(String userId) throws UserNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deregisterUser'");
    }

    
}
