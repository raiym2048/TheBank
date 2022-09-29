package com.example.thebank.service;

import com.example.thebank.Models.User;
import com.example.thebank.Repository.Repository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{

    private Repository postRepository;

    public EmpServiceImpl(Repository employeeRepository) {
        this.postRepository = employeeRepository;
    }

    @Override
    public List<User> getAllEmp() {
        return (List<User>) postRepository.findAll();
    }

    @Override
    public User saveEmp(User employee) {
        return postRepository.save(employee);
    }

    @Override
    public User getEmpById(Long id) {
        return postRepository.findById(id).get();
    }

    @Override
    public User updateEmp(User employee) {
        return postRepository.save(employee);
    }


    @Override
    public void deleteEmpById(Long id) {
        postRepository.deleteById(id);
    }
}
