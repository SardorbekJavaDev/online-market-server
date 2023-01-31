package online.market.uz.repository;

import online.market.uz.entity.CardTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardTypeRepository extends JpaRepository<CardTypeEntity, String> {
}