package com.example.post.Repositories;

import com.example.post.Entites.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

// spec
@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource
public interface PostRepository extends JpaRepository<Post, Long> {


//@RestResource(path = "/ByDescriptionPage")
    //public List<Post> findByDescriptionContains(@Param("mc") String mc);
}
