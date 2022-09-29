package online.servise;

import online.entity.SecondCategory;

import java.util.List;

public interface SecondCategoryService {

    SecondCategory save(SecondCategory category, Long id);

    List<SecondCategory> getAllNextCategory(Long id);

    SecondCategory updateNextCategory(SecondCategory nextCategory, Long id);

    String deleteById(Long id);

    SecondCategory findById(Long id);
}
