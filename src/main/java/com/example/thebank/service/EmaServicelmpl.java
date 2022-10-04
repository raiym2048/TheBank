package com.example.thebank.service;

import com.example.thebank.models.User1;
import com.example.thebank.repository.EmailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmaServicelmpl implements EmaService{

    private EmailRepository userRepository;

    public EmaServicelmpl(EmailRepository employeeRepository) {
        this.userRepository = employeeRepository;
    }

    @Override
    public List<User1> getAllEma() {
        return (List<User1>) userRepository.findAll();
    }

    @Override
    public User1 saveEma(User1 employee) {
        return userRepository.save(employee);
    }

    @Override
    public User1 getEmaById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User1 updateEma(User1 employee) {
        return userRepository.save(employee);
    }


    @Override
    public void deleteEmaById(Long id) {
        userRepository.deleteById(id);
    }
}
