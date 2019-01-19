package vu.che.home_budget.categories;

import java.util.Optional;

public interface CategoryService {
    Optional<Category> getById(Long id);
}
