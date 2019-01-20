package vu.che.home_budget.currency;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyTypeRepository extends CrudRepository<CurrencyTypeEntity, Long> {

    CurrencyTypeEntity findByCode(String code);
}
