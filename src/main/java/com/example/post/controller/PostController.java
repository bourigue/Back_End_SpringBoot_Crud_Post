package com.example.post.controller;

import com.example.post.Entites.Post;
import com.example.post.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostService postService;

// select of all product
    @GetMapping("/posts")
    public List<Post> getPosts(){
        return postService.getPosts();
    }
// add the post
    @PostMapping(value = "/posts")
    public void save(@RequestBody Post post){
        postService.savePost(post);
    }
//update the post
    @Dele

}
