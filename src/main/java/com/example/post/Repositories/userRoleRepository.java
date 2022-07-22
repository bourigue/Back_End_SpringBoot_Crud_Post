package com.example.post.Repositories;

import com.example.post.Entites.User;
import com.example.post.Entites.userRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRoleRepository extends JpaRepository<userRole, Long> {

    userRole findByRolename(String name);


}