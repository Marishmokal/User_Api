package com.prowings.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prowings.model.User;
@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}
