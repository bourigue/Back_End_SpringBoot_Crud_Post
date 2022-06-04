package com.example.post.Entites;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="p1",types = Post.class)
public interface PostProjection {

    public String getImage();
    public Long getUserId();
    public Long getId();
}
