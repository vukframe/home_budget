package vu.che.shell.practice.persons;

import java.util.Optional;

public interface PersonService {
    Optional<Person> getById(Long id);
}
