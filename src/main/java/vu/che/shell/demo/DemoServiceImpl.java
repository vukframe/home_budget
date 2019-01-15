package vu.che.shell.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class DemoServiceImpl implements DemoService {

    private final DemoRepository demoRepository;
    private final DemoMapper demoMapper;

    @Override
    public Optional<Demo> getById(Long id){
        return demoRepository.findById(id).map(demoMapper::mapToModel);
    }

}
