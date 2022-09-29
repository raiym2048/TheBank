package com.example.thebank.Repository;

import com.example.thebank.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<User, Long> {
}
