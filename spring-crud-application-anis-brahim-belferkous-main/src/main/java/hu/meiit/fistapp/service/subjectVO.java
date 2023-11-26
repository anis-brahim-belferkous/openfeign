package hu.meiit.fistapp.service;

import hu.meiit.fistapp.repository.subject;
import lombok.Data;

@Data
public class subjectVO {
    private final Long id;
    private final Integer credits;
    private final String name;
    private final String teacher;
    private final String faculty;
    private final String description;

    public subject toEntity(){ return  new subject(id,credits,name,teacher,faculty,description); }
}
