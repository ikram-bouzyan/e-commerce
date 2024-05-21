package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.entities.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {

}
