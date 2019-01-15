package vu.che.home_budget.flow;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "currency_type")
public class CurrencyTypeEntity {

    @Id
    private long id;

    private String name;

    private String code;
}
