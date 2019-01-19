package vu.che.home_budget.expense;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vu.che.home_budget.flow.FlowEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name="expense")
public class ExpenseEntity{

    @Id
    private Long id;

    @OneToOne
    private FlowEntity flow;

}
