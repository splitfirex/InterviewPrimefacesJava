package es.app.back.dao;

import es.app.back.entities.Producto;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

public class ProductoDao extends AbstractCrudDao<Producto> {

    @Override
    protected Class<Producto> getEntityClass() {
        return Producto.class;
    }

}
