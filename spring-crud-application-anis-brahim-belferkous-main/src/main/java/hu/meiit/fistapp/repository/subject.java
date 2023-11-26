package hu.meiit.fistapp.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class subject {

    @Id
    @GeneratedValue
    private Long id;
    private Integer credits;
    private String name;

    private String teacher;
    private String faculty;
    private String description;

}
