package hu.meiit.fistapp.service;

import hu.meiit.fistapp.repository.People;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class PeopleVO {
    @Id
    @GeneratedValue
    private  final Long id;
    private final String name;
    private final int age;

    public People toEntity() {
        return new People(id, name, age);
    }

}

