package com.greenox.reddit.services;

import com.greenox.reddit.models.Post;
import com.greenox.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl ( PostRepository postRepository ) {
        this.postRepository =postRepository;
        postRepository.save(new Post("Dear JavaScript", "http://9gag.com", 1243L, null, "1"));
        postRepository.save(new Post("Crockford", "http://9gag.com", 10243L, "kristof4", "-1"));
        postRepository.save(new Post("Facebook", "http://facebook.com", 100243L, "zuckerberg", "1"));
    }

    public List<Post> getAllPost() {
        return (List<Post>) postRepository.findAll();
    }

    public void saveNewPost( Post post) {
        postRepository.save(post);
    }

    public Post getPostById(Long id) {
        return postRepository.findPostById(id);
    }

    public void upScore(Post post) {
        post.setScore(post.getScore()+1);
        postRepository.save(post);
    }

    public void downScore(Post post) {
        post.setScore(post.getScore()-1);
        postRepository.save(post);
    }

    public void deletePost(Long id) {
        postRepository.delete(postRepository.findPostById(id));
    }

    public void updatePost(Post postToUpdate, Long id) {
        Post post = postRepository.findPostById(id);
        post.setTitle(postToUpdate.getTitle());
        post.setUrl(postToUpdate.getUrl());
        postRepository.save(post);
    }
}
