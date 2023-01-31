package online.market.uz.repository;

import online.market.uz.entity.BillingInformationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingInformationRepository extends JpaRepository<BillingInformationEntity, String> {
}