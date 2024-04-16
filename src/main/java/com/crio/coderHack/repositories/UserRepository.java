package com.crio.coderHack.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.crio.coderHack.models.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity, String>{

} 
