package com.example.thebank.service;


import com.example.thebank.models.Post;
import com.example.thebank.models.User;

import java.util.List;

public interface EmaService {
    List<User> getAllEma();

    User saveEma(User employee);

    User getEmaById(Long id);

    User updateEma(User employee);

    void deleteEmaById(Long id);
}
