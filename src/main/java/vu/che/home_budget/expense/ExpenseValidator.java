package vu.che.home_budget.expense;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vu.che.home_budget.flow.FlowValidator;
import vu.che.utils.exceptions.ValidationException;
import vu.che.utils.web.Message;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ExpenseValidator {

    private final FlowValidator flowValidator;

    public void validateCreate(Expense expense) {

        // Validate all flow related fields
        List<Message> errorMessages = new ArrayList<>(flowValidator.validateCommon(expense.getFlow()));

        if (!errorMessages.isEmpty()) {
            throw new ValidationException(errorMessages);
        }
    }


}
