package hu.me.iit.distributedsystems.openfeignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "neptunApp")
public interface subjectClient {


    @GetMapping(path="/subjects", produces= MediaType.APPLICATION_JSON_VALUE)
    List<subjectDto> findAllSubjects();

    @PostMapping("/subjects")
    subjectDto insertSubject(@RequestBody subjectDto subject);

    @GetMapping("/subjects/{id}")
    subjectDto selectSubject(@PathVariable Long id);

    @PutMapping("/subjects/{id}")
    void UpdateSubject(@PathVariable Long id, @RequestBody subjectDto subject);

    @DeleteMapping("/subjects/{id}")
    void DeleteSubject(@PathVariable Long id);

    //entity is now 'Subjects', i replace the existing 'find-all-big-book' endpoint with a new endpoint findAllSubjects

    @GetMapping("/subjects/findByCreditsGreaterThan/{credits}")
    List<subjectDto> findSubjectsWithCreditsGreaterThan(@PathVariable int credits);


}
