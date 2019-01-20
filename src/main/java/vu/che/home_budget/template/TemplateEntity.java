package vu.che.home_budget.template;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vu.che.home_budget.categories.CategoryEntity;
import vu.che.home_budget.currency.CurrencyTypeEntity;
import vu.che.home_budget.flow.FlowType;
import vu.che.home_budget.tags.TagEntity;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "template")
public class TemplateEntity {

    @Id
    private Long id;

    private String name;

    private String description;

    @JoinColumn(name = "currency_type")
    @ManyToOne
    private CurrencyTypeEntity currencyType;

    @Column(name="income_type")
    private FlowType flowType;

    @OneToMany
    private List<TagEntity> tags;

    @ManyToOne
    private CategoryEntity category;

    @Column(name = "automatic_processing")
    private Boolean automaticProcessing;

}
