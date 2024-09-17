package com.example.blogging_platform_api.dto;

import lombok.Data;

@Data
public class BlogDto {
    private String author;
    private String title;
    private String content;
    private String category;
}
