package com.sikar.tamilSchool.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Generated;

import javax.sql.rowset.serial.SerialException;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student_table")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
