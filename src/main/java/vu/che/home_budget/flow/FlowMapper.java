package vu.che.home_budget.flow;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vu.che.home_budget.categories.CategoryMapper;
import vu.che.home_budget.currency.CurrencyTypeMapper;
import vu.che.utils.mapstruct.Constants;

@Mapper(componentModel = Constants.SPRING_COMPONENT_MODEL, uses = {CurrencyTypeMapper.class, CategoryMapper.class})
public abstract class FlowMapper {

    public abstract Flow mapToModel(FlowEntity entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "entryDate", ignore = true)
    @Mapping(target = "currencyType", source = "currencyType.code")
    @Mapping(target = "category", source = "category.code")
    @Mapping(target = "tags", ignore = true)
    public abstract FlowEntity mapToEntity(Flow flow);

}
