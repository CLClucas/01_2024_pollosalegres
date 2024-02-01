package com.sinensia.pollosfelices.backend.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.pollosfelices.backend.business.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
