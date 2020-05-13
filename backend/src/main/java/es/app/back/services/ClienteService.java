package es.app.back.services;

import es.app.back.dao.ClienteDao;
import es.app.back.dao.ProductoDao;
import es.app.back.entities.Cliente;
import es.app.back.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ClienteService {

    public List<Cliente> findAllCliente();

    public void saveOrUpdateCliente(Cliente cliente);

}
