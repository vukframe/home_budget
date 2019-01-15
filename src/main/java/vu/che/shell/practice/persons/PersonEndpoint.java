package vu.che.shell.practice.persons;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vu.che.utils.exceptions.ResourceNotFoundException;
import vu.che.utils.web.Response;

@RestController
@RequestMapping(value = "demo")
@RequiredArgsConstructor
public class PersonEndpoint {

    private final PersonService personService;

    @GetMapping(value = "person/{id}")
    public Response<Person> getPersonById(@PathVariable Long id) {
        return new Response<>(personService.getById(id).orElseThrow(ResourceNotFoundException::new));
    }
}
