package es.app.front.controller;


import es.app.back.entities.Producto;
import es.app.back.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Named;
import java.util.List;

@Named
@Component
public class Etapa1Controller {

    @Autowired
    ProductoService productoService;
    List<Producto> productoList;
    Producto productoSeleccionado = new Producto();


    public void init(){
        productoList = productoService.findAllProducto();
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public Producto getProductoSeleccionado() {
        return productoSeleccionado;
    }

    public void setProductoSeleccionado(Producto productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }

    public void guardarProducto(){
        productoService.saveOrUpdateProducto(productoSeleccionado);
    }

    public void nuevoProducto(){
        productoSeleccionado = new Producto();
    }
}
