package com.example.post.controller;

import com.example.post.Entites.*;
import com.example.post.Helper.ExcelHelper;
import com.example.post.Services.*;
import com.example.post.message.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@CrossOrigin("*")
@RestController

public class PostController {
    @Autowired
    PostService postService;

    // select of all product
    @GetMapping("/listposts")
    public List<Post> getPosts() {
        return postService.getPosts();
    }

    // the post
    @GetMapping("/listposts/{id}")
    public Post getPost(@PathVariable Long id) {
        return postService.getPost(id);
    }

    // add the post
    @PostMapping(value = "/listposts")
    public void save(@RequestBody Post post) {
        postService.savePost(post);
    }

    @PostMapping("/listposts/upload")
    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
        String message = "";
        if (ExcelHelper.hasExcelFormat(file)) {
            try {
                postService.savefile(file);
                message = "Uploaded the file successfully: " + file.getOriginalFilename();
                return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
            } catch (Exception e) {
                message = e.toString();
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
            }
        }
        message = "Please upload an excel file!";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
    }

    //delete the post
    @DeleteMapping("/listposts/{id}")
    public void delete(@PathVariable Long id) {
        postService.deletePost(id);
    }

    //update the post
    @PutMapping("/listposts/{id}")
    public void update(@PathVariable Long id, @RequestBody Post post) {
        postService.updatePost(post, id);
    }


}
