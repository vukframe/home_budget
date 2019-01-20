package vu.che.home_budget.currency;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import vu.che.home_budget.flow.Flow;
import vu.che.home_budget.flow.FlowEntity;
import vu.che.utils.mapstruct.Constants;

@Mapper(componentModel = Constants.SPRING_COMPONENT_MODEL)
public abstract class CurrencyTypeMapper {

    @Autowired
    private CurrencyTypeRepository currencyTypeRepository;

    public abstract Flow mapToModel(FlowEntity entity);

    public CurrencyTypeEntity mapCodeToEntity(String code){
        if(code == null){
            return null;
        }

        return currencyTypeRepository.findByCode(code);
    }

}
