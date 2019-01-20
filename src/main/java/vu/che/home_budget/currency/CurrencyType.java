package vu.che.home_budget.currency;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@ToString
public class CurrencyType implements Serializable {

    private static final long serialVersionUID = -6718849887718298749L;
    private long id;
    private String name;
    private String code;
}
