package vu.che.home_budget.expense;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vu.che.home_budget.flow.Flow;
import vu.che.home_budget.flow.FlowEntity;
import vu.che.home_budget.flow.FlowMapper;
import vu.che.home_budget.flow.FlowRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class ExpenseServiceImpl implements ExpenseService{
    // Repo's
    private final ExpenseRepository expenseRepository;
    private final FlowRepository flowRepository;
    // Mappers
    private final ExpenseMapper expenseMapper;
    private final FlowMapper flowMapper;
    // Validators
    private final ExpenseValidator expenseValidator;

    @Override
    public Optional<Expense> getById(Long id) {
        return expenseRepository.findById(id).map(expenseMapper::mapToModel);
    }

    @Override
    public Expense addExpense(Expense expense) {
        expenseValidator.validateCreate(expense);

        //Create and persist flow
        Flow flow = expense.getFlow();
        FlowEntity flowEntity = flowMapper.mapToEntity(flow);
        flowRepository.save(flowEntity);

        // TODO: validate and persist tags related logic
        ExpenseEntity response = expenseMapper.mapToEntity(flowEntity);
        expenseRepository.save(response);

        return expenseMapper.mapToModel(response);
    }

}
