package hu.meiit.fistapp.contoller;
//pepoledto Data for people

// each object has 3 levels controllers and service  and repository

import hu.meiit.fistapp.service.PeopleVO;
import lombok.Data;

import java.util.Objects;
@Data // we don't need to generate getter setters tostrings ....
public class PeopleDto {
    private final Long id;
    private final String name;
    private final int age;

    public PeopleVO toVO() {
        return new PeopleVO(id, name, age);
    }


}
