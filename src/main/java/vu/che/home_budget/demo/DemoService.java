package vu.che.home_budget.demo;

import java.util.Optional;

public interface DemoService {
    Optional<Demo> getById(Long id);
}
