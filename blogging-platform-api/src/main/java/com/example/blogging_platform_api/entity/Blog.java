package com.example.blogging_platform_api.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="posts")
@Data
public class Blog extends BaseEntity{

    @Id
    @SequenceGenerator(name="post_seq_gen", sequenceName = "post_gen", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_seq_gen")
    @Column(name = "ID")
    private Long id;
    @Column(name="KİŞİ", length = 100)
    private String author;
    @Column(name="BAŞLIK", length = 50)
    private String title;
    @Column(name = "İÇERİK", length = 300)
    private String content;
    @Column(name = "KATEGORİ", length = 50)
    private String category;

}
