package com.gestion.stockyventasX.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@Entity
public class Venta { //1 venta a n lista prod
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo_venta;
    private LocalDate fecha_venta;
    private double Local;
    private List<Producto> listaProductos; //1 venta a 1 productos
    private Cliente unCliente; //1 cliente a 1 prod

    public Venta() {
    }

    public Venta(Long codigo_venta, LocalDate fecha_venta, double local, List<Producto> listaProductos, Cliente unCliente) {
        this.codigo_venta = codigo_venta;
        this.fecha_venta = fecha_venta;
        Local = local;
        this.listaProductos = listaProductos;
        this.unCliente = unCliente;
    }
}
