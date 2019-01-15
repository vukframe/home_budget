package vu.che.home_budget.persons;

import java.util.Optional;

public interface PersonService {
    Optional<Person> getById(Long id);
}
