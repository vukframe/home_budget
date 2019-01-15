package vu.che.shell.demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Demo implements Serializable {

    private static final long serialVersionUID = 4651034019578971026L;
    private int val1;
    private String val2;
}
