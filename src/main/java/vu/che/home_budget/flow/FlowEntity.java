package vu.che.home_budget.flow;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vu.che.home_budget.categories.CategoryEntity;
import vu.che.home_budget.currency.CurrencyTypeEntity;
import vu.che.home_budget.tags.TagEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name="flow")
public class FlowEntity {

    @Id
    private Long id;

    @Column(name="entry_date")
    private LocalDateTime entryDate;

    private String name;

    private String description;

    private double value;

    @JoinColumn(name = "currency_type")
    @ManyToOne
    private CurrencyTypeEntity currencyType;

    @OneToMany
    private List<TagEntity> tags;

    @ManyToOne
    private CategoryEntity category;

    private Boolean processed;

    @Column(name = "automatic_processing")
    private Boolean automaticProcessing;
}
