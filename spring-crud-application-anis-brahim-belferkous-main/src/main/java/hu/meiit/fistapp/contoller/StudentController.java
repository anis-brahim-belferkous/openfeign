package hu.meiit.fistapp.contoller;

import hu.meiit.fistapp.service.StudentService;
import hu.meiit.fistapp.service.StudentVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;
    @PostMapping(path = "/Student")
    Long insertStudent(@RequestBody StudentDto studentdto){
        return  studentService.insertStudent(studentdto.toVO());
    }

}
