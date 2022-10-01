package com.example.thebank.service;

import com.example.thebank.models.Post;
import com.example.thebank.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{

    private PostRepository postRepository;

    public EmpServiceImpl(PostRepository employeeRepository) {
        this.postRepository = employeeRepository;
    }

    @Override
    public List<Post> getAllEmp() {
        return (List<Post>) postRepository.findAll();
    }

    @Override
    public Post saveEmp(Post employee) {
        return postRepository.save(employee);
    }

    @Override
    public Post getEmpById(Long id) {
        return postRepository.findById(id).get();
    }

    @Override
    public Post updateEmp(Post employee) {
        return postRepository.save(employee);
    }


    @Override
    public void deleteEmpById(Long id) {
        postRepository.deleteById(id);
    }
}
