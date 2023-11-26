package hu.meiit.fistapp.service;

import hu.meiit.fistapp.repository.StudentAccount;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class StudentAccountVO {
    @Id
    @GeneratedValue
    private final Long id;
    private final String NeptuneCode;
    private final Long Password;

    public  StudentAccount toEntity(){return new StudentAccount(id,NeptuneCode,Password);}

}
