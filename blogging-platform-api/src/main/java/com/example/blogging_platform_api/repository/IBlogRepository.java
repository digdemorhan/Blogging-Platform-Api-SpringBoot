package com.example.blogging_platform_api.repository;


import com.example.blogging_platform_api.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IBlogRepository extends JpaRepository<Blog, Long> {

}
