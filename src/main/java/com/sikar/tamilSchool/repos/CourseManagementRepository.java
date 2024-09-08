package com.sikar.tamilSchool.repos;

import com.sikar.tamilSchool.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseManagementRepository extends JpaRepository<Course, Long> {

//    @Modifying
//    @Query("update StudentTable st set st.name = ?2 where st.id = ?1")
//    // HQA -> hibernet query language
//    void updateName(Long id, String firstname);

}