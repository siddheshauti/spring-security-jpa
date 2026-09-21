package io.javabrains.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.security.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByUsername(String username);
	
}
