package com.example.demo.domain.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Memo implements Serializable{
    @Id
    private Integer id;
    private String title;
    private String description;
}
