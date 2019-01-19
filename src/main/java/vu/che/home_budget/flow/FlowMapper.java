package vu.che.home_budget.flow;

import org.mapstruct.Mapper;
import vu.che.utils.mapstruct.Constants;

@Mapper(componentModel = Constants.SPRING_COMPONENT_MODEL)
public abstract class FlowMapper {

    public abstract Flow mapToModel(FlowEntity entity);

}
