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
