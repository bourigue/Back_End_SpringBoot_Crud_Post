package com.example.post.Repositories;
import com.example.post.Entites.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {

}
