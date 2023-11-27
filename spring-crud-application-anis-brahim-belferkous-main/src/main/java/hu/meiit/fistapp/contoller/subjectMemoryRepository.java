package hu.meiit.fistapp.contoller;

import hu.meiit.fistapp.repository.subjectRepository_without_crud;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class subjectMemoryRepository implements subjectRepository_without_crud {
    private final List<subjectDto> subject = new ArrayList<>();

    @Override
    public List<subjectDto> findAll() {
        return subject;
    }

    @Override
    public Long save(subjectDto subjectDto) {
        int found = findSubjectById(subjectDto.getId());

        if (found != -1) {
            subjectDto foundArticle = subject.get(found);
            foundArticle.setName(subjectDto.getName());
            foundArticle.setCredits(subjectDto.getCredits());
            foundArticle.setDescription(subjectDto.getDescription());
            foundArticle.setId(subjectDto.getId());

            foundArticle.setTeacher(subjectDto.getTeacher());
        } else {
            subject.add(subjectDto);
        }
        return null;
    }

    @Override
    public subjectDto getById(Long id) {
        int subjectByIdIndex = findSubjectById(id);

        return subjectByIdIndex == -1 ? null : subject.get(subjectByIdIndex);
    }

    public int findSubjectById(Long id) {
        int found = -1;
        for (int i = 0; i < subject.size(); i++) {
            if (subject.get(i).getId().equals(id)) {
                found = i;
                break;
            }
        }
        return found;
    }

}
