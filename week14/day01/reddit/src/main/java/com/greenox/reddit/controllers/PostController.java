package com.greenox.reddit.controllers;

import com.greenox.reddit.models.Post;
import com.greenox.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postService.getAllPost();
    }

    @PostMapping("posts")
    public List<Post> addPost(@RequestBody Post newPost) {
        postService.saveNewPost(newPost);
        return postService.getAllPost();
    }

    @PutMapping("/posts/{id}/upvote")
    public List<Post> upvote(@PathVariable(name = "id") Long id) {
        postService.upScore(postService.getPostById(id));
        return postService.getAllPost();
    }

    @PutMapping("/posts/{id}/downvote")
    public List<Post> downvote(@PathVariable(name = "id") Long id) {
        postService.downScore(postService.getPostById(id));
        return postService.getAllPost();
    }

    @DeleteMapping("/posts/{id}")
    public List<Post> delete(@PathVariable(name = "id") Long id) {
        postService.deletePost(id);
        return postService.getAllPost();
    }

    @PutMapping("/posts/{id}")
    public List<Post> updatePost(@RequestBody Post postToUpdate,
                                 @PathVariable Long id) {
        postService.updatePost(postToUpdate, id);
        return postService.getAllPost();
    }
}
