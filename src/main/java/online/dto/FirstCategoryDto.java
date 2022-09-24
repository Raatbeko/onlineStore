package online.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import online.entity.*;

import java.util.List;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FirstCategoryDto {

    Long id;

    String nameCategory;

    String image;

    List<SecondCategory> nextCategory;

}
