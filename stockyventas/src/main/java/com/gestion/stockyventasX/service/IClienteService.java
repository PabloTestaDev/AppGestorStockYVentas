package com.gestion.stockyventasX.service;

import com.gestion.stockyventasX.model.Cliente;

import java.util.List;

public interface IClienteService {

    public void crearCliente(Cliente client);

    public List<Cliente> traerClientes();

    public Cliente traerCli(Long id);

    public void editarCliente(Long id_original, Long id_nueva, String nuevoNombre,
                              String nuevoApellido, String nuevoDni);

    public void eliminarCliente(Long id);

}
