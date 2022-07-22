package com.example.post.Services;

import com.example.post.Entites.User;
import com.example.post.Entites.userRole;
import com.example.post.Repositories.PostRepository;
import com.example.post.Repositories.UserRepository;
import com.example.post.Repositories.userRoleRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class AccountServicesImpl implements AccountServices {
     private  UserRepository userrep;
     private userRoleRepository userrolerepo;
    AccountServicesImpl(UserRepository userrep,userRoleRepository userrolerepo){
      this.userrep=userrep;
      this.userrolerepo=userrolerepo;
    }

    @Override
    public User addNewUser(User user) {
        return userrep.save(user);
    }

    @Override
    public userRole addNewRole(userRole userrole) {
        return userrolerepo.save(userrole);
    }

    @Override
    public void addRoleToUser(User user, userRole userrole) {

    }

    @Override
    public User loadUserByUserneme(String username) {
        return null;
    }

    @Override
    public List<User> listuser() {
        return null;
    }
}
