package online.repository;

import online.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstCategoryRepository extends JpaRepository<FirstCategory, Long>{
}
