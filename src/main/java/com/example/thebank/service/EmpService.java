package com.example.thebank.service;


import com.example.thebank.Models.User;

import java.util.List;

public interface EmpService {
    List<User> getAllEmp();

    User saveEmp(User employee);

    User getEmpById(Long id);

    User updateEmp(User employee);

    void deleteEmpById(Long id);
}
