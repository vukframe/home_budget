package vu.che.home_budget.tags;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Tag implements Serializable {

    private static final long serialVersionUID = 9043744699031288873L;

    private String code;
    private String value;
    private String description;
    private Boolean active;
}
