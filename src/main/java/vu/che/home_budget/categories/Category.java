package vu.che.home_budget.categories;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Category implements Serializable {

    private static final long serialVersionUID = -7074976144804086654L;

    private CategoryEntity parent;
    private CategoryType categoryType;
    private Boolean isLeaf;
    private String code;
    private String value;
    private String description;
    private Boolean active;

}
