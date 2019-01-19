package vu.che.home_budget.tags;

import org.mapstruct.Mapper;
import vu.che.utils.mapstruct.Constants;

@Mapper(componentModel = Constants.SPRING_COMPONENT_MODEL)
public abstract class TagMapper {

    public abstract Tag mapToModel(TagEntity entity);
}
