package br.edu.infnet.crudproduct.repository;

import br.edu.infnet.crudproduct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { }
