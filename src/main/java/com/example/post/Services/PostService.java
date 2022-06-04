package com.example.post.Services;

import com.example.post.Entites.Post;
import com.example.post.Repositories.PostRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class PostService {
 @Autowired
 PostRepository postRepository;
 //select all product
 public  List<Post> getPosts(){
     return postRepository.findAll();
 }
// add the post
 public void savePost(Post post){
     postRepository.save(post);
 }
//delete post
 public void deletePost(Long id){
    postRepository.deleteById(id);
 }
//update the post
public void updatePost(Post post,Long id){
    post.setId(id);
     postRepository.save(post);
}




}
