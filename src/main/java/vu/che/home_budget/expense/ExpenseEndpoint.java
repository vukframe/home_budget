package vu.che.home_budget.expense;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vu.che.utils.exceptions.ResourceNotFoundException;
import vu.che.utils.exceptions.ValidationException;
import vu.che.utils.web.Response;

@RestController
@RequestMapping(value = "expense")
@RequiredArgsConstructor
public class ExpenseEndpoint {

    private final ExpenseService expenseService;

    @GetMapping("/get/{id}")
    public Response<Expense> getById(@PathVariable long id){
        return new Response<>(expenseService.getById(id).orElseThrow(ResourceNotFoundException::new));
    }

    @PostMapping
    public Response<Expense> addExpense(@RequestBody Expense expense){
        return new Response<>(expenseService.addExpense(expense));
    }
}
