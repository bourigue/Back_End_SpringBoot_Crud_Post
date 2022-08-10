package com.example.post.Services;

import com.example.post.Entites.User;
import com.example.post.Entites.userRole;
import com.example.post.Repositories.PostRepository;
import com.example.post.Repositories.UserRepository;
import com.example.post.Repositories.userRoleRepository;
import org.apache.poi.hssf.record.PasswordRecord;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class AccountServicesImpl implements AccountServices {
    private UserRepository userrep;
    private userRoleRepository userrolerepo;

    AccountServicesImpl(UserRepository userrep, userRoleRepository userrolerepo) {
        this.userrep = userrep;
        this.userrolerepo = userrolerepo;
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
    public void addRoleToUser(String username, String rolename) {
        User user = userrep.findByName(username);
        userRole userrole = userrolerepo.findByRolename(rolename);
        user.getUseroles().add(userrole);
    }

    @Override
    public User loadUserByUserneme(String username) {
        return userrep.findByName(username);
    }

    @Override
    public List<User> listuser() {
        return userrep.findAll();
    }
}
