package es.app.back.dao;

import es.app.back.entities.Cliente;
import org.springframework.stereotype.Repository;


@Repository
public class ClienteDao extends AbstractCrudDao<Cliente> {

    @Override
    Class<Cliente> getEntityClass() {
        return Cliente.class;
    }
}
