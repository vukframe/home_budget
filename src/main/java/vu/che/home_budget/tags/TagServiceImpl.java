package vu.che.home_budget.tags;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class TagServiceImpl implements TagService{

    private final TagRepository tagRepository;
    private final TagMapper tagMapper;

    @Override
    public Optional<Tag> getById(Long id) {
        return tagRepository.findById(id).map(tagMapper::mapToModel);
    }
}
