package online.servise;

import online.dto.OrderDto;
import online.entity.Products;
import org.springframework.http.ResponseEntity;

import java.util.HashSet;
import java.util.List;

public interface ProductService {

    Products saveProduct(Products products, Long id);

    Products updateProduct(Products products, Long id);

    String deleteProductById(Long id);

    List<Products> getAllProducts(Long nextId);

    Products getById(Long id);

    HashSet<Products> findProductByModel(String model);

    ResponseEntity<?> addBookToBasket(OrderDto order);

    Long getUsersBasketId(String username);
}
