package com.Rafael.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rafael.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
