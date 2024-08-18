package com.sikar.tamilSchool.repos;

import com.sikar.tamilSchool.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

//    @Modifying
//    @Query("update StudentTable st set st.name = ?2 where st.id = ?1")
//    // HQA -> hibernet query language
//    void updateName(Long id, String firstname);

}