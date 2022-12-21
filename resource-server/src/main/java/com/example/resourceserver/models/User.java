package com.example.resourceserver.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.lang.annotation.Documented;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {
    private Integer id;
    private String username;
    private String password;
    private Long phoneNumber;


}
