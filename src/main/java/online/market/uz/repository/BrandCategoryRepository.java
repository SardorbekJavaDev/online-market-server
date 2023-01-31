package online.market.uz.repository;

import online.market.uz.entity.BrandCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandCategoryRepository extends JpaRepository<BrandCategoryEntity, String> {
}