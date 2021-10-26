package com.assignment.assignment.data.business.service;

import com.assignment.assignment.data.entity.User;
import com.assignment.assignment.data.repository.Interface.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository IUserRepository;

    public Iterable<User> getUsers(){
        return IUserRepository.findAll();
    }

    public Iterable<User> getUsersByIdUser(Long id){
        return IUserRepository.findUserByIdUser(id);
    }

    public String updateNameUser(String name, Long id){
        int rowsUpdated = IUserRepository.updateUserName(name, id);
        return "Rows updated: " + rowsUpdated + ".";
    }

    public void addNewUser(User user){
        IUserRepository.save(user);
    }
}
