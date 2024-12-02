package com.introduccion.repository;

public class ProductRepositoryB implements ProductRepository {

    public ProductRepositoryB() {
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
