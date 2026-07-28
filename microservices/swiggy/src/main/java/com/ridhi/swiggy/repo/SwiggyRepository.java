package com.ridhi.swiggy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ridhi.swiggy.entity.User;

@Repository
public interface SwiggyRepository extends JpaRepository<User, Long> {

}