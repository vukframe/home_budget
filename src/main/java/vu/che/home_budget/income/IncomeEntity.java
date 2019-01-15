package vu.che.home_budget.income;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vu.che.home_budget.flow.Flow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name="income")
public class IncomeEntity extends Flow {

}
