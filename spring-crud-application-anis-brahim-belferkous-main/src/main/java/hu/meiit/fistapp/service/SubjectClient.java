package hu.meiit.fistapp.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.Subject;
import java.util.List;

@FeignClient(name = "subject-service")
public interface SubjectClient {

    @PostMapping("/subjects")
    Subject insertSubject(@RequestBody Subject subject);

    @GetMapping("/subjects/{id}")
    Subject selectSubject(@PathVariable Long id);

    @PutMapping("/subjects/{id}")
    void UpdateSubject(@PathVariable Long id, @RequestBody Subject subject);

    @DeleteMapping("/subjects/{id}")
    void DeleteSubject(@PathVariable Long id);

    //entity is now 'Subjects', i replace the existing 'find-all-big-book' endpoint with a new endpoint findAllSubjects
    @GetMapping("/subjects")
    List<Subject> findAllSubjects();

}
