package com.shad.Getting_Started_with_MongoDB.repository;

import com.shad.Getting_Started_with_MongoDB.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface ExpenseRepository extends MongoRepository<Expense, String>{
    // Example ::   @Query("{'name': ?0, 'amount': ?1}")
    @Query("{'name': ?0}")
    Optional<Expense> findByName(String name);
}
