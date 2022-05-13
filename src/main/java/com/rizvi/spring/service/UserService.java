package com.rizvi.spring.service;


import com.rizvi.spring.domain.Role;
import com.rizvi.spring.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User>getUsers();
}
