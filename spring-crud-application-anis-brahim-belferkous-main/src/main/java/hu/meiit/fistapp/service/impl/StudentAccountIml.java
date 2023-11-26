package hu.meiit.fistapp.service.impl;

import hu.meiit.fistapp.repository.StudentAccount;
import hu.meiit.fistapp.repository.StudentAccountRepository;
import hu.meiit.fistapp.service.StudentAccountService;
import hu.meiit.fistapp.service.StudentAccountVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentAccountIml implements StudentAccountService {
    private final StudentAccountRepository studentAccountRepository;

    @Override
    public Long insertStudentAccount(StudentAccountVO studentAccountvo ){
        StudentAccount studentAccount = studentAccountRepository.save(studentAccountvo.toEntity());
        return studentAccount.getId();
    }
}
