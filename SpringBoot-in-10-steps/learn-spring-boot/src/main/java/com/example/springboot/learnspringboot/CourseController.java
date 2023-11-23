package com.example.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// http://localhost:8080/courses
/*
Course: id, name, author
[
    {
        "id": 1,
        "name": "Learn AWS",
        "author": "Carlos Pineda"
    }
]
 */

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(new Course(1, "Learn AWS", "Carlos Pineda"),
                new Course(2, "Learn DevOps", "Carlos Pineda"));
    }

}
