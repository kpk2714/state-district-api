package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

	public Post findByPostId(String id);
	public Post findByPostName(String name);
	public List<Post> findAllPostByDistrictId(String id);
}
