package com.williamoliveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamoliveira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
