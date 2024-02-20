package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.Post;
import com.api.service.PostService;


@RestController
public class PostController {

	@Autowired
	private PostService postService;
	
	@PostMapping("/savePost")
	public Post savePost(@RequestBody Post post) throws Exception {
		
		Post postObj = null;
		
		if(post.getPostId()!=null && post.getPostName()!=null) {
			if(postService.fetchPostById(post.getPostId())!=null) {
				throw new Exception("Post Office is already Registered !!!");
			}
			
			postObj = postService.savePost(post);
		}
		
		return postObj;
	}
	
	@GetMapping("/getAllPost/districtID={districtId}")
	public List<Post> getAllPost(@PathVariable String districtId) {
		return postService.fetchAllPostByDisrtrictId(districtId);
	}
}
