package hu.meiit.fistapp.service.impl;

import hu.meiit.fistapp.repository.Student;
import hu.meiit.fistapp.repository.StudentRepository;
import hu.meiit.fistapp.service.StudentService;
import hu.meiit.fistapp.service.StudentVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StudentServiceIml implements hu.meiit.fistapp.service.StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Long insertStudent(StudentVO studentVO) {
        Student student = studentRepository.save(studentVO.toEntity());
        return student.getId();
    }

}
