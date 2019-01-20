package vu.che.home_budget.tags;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vu.che.utils.exceptions.ResourceNotFoundException;
import vu.che.utils.exceptions.ValidationException;
import vu.che.utils.web.Response;

@RestController
@RequestMapping(value = "tag")
@RequiredArgsConstructor
public class TagEndpoint {

    private TagService tagService;

    @GetMapping(value = "{id}")
    public Response<Tag> getTagById(@PathVariable long id){
        return new Response<>(tagService.getById(id).orElseThrow(ResourceNotFoundException::new));
    }
}
