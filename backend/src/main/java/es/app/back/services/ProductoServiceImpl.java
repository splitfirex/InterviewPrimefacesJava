package es.app.back.services;

import es.app.back.dao.ProductoDao;
import es.app.back.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    public List<Producto> findAllProducto() {
        return productoDao.list();
    }

    @Override
    public Producto findByIdProducto(Long idProducto) {
        return productoDao.find(idProducto);
    }

    @Override
    @Transactional
    public void saveOrUpdateProducto(Producto productoSeleccionado) {
        productoDao.merge(productoSeleccionado);
    }
}
