package com.example.thebank.service;

import com.example.thebank.models.Post;
import com.example.thebank.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{

    private UserRepository userRepository;

    public EmpServiceImpl(UserRepository employeeRepository) {
        this.userRepository = employeeRepository;
    }

    @Override
    public List<Post> getAllEmp() {
        return (List<Post>) userRepository.findAll();
    }

    @Override
    public Post saveEmp(Post employee) {
        return userRepository.save(employee);
    }

    @Override
    public Post getEmpById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public Post updateEmp(Post employee) {
        return userRepository.save(employee);
    }


    @Override
    public void deleteEmpById(Long id) {
        userRepository.deleteById(id);
    }
}
