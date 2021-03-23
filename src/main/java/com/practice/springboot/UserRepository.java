package com.practice.springboot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class UserRepository implements CrudRepository<User,Long> {

}
