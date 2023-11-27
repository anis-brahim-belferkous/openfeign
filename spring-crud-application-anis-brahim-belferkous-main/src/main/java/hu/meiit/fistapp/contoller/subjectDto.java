package hu.meiit.fistapp.contoller;

import hu.meiit.fistapp.service.subjectVO;
import lombok.Data;

import java.util.Objects;

/**
 * The type Subject dto.
 */
@Data
public class subjectDto {

    private  Long id;
    private  Integer credits;
    private  String name;
    private  String teacher;
    private  String faculty;
    private  String description;

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

    /**
     * To vo subject vo.
     *
     * @return the subject vo
     */
    public subjectVO toVO(){return new subjectVO(id,credits,name,teacher,faculty,description);}


}
