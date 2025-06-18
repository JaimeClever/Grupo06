package com.movilshop.sistema.venta.entity;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 private String nombre;
	    private String descripcion;
	    private double precio;
	    private int stock;
	    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
	    private List<DetalleVenta> detalles;
		public Producto() {
			super();
		}
		public Producto(Long id, String nombre, String descripcion, double precio, int stock,
				List<DetalleVenta> detalles) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.precio = precio;
			this.stock = stock;
			this.detalles = detalles;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public int getStock() {
			return stock;
		}
		public void setStock(int stock) {
			this.stock = stock;
		}
		public List<DetalleVenta> getDetalles() {
			return detalles;
		}
		public void setDetalles(List<DetalleVenta> detalles) {
			this.detalles = detalles;
		}
	    
	    
	    
}
