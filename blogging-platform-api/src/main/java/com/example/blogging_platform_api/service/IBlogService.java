package com.example.blogging_platform_api.service;


import com.example.blogging_platform_api.dto.BlogDto;
import com.example.blogging_platform_api.entity.Blog;

import java.util.List;

public interface IBlogService {

    BlogDto addPost(BlogDto blog);
    List<BlogDto> getAll();

    BlogDto getBlogById(Long id);

    BlogDto updateBlog(Long id, BlogDto blog);

    Boolean deleteBlog(Long id);
}
