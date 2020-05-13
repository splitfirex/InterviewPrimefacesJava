package es.app.back.services;

import es.app.back.entities.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> findAllProducto();

    Producto findByIdProducto(Long idProducto);

    void saveOrUpdateProducto(Producto productoSeleccionado);
}
