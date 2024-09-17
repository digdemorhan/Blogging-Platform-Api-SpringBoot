package com.example.blogging_platform_api.service.impl;


import com.example.blogging_platform_api.dto.BlogDto;
import com.example.blogging_platform_api.entity.Blog;
import com.example.blogging_platform_api.repository.IBlogRepository;
import com.example.blogging_platform_api.service.IBlogService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BlogServiceImpl implements IBlogService {

    private final IBlogRepository iBlogRepository;
    private final ModelMapper modelMapper;

    @Override
    public BlogDto addPost(BlogDto blogDto) {
        Blog blog = modelMapper.map(blogDto, Blog.class);
        blog.setCreatedDate(new Date());
        blog.setCreatedBy("Admin");
        return modelMapper.map(iBlogRepository.save(blog), BlogDto.class);
    }

    @Override
    public List<BlogDto> getAll() {
        List<Blog> blogs = iBlogRepository.findAll();
        List<BlogDto> dtos = blogs.stream().map(blog -> modelMapper.map(blog, BlogDto.class)).collect(Collectors.toList());
        return dtos;
    }

    @Override
    public BlogDto getBlogById(Long id) {
        Optional<Blog> blog = iBlogRepository.findById(id);
        if(blog.isPresent()){
            return modelMapper.map(blog.get(), BlogDto.class);
        }
        return null;
    }

    @Override
    public BlogDto updateBlog(Long id, BlogDto blog) {
        Optional<Blog> resultBlog = iBlogRepository.findById(id);
        if(resultBlog.isPresent()){
            resultBlog.get().setAuthor(blog.getAuthor());
            resultBlog.get().setTitle(blog.getTitle());
            resultBlog.get().setContent(blog.getContent());
            resultBlog.get().setCategory(blog.getCategory());
            resultBlog.get().setUpdatedDate(new Date());
            resultBlog.get().setUpdatedBy("Admin");
            return modelMapper.map(iBlogRepository.save(resultBlog.get()), BlogDto.class);
        }
        return null;
    }

    @Override
    public Boolean deleteBlog(Long id) {
        Optional<Blog> delBlog = iBlogRepository.findById(id);
        if(delBlog.isPresent()){
            iBlogRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
