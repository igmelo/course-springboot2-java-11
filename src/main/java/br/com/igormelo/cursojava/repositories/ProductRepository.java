package br.com.igormelo.cursojava.repositories;

import br.com.igormelo.cursojava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
