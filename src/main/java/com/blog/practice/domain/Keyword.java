package com.blog.practice.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Keyword {

    @Id
    private String keyword;

    private Integer count;
}
