package com.sikar.tamilSchool.controller;

import com.sikar.tamilSchool.Service.CourseManagementService;
import com.sikar.tamilSchool.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseManagementController {
    // path paremeter -> to identify your resource
//    query param -> filter your resource
    // CRUD
//    List<Course> studentList = new ArrayList<>();
    @Autowired
    CourseManagementService courseManagementService;

    @PostMapping("/course")
    ResponseEntity<Course> createCourse(@RequestBody Course course) {
      return new ResponseEntity<>(courseManagementService.createCourse(course), HttpStatus.CREATED);
    }

    @GetMapping("/course/{id}")
    ResponseEntity<Course> getCourse(@PathVariable Long id) {
        return new ResponseEntity<>(courseManagementService.getCourse(id), HttpStatus.OK);
    }

    @GetMapping("/courses")
    ResponseEntity<List<Course>> getCourses() {
        return new ResponseEntity<>(courseManagementService.getCourses(), HttpStatus.OK);
    }
}
