package com.gestion.stockyventasX.controller;

import com.gestion.stockyventasX.model.Cliente;
import com.gestion.stockyventasX.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private IClienteService clientServ;

    @PostMapping("/clientes/crear")
    public String crearCliente (@RequestBody Cliente client){
        clientServ.crearCliente(client);
        return "El cliente fue creado exitosamente";
    }

    @GetMapping("/clientes")
    public List<Cliente> traerClientes(){
        return clientServ.traerClientes();
    }

    @GetMapping("/clientes/{id_cliente}")
    public Cliente traerCli (@PathVariable Long id_cliente) {
       Cliente cli = clientServ.traerCli(id_cliente);
        return cli;
    }

    @PutMapping("/clientes/editar/{id_cliente}")
    public Cliente editCliente (@PathVariable Long id_cliente, @RequestParam(required = false, name = "id_cliente") Long nueva_id,
                                @RequestParam(required = false, name = "nombre") String nuevoNombre,
                                @RequestParam(required = false, name = "apellido") String nuevoApellido,
                                @RequestParam(required = false, name = "dni")String nuevoDni) {
        clientServ.editarCliente(id_cliente,nueva_id,nuevoNombre,nuevoApellido,nuevoDni);
        Cliente cli = clientServ.traerCli(id_cliente);
        return cli;
    }

    @DeleteMapping("/clientes/eliminar/{id_cliente}")
    public String eliminarCliente (@PathVariable Long id_cliente){
        clientServ.eliminarCliente(id_cliente);
        return "El cliente fue eliminado correctamente";
    }

}
