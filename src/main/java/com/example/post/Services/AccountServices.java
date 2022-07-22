package com.example.post.Services;

import com.example.post.Entites.User;
import com.example.post.Entites.userRole;

import java.util.List;

public interface AccountServices {
    User addNewUser(User user);
    userRole addNewRole(userRole userrole);
    void addRoleToUser(User user,userRole userrole);
    User loadUserByUserneme(String username);
    List<User> listuser();
}
