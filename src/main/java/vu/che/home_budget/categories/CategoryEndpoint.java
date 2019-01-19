package vu.che.home_budget.categories;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vu.che.utils.exceptions.ResourceNotFoundException;
import vu.che.utils.web.Response;

@RestController
@RequestMapping(value = "category")
@RequiredArgsConstructor
public class CategoryEndpoint {

    private final CategoryService categoryService;

    @GetMapping(value = "{id}")
    public Response<Category> getById(@PathVariable long id){
        return new Response<>(categoryService.getById(id).orElseThrow(ResourceNotFoundException::new));
    }
}
