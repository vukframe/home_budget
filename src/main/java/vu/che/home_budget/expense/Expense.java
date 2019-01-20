package vu.che.home_budget.expense;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vu.che.home_budget.flow.Flow;
import vu.che.home_budget.flow.FlowEntity;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Expense implements Serializable {

    private static final long serialVersionUID = 7879651475208125728L;

    private Flow flow;

}
