package vu.che.shell.practice.income;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vu.che.shell.practice.flow.Flow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name="income")
public class IncomeEntity extends Flow {

    @Column(name="income_type")
    private IncomeType incomeType;
}
