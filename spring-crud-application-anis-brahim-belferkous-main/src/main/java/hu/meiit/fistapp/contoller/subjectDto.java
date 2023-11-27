package hu.meiit.fistapp.contoller;

import hu.meiit.fistapp.repository.subject;
import hu.meiit.fistapp.service.subjectVO;
import lombok.Data;

import java.util.Objects;

@Data
public class subjectDto {

    private final Long id;
    private final Integer credits;
    private final String name;
    private final String teacher;
    private final String faculty;
    private final String description;

    @Override
    public String toString() {
        return "subjectDto{" +
                "id=" + id +
                ", credits=" + credits +
                ", name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", faculty='" + faculty + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof subjectDto that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getCredits(), that.getCredits()) && Objects.equals(getName(), that.getName()) && Objects.equals(getTeacher(), that.getTeacher()) && Objects.equals(getFaculty(), that.getFaculty()) && Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCredits(), getName(), getTeacher(), getFaculty(), getDescription());
    }

    public subjectVO toVO(){return new subjectVO(id,credits,name,teacher,faculty,description);}
}
