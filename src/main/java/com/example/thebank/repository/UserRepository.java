package com.example.thebank.repository;

import com.example.thebank.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Post, Long> {
}
