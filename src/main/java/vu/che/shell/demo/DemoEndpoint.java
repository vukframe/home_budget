package vu.che.shell.demo;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vu.che.utils.exceptions.ResourceNotFoundException;
import vu.che.utils.web.Response;

@RestController
@RequestMapping(value = "demo")
@RequiredArgsConstructor
public class DemoEndpoint {

    private final DemoService demoService;

    @GetMapping(value = "{id}")
    public Response<Demo> getDemoById(@PathVariable Long id) {
        return new Response<>(demoService.getById(id).orElseThrow(ResourceNotFoundException::new));
    }
}
