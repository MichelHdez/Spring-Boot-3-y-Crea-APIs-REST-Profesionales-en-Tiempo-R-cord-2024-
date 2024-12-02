package com.introduccion.repository;

public class ProductRepositoryA implements ProductRepository {

    public ProductRepositoryA() {
        System.out.println("Creando instancia de " + this.getClass().getSimpleName());
    }

    public void save(String name){
        System.out.println(" == SAVE " + this.getClass().getSimpleName() + " == ");
        System.out.println("Guardando el producto exitosamente " + name);
    }

    public void remove(String name){
        System.out.println(" == REMOVE " + this.getClass().getSimpleName() + " == ");
        System.out.println("Eliminando el producto exitosamente " + name);
    }
}
