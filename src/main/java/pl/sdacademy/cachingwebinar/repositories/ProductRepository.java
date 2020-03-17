package pl.sdacademy.cachingwebinar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.sdacademy.cachingwebinar.domain.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
