package com.example.post.Services;

import com.example.post.Entites.*;
import com.example.post.Helper.ExcelHelper;
import com.example.post.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
 @Autowired
 PostRepository postRepository;
 //select all post
 public  List<Post> getPosts(){
     return postRepository.findAll();
 }
    //select one post
 public  Post getPost(Long id){ return postRepository.findById(id).get(); }
// add the post
 public void savePost(Post post){
     postRepository.save(post);
 }
//delete post
 public void deletePost(Long id){
    postRepository.deleteById(id);
 }
//update the post
public void updatePost(Post post,Long id){ post.setId(id);postRepository.save(post);
}

public Optional<Post> findPostById(Long id){

     return postRepository.findById(id);
    }

//convert data file exel to list ppost
public void savefile(MultipartFile file) {
        try {
            List<Post> posts = ExcelHelper.excelToTutorials(file.getInputStream());
            postRepository.saveAll(posts);
        } catch (IOException e) {
            throw new RuntimeException("fail to store excel data: " + e.getMessage());
        }
    }
    public  List<Post> datafile(MultipartFile file) {
        try {
            List<Post> posts = ExcelHelper.excelToTutorials(file.getInputStream());
            return posts;
        } catch (IOException e) {
            throw new RuntimeException("fail to store excel data: " + e.getMessage());
        }
    }


}
