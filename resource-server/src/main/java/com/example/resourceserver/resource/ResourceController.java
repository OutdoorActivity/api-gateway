package com.example.resourceserver.resource;

import com.example.resourceserver.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/resource")
public class ResourceController {
    @GetMapping
    public String getAccess() {
        return "Вы успешно авторизованы";
    }

    @GetMapping("/info")
    public String getResource() {
        return "info";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return List.of(new User(1, "Vasya", "1234567", 7919333334L),
                new User(2, "Petya", "12345617", 7919555534L),
                new User(3, "Zhenya", "1234213567", 7919666634L));
    }

}