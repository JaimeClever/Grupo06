package com.movilshop.sistema.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movilshop.sistema.venta.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
