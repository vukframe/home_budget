package vu.che.home_budget.income;

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
@Table(name="income")
public class IncomeEntity{

    @Id
    private Long id;

    @OneToOne
    private FlowEntity flow;

}
