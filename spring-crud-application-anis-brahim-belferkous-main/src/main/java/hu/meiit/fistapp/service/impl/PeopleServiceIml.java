package hu.meiit.fistapp.service.impl;

import hu.meiit.fistapp.repository.People;
import hu.meiit.fistapp.repository.PeopleRepository;
import hu.meiit.fistapp.service.PeopleVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RequiredArgsConstructor
@Service
public class PeopleServiceIml implements hu.meiit.fistapp.service.PeopleService {
    private  final PeopleRepository  peopleRepository;

    @Override
    public Long insertPeople(PeopleVO people) {
        People newPeople=  peopleRepository.save(people.toEntity());
        return newPeople.getId();
    }

    public PeopleVO getPeople(Long id) {
        return peopleRepository.findById(id)
                .map(people -> new PeopleVO(people.getId(),people.getName(),people.getAge()))
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND,"no such person exist"));
    }

}
