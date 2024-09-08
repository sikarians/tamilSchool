package com.sikar.tamilSchool.repos;

import com.sikar.tamilSchool.model.Course;
import com.sikar.tamilSchool.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseEnrollmentRepository extends JpaRepository<Enrollment, Long> {

}