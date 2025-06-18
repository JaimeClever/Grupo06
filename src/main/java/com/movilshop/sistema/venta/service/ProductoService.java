package com.movilshop.sistema.venta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movilshop.sistema.venta.entity.Producto;
import com.movilshop.sistema.venta.repository.ProductoRepository;




@Service
public class ProductoService {
	 @Autowired
	    private ProductoRepository productoRepository;
	 public List<Producto> listarTodos() {
	        return productoRepository.findAll();
	    }

	    public Producto guardar(Producto producto) {
	        return productoRepository.save(producto);
	    }

	    public Producto actualizar(Long id, Producto producto) {
	        Producto existente = productoRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

	        existente.setNombre(producto.getNombre());
	        existente.setDescripcion(producto.getDescripcion());
	        existente.setPrecio(producto.getPrecio());
	        existente.setStock(producto.getStock());

	        return productoRepository.save(existente);
	    }

	    public void eliminar(Long id) {
	        productoRepository.deleteById(id);
	    }

	    public Producto buscarPorId(Long id) {
	        return productoRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
	    }
}
