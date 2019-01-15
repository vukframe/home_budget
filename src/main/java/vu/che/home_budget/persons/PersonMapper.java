package vu.che.home_budget.persons;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vu.che.utils.mapstruct.Constants;

@Mapper(componentModel = Constants.SPRING_COMPONENT_MODEL)
public abstract class PersonMapper {

    @Mapping(source = "firstName", target = "firstName")
    public abstract Person mapToModel(PersonEntity entity);
}
