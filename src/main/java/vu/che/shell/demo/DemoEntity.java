package vu.che.shell.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "demo")
@Getter
@Setter
public class DemoEntity {

    @Id
    private Long id;
    private int val1;
    private String val2;
}
