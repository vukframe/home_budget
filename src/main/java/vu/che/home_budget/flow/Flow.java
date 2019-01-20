package vu.che.home_budget.flow;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vu.che.home_budget.categories.CategoryEntity;
import vu.che.home_budget.currency.CurrencyTypeEntity;
import vu.che.home_budget.tags.TagEntity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
public class Flow implements Serializable {

    private static final long serialVersionUID = -3265136931033282217L;

    private LocalDateTime entryDate;
    private String name;
    private String description;
    private double value;
    private CurrencyTypeEntity currencyType;
    private List<TagEntity> tags;
    private CategoryEntity category;
    private Boolean processed;
    private Boolean automaticProcessing;

}
