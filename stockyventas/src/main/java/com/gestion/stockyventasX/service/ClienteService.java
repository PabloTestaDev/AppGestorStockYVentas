package com.gestion.stockyventasX.service;

import com.gestion.stockyventasX.model.Cliente;
import com.gestion.stockyventasX.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService{
    @Autowired
    private IClienteRepository clientRepository;

    @Override
    public void crearCliente(Cliente client) {
        clientRepository.save(client);
    }

    @Override
    public List<Cliente> traerClientes() {
        List<Cliente> listaClientes = clientRepository.findAll();
        return listaClientes;
    }

    @Override
    public Cliente traerCli(Long id) {
        Cliente clien = clientRepository.findById(id).orElse(null);
        return clien;
    }

    @Override
    public void editarCliente(Long id_original, Long id_nueva, String nuevoNombre, String nuevoApellido, String nuevoDni) {
        Cliente client = this.traerCli(id_original);
        client.setId_cliente(id_nueva);
        client.setNombre(nuevoNombre);
        client.setApellido(nuevoApellido);
        client.setDni(nuevoDni);
        this.crearCliente(client);
    }

    @Override
    public void eliminarCliente(Long id) {
        clientRepository.deleteById(id);
    }
}
