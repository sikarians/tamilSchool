package com.sikar.tamilSchool.Service;

import com.sikar.tamilSchool.model.Enrollment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("course-service")
public interface CourseManagementFeignClient {
    @PostMapping("/enroll")
    ResponseEntity<Enrollment> enrollCourse(@RequestBody Enrollment enrollment);
}
