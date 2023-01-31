package online.market.uz.repository;

import online.market.uz.entity.BranchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<BranchEntity, String> {
}