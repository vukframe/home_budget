package vu.che.home_budget.persons;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Person implements Serializable {

    private static final long serialVersionUID = 4651034019578971026L;
    private String firstName;
    private String lastName;
    private int age;

}
