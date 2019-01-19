package vu.che.home_budget.expense;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vu.che.home_budget.categories.CategoryEntity;
import vu.che.home_budget.flow.CurrencyTypeEntity;
import vu.che.home_budget.flow.Flow;
import vu.che.home_budget.flow.FlowType;
import vu.che.home_budget.tags.TagEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name="expense")
public class ExpenseEntity{

    @Id
    private Long id;

}
