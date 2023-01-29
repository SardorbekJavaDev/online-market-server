package online.market.uz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "income_product")
public class IncomeProductEntity extends BaseEntity{
}
