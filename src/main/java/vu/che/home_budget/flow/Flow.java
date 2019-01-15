package vu.che.home_budget.flow;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vu.che.home_budget.categories.CategoryEntity;
import vu.che.home_budget.tags.TagEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
public abstract class Flow {

    @Id
    private Long id;

    @Column(name="entry_date")
    private LocalDateTime entryDate;

    private String name;

    private String description;

    private double value;

    @Column(name="currency_type")
    private CurrencyTypeEntity currencyType;

    @Column(name="income_type")
    private FlowType flowType;

    @OneToMany
    List<TagEntity> tags;

    @ManyToOne
    CategoryEntity category;

    private Boolean processed;

    @Column(name = "automatic_processing")
    private Boolean automaticProcessing;
}
