package vu.che.home_budget.categories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Long> {

    CategoryEntity findByCode(String code);
}
