package hu.meiit.fistapp.service;

import hu.meiit.fistapp.repository.subject;

public interface subjectService {

     Long insertSubject(subjectVO subject);

     subject selectSubject(Long ID);

     Long UpdateSubject(subjectVO subject, Long ID);
     Long DeleteSubject(Long ID);

     Iterable<subject> findAll();
}
