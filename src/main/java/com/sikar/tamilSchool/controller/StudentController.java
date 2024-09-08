package com.sikar.tamilSchool.controller;

import com.sikar.tamilSchool.Service.StudentService;
import com.sikar.tamilSchool.model.Student;
import com.sikar.tamilSchool.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {
    // path paremeter -> to identify your resource
//    query param -> filter your resource
    // CRUD
//    List<Student> studentList = new ArrayList<>();
    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return ResponseEntity.status(200).body(studentService.addStudent(student));
    }

    @GetMapping("/students")
    ResponseEntity<Iterable<Student>> getStudents() {
        return ResponseEntity.status(200).body(studentService.getAllStudent());
    }

    @GetMapping("/student/{id}")
    ResponseEntity<Student> getStudent(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudent(id));
    }

    @DeleteMapping("/student/{id}")
    ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        if (studentService.removeStudent(id)) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body("student removed with Id: " + id);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("student not foud with that id: " + id);
        }
    }

    @PutMapping("/student")
    ResponseEntity<Student> putStudent(@RequestBody Student student) {
        Student updatedStudent = studentService.updateValue(student.getId(), student);
        if ((updatedStudent != null)) {
            return ResponseEntity.ok(updatedStudent);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
