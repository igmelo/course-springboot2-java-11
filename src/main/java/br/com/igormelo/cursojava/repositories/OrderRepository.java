package br.com.igormelo.cursojava.repositories;

import br.com.igormelo.cursojava.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
