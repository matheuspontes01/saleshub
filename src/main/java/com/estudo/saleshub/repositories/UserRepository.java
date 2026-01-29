package com.estudo.saleshub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.saleshub.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
