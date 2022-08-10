package com.example.post;

import com.example.post.Entites.Post;
import com.example.post.Entites.User;
import com.example.post.Entites.userRole;
import com.example.post.Repositories.PostRepository;
import com.example.post.Services.AccountServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import java.sql.SQLOutput;

@SpringBootApplication
public class PostApplication implements CommandLineRunner {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private AccountServicesImpl accountServicesImpl;

    public static void main(String[] args) {
        SpringApplication.run(PostApplication.class, args);

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Override
    public void run(String... args) throws Exception {
   /*     postRepository.save(new Post(null, 2L,"hello RACHID","hello HAMSA"));
        postRepository.save(new Post(null, 3L,"hello ANOUAR ","hello LAHCEN"));
        postRepository.save(new Post(null, 4L,"hello HASSAN","hello gays"));
        postRepository.save(new Post(null, 5L,"hello FATAWI","hello gays"));*/
        // accountServicesImpl.addNewRole(new userRole(null,"user"));

        // accountServicesImpl.addNewUser(new User(null,"hassan","maloki","hamid",7,null));
        //accountServicesImpl.addRoleToUser("hassan","user");
        // accountServicesImpl.addRoleToUser("bourigue","admin");
        accountServicesImpl.listuser().forEach(post -> {
            System.out.print(post.getUseroles());

        });


    }
}
