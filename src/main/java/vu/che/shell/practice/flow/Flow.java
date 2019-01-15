package vu.che.shell.practice.flow;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString(callSuper = true)
public abstract class Flow {

    @Id
    private Long id;

    @Column(name="entry_date")
    private LocalDateTime entryDate;

    private String name;

    private String description;

    private double value;

    @Column(name="currency_type")
    private CurrencyTypeEntity currencyType;
}
