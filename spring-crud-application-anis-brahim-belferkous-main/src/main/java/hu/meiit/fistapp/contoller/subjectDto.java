package hu.meiit.fistapp.contoller;

import hu.meiit.fistapp.repository.subject;
import hu.meiit.fistapp.service.subjectVO;
import lombok.Data;

@Data
public class subjectDto {

    private final Long id;
    private final Integer credits;
    private final String name;
    private final String teacher;
    private final String faculty;
    private final String description;

    public subjectVO toVO(){return new subjectVO(id,credits,name,teacher,faculty,description);}
}
