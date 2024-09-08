package com.sikar.tamilSchool.repos;

import com.sikar.tamilSchool.model.Employee;
import com.sikar.tamilSchool.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//    @Modifying
//    @Query("update StudentTable st set st.name = ?2 where st.id = ?1")
//    // HQA -> hibernet query language
//    void updateName(Long id, String firstname);

}