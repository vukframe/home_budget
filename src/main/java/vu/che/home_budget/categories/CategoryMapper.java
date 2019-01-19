package vu.che.home_budget.categories;

import org.mapstruct.Mapper;
import vu.che.utils.mapstruct.Constants;

@Mapper(componentModel = Constants.SPRING_COMPONENT_MODEL)
public abstract class CategoryMapper {

    public abstract Category mapToModel(CategoryEntity entity);

}
