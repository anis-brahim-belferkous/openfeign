package hu.meiit.fistapp.service.impl;

import hu.meiit.fistapp.repository.subject;
import hu.meiit.fistapp.repository.subjectRepository;
import hu.meiit.fistapp.service.subjectVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class subjectServiceIml implements hu.meiit.fistapp.service.subjectService {
    private  final subjectRepository SubjectRepo;

    @Override
    public Long insertSubject(subjectVO sub) {
        subject newSubject = SubjectRepo.save(sub.toEntity());
        return newSubject.getId();
    }
    @Override
    public subject selectSubject(Long ID) {
        return SubjectRepo.findById(ID).get();
    }
    @Override
    public Long UpdateSubject(subjectVO subject, Long ID) {
        subject new_subject = SubjectRepo.findById(ID).get();
        new_subject.setName(subject.getName());
        new_subject.setCredits(subject.getCredits());
        new_subject.setTeacher(subject.getTeacher());
        new_subject.setFaculty(subject.getFaculty());
        new_subject.setDescription(subject.getDescription());
        SubjectRepo.save(new_subject);
        return new_subject.getId();

    }

    @Override
    public Long DeleteSubject(Long ID) {
        SubjectRepo.deleteById(ID);
        return ID;
    }

}
