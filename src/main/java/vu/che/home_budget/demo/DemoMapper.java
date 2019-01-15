package vu.che.home_budget.demo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vu.che.utils.mapstruct.Constants;

@Mapper(componentModel = Constants.SPRING_COMPONENT_MODEL)
public abstract class DemoMapper {

    @Mapping(source = "val1", target = "val2")
    public abstract Demo mapToModel(DemoEntity entity);

    public String mapToString(int toMap){
        return "Hello World";
    }
}
