package com.sikar.tamilSchool.controller;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.sql.rowset.serial.SerialException;
import java.io.Serializable;

@Data
@Getter
@Setter
public class Student implements Serializable {
    Long id;
    String name;
}
