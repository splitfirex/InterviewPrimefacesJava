package es.app.back.services;

import es.app.back.dao.ClienteDao;
import es.app.back.dao.ProductoDao;
import es.app.back.entities.Cliente;
import es.app.back.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    public List<Cliente> findAllCliente() {
        return clienteDao.list();
    }

    @Override
    public void saveOrUpdateCliente(Cliente cliente) {
        clienteDao.merge(cliente);
    }
}
