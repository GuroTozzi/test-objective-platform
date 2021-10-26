package com.assignment.assignment.data.business.service;

import com.assignment.assignment.data.entity.Login;
import com.assignment.assignment.data.repository.Interface.ILoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private ILoginRepository ILoginRepository;

    public String addNewUser(String username, String password, String email){
        Login login = new Login();
        login.setIdUser(3L);
        login.setEmail(email);
        login.setUsername(username);
        login.setPassword(password);
        ILoginRepository.save(login);
        return "User with username: " + username + " and email: " + email + "added.";
    }
}
