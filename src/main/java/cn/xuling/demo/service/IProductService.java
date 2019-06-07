package cn.xuling.demo.service;


import cn.xuling.demo.entity.Product;

import java.util.Collection;

public interface IProductService {

    Collection<Product> getProducts();
    void createProduct(Product product);
    void updateProduct(String id,Product product);

}
