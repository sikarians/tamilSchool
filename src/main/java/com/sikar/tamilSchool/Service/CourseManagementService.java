package com.sikar.tamilSchool.Service;

import com.sikar.tamilSchool.exception.CourseNotFoundException;
import com.sikar.tamilSchool.model.Course;
import com.sikar.tamilSchool.repos.CourseManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseManagementService {
    @Autowired
    CourseManagementRepository courseManagementRepository;

    public Course createCourse(Course course)
    {
        return courseManagementRepository.save(course);
    }

    public Course getCourse(Long id) {
        Optional<Course> course = courseManagementRepository.findById(id);
        if (course.isPresent()) {
            return course.get();
        }
       throw new CourseNotFoundException("Course not found for the id " + id);
    }

    public List<Course> getCourses() {
        return courseManagementRepository.findAll();
    }
}