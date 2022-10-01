package com.example.thebank.service;


import com.example.thebank.models.Post;

import java.util.List;

public interface EmpService {
    List<Post> getAllEmp();

    Post saveEmp(Post employee);

    Post getEmpById(Long id);

    Post updateEmp(Post employee);

    void deleteEmpById(Long id);
}
