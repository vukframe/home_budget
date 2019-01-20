package vu.che.home_budget.expense;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vu.che.home_budget.flow.FlowEntity;
import vu.che.utils.mapstruct.Constants;

@Mapper(componentModel = Constants.SPRING_COMPONENT_MODEL)
public abstract class ExpenseMapper {

    @Mapping(target = "flow", source = "flow")
    public abstract ExpenseEntity mapToEntity(FlowEntity flow);

    public abstract Expense mapToModel(ExpenseEntity expenseEntity);

}
