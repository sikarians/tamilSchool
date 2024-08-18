package com.sikar.tamilSchool.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import javax.sql.rowset.serial.SerialException;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "StudentTable")
public class Student implements Serializable {
    @Id
    private Long id;
    private String name;
}
