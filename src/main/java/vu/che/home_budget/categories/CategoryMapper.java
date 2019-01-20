package vu.che.home_budget.categories;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import vu.che.utils.mapstruct.Constants;

@Mapper(componentModel = Constants.SPRING_COMPONENT_MODEL)
public abstract class CategoryMapper {

    @Autowired
    private CategoryRepository categoryRepository;

    public abstract Category mapToModel(CategoryEntity entity);

    public CategoryEntity mapCodeToEntity(String code){
        if(code == null){
            return null;
        }

        return categoryRepository.findByCode(code);
    }

}
