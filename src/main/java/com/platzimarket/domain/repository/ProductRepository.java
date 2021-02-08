package com.platzimarket.domain.repository;

import com.platzimarket.domain.Product;

import java.util.List;
import java.util.Optional;


public interface ProductRepository {

    //Con esto definimos las reglas que va a tener nuestro dominio al momento en el que
    //cualquier repositorio quiera utiliza o quiera acceder a productos dentro de una base de datos
    //esto nos va a garantizar a nosotros, no acoplar nuestra solucion a una base de datos especifica
    //si no que siempre estemos hablando en terminos del dominio, en este clase de product.
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
