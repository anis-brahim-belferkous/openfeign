package hu.meiit.fistapp.contoller;

import hu.meiit.fistapp.repository.subject;
import hu.meiit.fistapp.service.subjectService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequiredArgsConstructor
public class subjectController {

    public final subjectService subjectService;

    @GetMapping(path="", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<subjectDto> findAllSubjects() {
        log.info("All subjects");
        return subjectService.findAll();
    }

    @PostMapping(path = "/subject")
    public Long insertSubject(@RequestBody subjectDto subjectDto){
        return subjectService.insertSubject(subjectDto.toVO());
    }

    @GetMapping(path = "/subject/{id}")
    public subject selectSubject(@PathVariable("id") Long ID){
        return subjectService.selectSubject(ID);
    }
    @PutMapping(path = "/subject/{id}")
    public Long updateSubject(@RequestBody subjectDto subjectDto,@PathVariable("id") Long ID){
        return subjectService.UpdateSubject(subjectDto.toVO(),ID);
    }

    @DeleteMapping(path = "/subject/{id}")
    public Long deleteSubject(@PathVariable("id") Long ID){
        return subjectService.DeleteSubject(ID);
    }







}
