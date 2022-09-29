package online.servise;

import online.dto.FirstCategoryDto;
import online.entity.FirstCategory;

import java.util.List;

public interface FirstCategoryService {

    List<FirstCategoryDto> getAllFourCategory();

    FirstCategory save(FirstCategory category);

    FirstCategory updateCategory(FirstCategory products, Long id);

    String delete(Long id);

    FirstCategory findById(Long id);


}
