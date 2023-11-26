package hu.meiit.fistapp.contoller;

import hu.meiit.fistapp.service.StudentVO;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class StudentDto {
    @Id
    @GeneratedValue
    private final Long id;
    private final String FullName;
    private final String Speciality;
    private final Long studentID;
    private final Integer Gpa;

    public StudentVO toVO() { return new StudentVO(id, FullName, Speciality, studentID, Gpa); }
}
