package vu.che.home_budget.categories;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "category")
public class CategoryEntity {

    @Id
    private Long id;

    private CategoryEntity parent;

    @Column(name="category_type")
    private CategoryType categoryType;

    @Column(name="is_leaf")
    private Boolean isLeaf;

    private String code;

    private String value;

    private String description;

    private Boolean active;
}
