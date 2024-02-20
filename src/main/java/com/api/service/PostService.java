package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entities.Post;
import com.api.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public Post fetchPostById(String id) {
		return postRepository.findByPostId(id);
	}
	
	public Post fetchPostByName(String name) {
		return postRepository.findByPostName(name);
	}
	
	public Post savePost(Post post) {
		return postRepository.save(post);
	}
	
	public List<Post> fetchAllPostByDisrtrictId(String id){
		return postRepository.findAllPostByDistrictId(id);
	}
}
