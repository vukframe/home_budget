package vu.che.home_budget.flow;

import java.util.Optional;

public interface FlowService {
    Optional<Flow> getById(Long id);
}
