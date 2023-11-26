package hu.meiit.fistapp.service;

import hu.meiit.fistapp.repository.Student;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class StudentVO {
    @Id
    @GeneratedValue
    private final Long id;
    private final String FullName;
    private final String Speciality;
    private final Long studentID;
    private final Integer Gpa;

    public Student toEntity(){return new Student(id, FullName, Speciality, studentID,Gpa);}
}
