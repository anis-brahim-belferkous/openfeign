package hu.meiit.fistapp.contoller;

import hu.meiit.fistapp.service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PeopleController {
    private final PeopleService peopleService;


    @PostMapping(path = "/people")
    public Long insertPeople(@RequestBody PeopleDto people){

       return peopleService.insertPeople(people.toVO());



    }

}
