package com.sikar.tamilSchool.Service;

import com.sikar.tamilSchool.model.Enrollment;
import com.sikar.tamilSchool.model.Student;
import com.sikar.tamilSchool.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CourseManagementFeignClient courseManagementFeignClient;

    @Autowired
    RestTemplate restTemplate;

//    WebClient webClient = WebClient.builder().build();

    public void enrollCourse(Enrollment enrollment) {

        courseManagementFeignClient.enrollCourse(enrollment);

//       ResponseEntity<Enrollment> enrollmentPacket = restTemplate
//               .postForEntity("http://course-service/enroll", enrollment, Enrollment.class);
//        System.out.println("Enrollment packet received: " + enrollmentPacket.getBody());
//        System.out.println("do some other work");


//     Enrollment enrollment1 = enrollmentPacket.getBody();

//       Mono<Enrollment> enrollmentMono = webClient.post().uri("http://localhost:9090/enroll")
//                .bodyValue(enrollment)
//                .retrieve()
//                .bodyToMono(Enrollment.class);
//        enrollmentMono.subscribe(System.out::println);
//        System.out.println("do some other work");
//        //
//

    }

    public Student addStudent(Student student)
    {
        return studentRepository.save(student);
    }

    public Student getStudent(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            return student.get();
        }
        return null;
    }

    public List<Student> getAllStudent()
    {
        return studentRepository.findAll();
    }
    public  Student updateValue( long id ,Student student) {
        Optional<Student> studentFromDB = studentRepository.findById(id);
        if (studentFromDB.isPresent()) {
            // un wrapping
            Student student1 = studentFromDB.get();
            student1.setName(student.getName());
            studentRepository.save(student1);
            return student1;
        } else {
            return null;
        }
    }

        public boolean removeStudent ( long id){
            Optional<Student> student = studentRepository.findById(id);
            if (student.isPresent()) {
                studentRepository.deleteById(id);
                return true;
            }
            return false;
        }
}
