package hu.meiit.fistapp.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class StudentAccount {

    @Id
    @GeneratedValue
    private Long id;
    private String NeptuneCode;
    private Long Password;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNeptuneCode() {
        return NeptuneCode;
    }

    public void setNeptuneCode(String neptuneCode) {
        NeptuneCode = neptuneCode;
    }

    public Long getPassword() {
        return Password;
    }

    public void setPassword(Long password) {
        Password = password;
    }
}
