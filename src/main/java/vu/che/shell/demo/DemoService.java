package vu.che.shell.demo;

import java.util.Optional;

public interface DemoService {
    Optional<Demo> getById(Long id);
}
