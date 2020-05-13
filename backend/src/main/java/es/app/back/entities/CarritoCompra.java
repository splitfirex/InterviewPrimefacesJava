package es.app.back.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class CarritoCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Cliente cliente;

    @ManyToMany
    private List<Producto> listadoProductos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getListadoProductos() {
        return listadoProductos;
    }

    public void setListadoProductos(List<Producto> listadoProductos) {
        this.listadoProductos = listadoProductos;
    }
}
