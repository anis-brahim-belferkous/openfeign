package hu.meiit.fistapp.contoller;

import hu.meiit.fistapp.service.PeopleVO;
import hu.meiit.fistapp.service.StudentAccountVO;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class StudentAccountDto {
    @Id
    @GeneratedValue
    private final Long id;
    private final String NeptuneCode;
    private final Long Password;

    public StudentAccountVO toVO() {
        return new StudentAccountVO(id, NeptuneCode, Password);
    }

}
