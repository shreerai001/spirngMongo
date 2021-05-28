package com.example.springbootmongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document
public class Student {

    @Id
    @Field("_id")
    private String id;
    private String name;
    private String grade;
}
