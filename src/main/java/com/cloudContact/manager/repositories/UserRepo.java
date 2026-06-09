package com.cloudContact.manager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloudContact.manager.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{

}
