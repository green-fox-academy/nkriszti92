package com.greenox.reddit.services;

import com.greenox.reddit.models.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPost();

    Post getPostById(Long id);

    void saveNewPost(Post post);

    void upScore(Post post);

    void downScore(Post post);

    void deletePost(Long id);

    void updatePost(Post postToUpdate, Long id);
}
