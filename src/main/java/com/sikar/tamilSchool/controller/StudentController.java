package com.sikar.tamilSchool.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
// path paremeter -> to identify your resource
//    query param -> filter your resource

    // CRUD

    List<Student> studentList = new ArrayList<>();

    @PostMapping("/student")
    String createStudent(@RequestBody Student student) {
        studentList.add(student);
        return "student created";
    }

    @GetMapping("/students")
    ResponseEntity<List<Student>> getStudents() {
       return ResponseEntity.status(200).body(studentList);
    }

    @GetMapping("/student/{id}")
    ResponseEntity<Student> getStudent(@PathVariable Long id) {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.id == id) {
                return ResponseEntity.status(200).body(student);
            }
        }

        return ResponseEntity.status(404).body(null);
    }

    @DeleteMapping("/student/{id}")
    ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.id == id) {
                studentList.remove(student);
                return ResponseEntity.status(200).body("student removed: " + student.getName());
            }
        }

        return ResponseEntity.status(404).body("student not foud with that id: " + id);
    }

    @PutMapping("/student")
    ResponseEntity<String> deleteStudent(@RequestBody Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            Student studentFromDB = studentList.get(i);
            if (student.id == studentFromDB.id) {
                studentList.set(i, student);
                return ResponseEntity.status(200).body("student updated: " + student.getName());
            }
        }

        return ResponseEntity.status(404).body("student not foud with that id to update: " + student.getId());
    }

    @GetMapping("/student")
    String getStudent() {
        return "Malai, Raja, ravi";
    }


}

/*
 class DispatchServlet {
 getStudent(1)

 requstMapper

     requestMapper.set("/student", StudentController, getStudent, parameters)

}
*/

