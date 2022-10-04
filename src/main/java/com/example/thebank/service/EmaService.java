package com.example.thebank.service;


import com.example.thebank.models.User1;

import java.util.List;

public interface EmaService {
    List<User1> getAllEma();

    User1 saveEma(User1 employee);

    User1 getEmaById(Long id);

    User1 updateEma(User1 employee);

    void deleteEmaById(Long id);
}
