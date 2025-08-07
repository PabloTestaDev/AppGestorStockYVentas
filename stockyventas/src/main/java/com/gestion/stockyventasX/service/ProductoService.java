package com.gestion.stockyventasX.service;

import com.gestion.stockyventasX.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    @Autowired
    private IProductoRepository prodRepository;
}
