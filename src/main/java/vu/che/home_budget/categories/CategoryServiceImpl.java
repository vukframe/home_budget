package vu.che.home_budget.categories;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public Optional<Category> getById(Long id) {
        return categoryRepository.findById(id).map(categoryMapper::mapToModel);
    }
}
