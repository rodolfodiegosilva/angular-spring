package com.diego.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.diego.api.model.Course;
import com.diego.api.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")

public class CourseController {

    private CourseRepository courseRepository;
    
    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public List<Course> list(){
        return courseRepository.findAll();
    }
}
