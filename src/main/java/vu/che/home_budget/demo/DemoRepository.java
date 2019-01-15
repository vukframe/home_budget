package vu.che.home_budget.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends CrudRepository<DemoEntity, Long> {
}
