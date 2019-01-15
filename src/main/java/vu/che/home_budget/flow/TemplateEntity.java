package vu.che.home_budget.flow;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vu.che.home_budget.categories.CategoryEntity;
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

    @Column(name="currency_type")
    private CurrencyTypeEntity currencyType;

    @Column(name="income_type")
    private FlowType flowType;

    @OneToMany
    List<TagEntity> tags;

    @ManyToOne
    CategoryEntity category;

    @Column(name = "automatic_processing")
    private Boolean automaticProcessing;


}
