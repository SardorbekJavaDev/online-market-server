package online.market.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<online.market.uz.entity.OrderEntity, String> {
}