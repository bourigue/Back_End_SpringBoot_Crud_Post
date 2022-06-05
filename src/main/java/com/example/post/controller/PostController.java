package com.example.post.controller;

import com.example.post.Entites.Post;
import com.example.post.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostService postService;

// select of all product
    @GetMapping("/listposts")
    public List<Post> getPosts(){
        return postService.getPosts();
    }
    // the post
    @GetMapping("/listposts/{id}")
    public Post getPost(@PathVariable Long id){
       return postService.getPost(id);
    }
// add the post
    @PostMapping(value = "/listposts")
    public void save(@RequestBody Post post){
        postService.savePost(post);
    }

//delete the post
    @DeleteMapping("/listposts/{id}")
    public void delete(@PathVariable Long id){
        postService.deletePost(id);
    }
//update the post
    @PutMapping("/listposts/{id}")
    public void update(@PathVariable Long id,@RequestBody Post post){
        postService.updatePost(post,id);
    }

}
