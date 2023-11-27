package hu.meiit.fistapp.repository;

import hu.meiit.fistapp.contoller.subjectDto;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface subjectRepository_without_crud {

    List<subjectDto> findAll();
    int findSubjectById(Long id);

    Long save(subjectDto subjectDto);

    subjectDto getById(Long id);

}
