package com.example.springProject.ToDoApp;


import org.springframework.stereotype.Service;

@Service
public class AuthenticatorService {
    public boolean authenticate(String name, String password){
        return (name.equals("Yashwanth") && password.equals("abcd"));

    }
}
