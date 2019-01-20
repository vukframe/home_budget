package vu.che.home_budget.expense;

import java.util.Optional;

public interface ExpenseService {
    Optional<Expense> getById(Long id);
    Expense addExpense(Expense expense);
}
