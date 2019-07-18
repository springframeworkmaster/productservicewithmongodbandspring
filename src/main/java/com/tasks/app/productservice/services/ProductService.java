package com.tasks.app.productservice.services;

import java.util.List;

import com.tasks.app.productservice.commands.ProductForm;
import com.tasks.app.productservice.domain.Product;

public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
