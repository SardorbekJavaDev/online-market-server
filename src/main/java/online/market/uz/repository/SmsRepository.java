package online.market.uz.repository;

import online.market.uz.entity.SmsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmsRepository extends JpaRepository<SmsEntity, String> {
}