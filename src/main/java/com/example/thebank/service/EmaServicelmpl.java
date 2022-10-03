package com.example.thebank.service;

import com.example.thebank.models.User;
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
    public List<User> getAllEma() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User saveEma(User employee) {
        return userRepository.save(employee);
    }

    @Override
    public User getEmaById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User updateEma(User employee) {
        return userRepository.save(employee);
    }


    @Override
    public void deleteEmaById(Long id) {
        userRepository.deleteById(id);
    }
}
