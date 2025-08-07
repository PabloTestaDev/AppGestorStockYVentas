package com.gestion.stockyventasX.repository;

import com.gestion.stockyventasX.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVentaRepository extends JpaRepository<Venta,Long> {
}
