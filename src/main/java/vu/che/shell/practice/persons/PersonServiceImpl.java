package vu.che.shell.practice.persons;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class PersonServiceImpl implements PersonService {

    private final PersonRepository demoRepository;
    private final PersonMapper demoMapper;

    @Override
    public Optional<Person> getById(Long id){
        return demoRepository.findById(id).map(demoMapper::mapToModel);
    }

}
