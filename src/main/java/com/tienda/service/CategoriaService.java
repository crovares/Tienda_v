package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //Se declara un metodo para obtener el listado y ArrayList de Objetos Categoria
    //Los objetos vienen de la tabla categoria
    //Son todos los registros o solo los activos
    public List<Categoria> getCategorias(boolean activos);
    
    //Abajo se colocaran los metodos para un CRUD de categoriaas... pero en semana 6
    
    // Se obtiene un Categoria, a partir del id de un categoria
    public Categoria getCategoria(Categoria categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Categoria categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);
    
}
