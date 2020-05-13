package es.app.front.controller;


import es.app.back.entities.Cliente;
import es.app.back.entities.Producto;
import es.app.back.services.ClienteService;
import es.app.back.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Named;
import java.util.List;

@Named
@Component
public class Etapa2Controller {

    @Autowired
    ClienteService clienteService;
    List<Cliente> clienteList;
    Cliente clienteSeleccionado = new Cliente();


    public void init(){
        clienteList = clienteService.findAllCliente();
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public Cliente getClienteSeleccionado() {
        return clienteSeleccionado;
    }

    public void setClienteSeleccionado(Cliente clienteSeleccionado) {
        this.clienteSeleccionado = clienteSeleccionado;
    }

    public void nuevoCliente(){
        clienteSeleccionado = new Cliente();
    }

    public void guardarCliente(){
        clienteService.saveOrUpdateCliente(clienteSeleccionado);
        clienteList = clienteService.findAllCliente();
    }
}
