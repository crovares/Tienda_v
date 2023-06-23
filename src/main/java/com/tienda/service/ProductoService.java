package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;


public interface ProductoService {
    
    //Se declara un metodo para obtener el listado y ArrayList de Objetos Producto
    //Los objetos vienen de la tabla producto
    //Son todos los registros o solo los activos
    public List<Producto> getProductos(boolean activos);
    
    //Abajo se colocaran los metodos para un CRUD de productoas... pero en semana 6
    
    // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
    
}
