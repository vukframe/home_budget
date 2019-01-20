package vu.che.home_budget.categories;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "category")
public class CategoryEntity {

    @Id
    private Long id;

    @ManyToOne
    private CategoryEntity parent;

    @Column(name="category_type")
    private CategoryTypeEnum categoryType;

    @Column(name="is_leaf")
    private Boolean isLeaf;

    private String code;

    private String name;

    private String description;

    private Boolean active;
}
