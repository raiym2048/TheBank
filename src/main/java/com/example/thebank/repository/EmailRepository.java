package com.example.thebank.repository;

import com.example.thebank.models.User1;
import org.springframework.data.repository.CrudRepository;

public interface EmailRepository extends CrudRepository<User1, Long> {
}
