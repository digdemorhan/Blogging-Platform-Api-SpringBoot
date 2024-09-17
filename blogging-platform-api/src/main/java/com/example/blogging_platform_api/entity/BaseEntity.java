package com.example.blogging_platform_api.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseEntity implements Serializable {

    private Date createdDate;
    private String createdBy;
    private Date updatedDate;
    private String updatedBy;
}
