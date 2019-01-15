package vu.che.home_budget.tags;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "tag")
public class TagEntity {

    @Id
    private Long id;

    private String code;

    private String value;

    private String description;

    private Boolean active;
}
