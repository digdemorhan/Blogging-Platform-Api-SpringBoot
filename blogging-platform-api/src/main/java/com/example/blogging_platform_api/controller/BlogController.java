package com.example.blogging_platform_api.controller;


import com.example.blogging_platform_api.dto.BlogDto;
import com.example.blogging_platform_api.entity.Blog;
import com.example.blogging_platform_api.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private final IBlogService iBlogService;

    public BlogController(IBlogService iBlogService) {
        this.iBlogService = iBlogService;
    }

    @PostMapping("/add")
    public ResponseEntity<BlogDto> addPost(@RequestBody BlogDto blog){
        BlogDto resultBlog = iBlogService.addPost(blog);
        return ResponseEntity.ok(resultBlog);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<BlogDto>> getBlog(){
        List<BlogDto> resultBlogs = iBlogService.getAll();
        return ResponseEntity.ok(resultBlogs);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<BlogDto> getBlogById(@PathVariable("id") Long id){
        BlogDto getBlog = iBlogService.getBlogById(id);
        return ResponseEntity.ok(getBlog);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<BlogDto> updateBlog(@PathVariable("id") Long id, @RequestBody BlogDto blog){
        BlogDto editBlog = iBlogService.updateBlog(id, blog);
        return ResponseEntity.ok(editBlog);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Boolean> deleteBlog(@PathVariable("id") Long id){
        Boolean stat = iBlogService.deleteBlog(id);
        return ResponseEntity.ok(stat);
    }
}

