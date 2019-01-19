package vu.che.home_budget.flow;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowRepository extends CrudRepository<FlowEntity, Long> {
}
