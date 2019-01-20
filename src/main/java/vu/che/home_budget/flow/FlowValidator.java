package vu.che.home_budget.flow;

import org.springframework.stereotype.Component;
import vu.che.home_budget.categories.CategoryTypeEnum;
import vu.che.utils.web.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class FlowValidator {

    public List<Message> validateCommon(Flow flow){
        List<Message> errorMessages = new ArrayList<>();

        if(flow == null){
            errorMessages.add(new Message("expense.create.flow.empty", "Flow is not provided!"));
            return errorMessages;
        }

        // TODO: Separate all category related validation into its own validator
        if(flow.getCategory() == null){
            errorMessages.add(new Message("expense.create.category.empty", "Category is not provided!"));
        }

        if (flow.getCategory() != null && flow.getCategory().getCode() == null){
            errorMessages.add(new Message("expense.create.category.code.empty", "Category code is not provided!"));
        }

        if (flow.getCategory() != null && Objects.equals(flow.getCategory().getCode(), CategoryTypeEnum.ORGANISATIONAL.name())){
            errorMessages.add(new Message("expense.create.category.code.notValid", "Can't add an expense to organisational category"));
        }

        return errorMessages;
    }
}
