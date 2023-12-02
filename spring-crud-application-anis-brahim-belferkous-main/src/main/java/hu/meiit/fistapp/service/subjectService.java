package hu.meiit.fistapp.service;

import hu.meiit.fistapp.contoller.subjectDto;
import hu.meiit.fistapp.repository.subject;

import java.util.List;

public interface subjectService {

     Long insertSubject(subjectVO subject);

     subject selectSubject(Long ID);

     Long UpdateSubject(subjectVO subject, Long ID);
     Long DeleteSubject(Long ID);

     List<subject> findAll();
}
