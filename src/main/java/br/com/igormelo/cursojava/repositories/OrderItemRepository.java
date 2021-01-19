package br.com.igormelo.cursojava.repositories;

import br.com.igormelo.cursojava.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
