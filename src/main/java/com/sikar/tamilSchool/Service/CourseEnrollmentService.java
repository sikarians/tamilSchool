package com.sikar.tamilSchool.Service;

import com.sikar.tamilSchool.exception.CourseNotFoundException;
import com.sikar.tamilSchool.model.Course;
import com.sikar.tamilSchool.model.Enrollment;
import com.sikar.tamilSchool.repos.CourseEnrollmentRepository;
import com.sikar.tamilSchool.repos.CourseManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseEnrollmentService {
    @Autowired
    CourseEnrollmentRepository courseEnrollmentRepository;

    public Enrollment enrollCourse(Enrollment enrollment)
    {
        return courseEnrollmentRepository.save(enrollment);
    }

//    public List<Enrollment> getCourseEnrollments(Long studentId) {
//        Optional<Course> course = courseEnrollmentRepository.findById(id);
//
//        if (course.isPresent()) {
//            return course.get();
//        }
//       throw new CourseNotFoundException("Course not found for the id " + id);
//    }
}