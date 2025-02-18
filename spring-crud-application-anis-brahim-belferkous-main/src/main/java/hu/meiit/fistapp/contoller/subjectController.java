package hu.meiit.fistapp.contoller;

import hu.meiit.fistapp.repository.subject;
import hu.meiit.fistapp.service.subjectService;
import hu.meiit.fistapp.service.subjectVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path="subject")
public class subjectController {

    public final subjectService subjectService;
    public subjectController(subjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping(path="")
    public List<subject> findAllSubjects() {
        log.info("All_subjects");
        return subjectService.findAll();
    }

    @PostMapping(path = "")
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
