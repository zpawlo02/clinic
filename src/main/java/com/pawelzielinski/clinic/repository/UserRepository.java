package com.pawelzielinski.clinic.repository;

import com.pawelzielinski.clinic.model.User;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAllByFirstName(String firstName);
    User findUserByPesel(String pesel);
}
