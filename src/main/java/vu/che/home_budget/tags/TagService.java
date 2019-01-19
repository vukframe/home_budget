package vu.che.home_budget.tags;

import java.util.Optional;

public interface TagService {
    Optional<Tag> getById(Long id);
}
