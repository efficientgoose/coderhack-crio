package com.crio.coderHack.repositoryServices;

import java.util.List;

import com.crio.coderHack.dto.User;
import com.crio.coderHack.exceptions.UserNotFoundException;

public class UserRepositoryServiceImpl implements UserRepositoryService{

    @Override
    public User createUser(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
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
    public void deleteUser(String userId) throws UserNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

}
