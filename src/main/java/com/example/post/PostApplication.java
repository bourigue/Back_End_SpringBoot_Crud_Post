package com.example.post;

import com.example.post.Entites.Post;
import com.example.post.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class PostApplication implements CommandLineRunner {
    @Autowired
   private PostRepository postRepository;

    public static void main(String[] args) {
        SpringApplication.run(PostApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {
   /*     postRepository.save(new Post(null, 2L,"hello RACHID","hello HAMSA"));
        postRepository.save(new Post(null, 3L,"hello ANOUAR ","hello LAHCEN"));
        postRepository.save(new Post(null, 4L,"hello HASSAN","hello gays"));
        postRepository.save(new Post(null, 5L,"hello FATAWI","hello gays"));*/
        postRepository.findAll().forEach(post -> {
            System.out.print(post.getDescription());

        });


    }
}
