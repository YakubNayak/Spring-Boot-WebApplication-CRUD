package com.web.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
