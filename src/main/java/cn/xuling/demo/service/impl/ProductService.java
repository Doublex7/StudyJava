package cn.xuling.demo.service.impl;

import cn.xuling.demo.entity.Product;
import cn.xuling.demo.exception.ProductNotFoundException;
import cn.xuling.demo.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Service
public class ProductService implements IProductService {

    private static Map<String, Product> productMap = new HashMap<>();
    static {
        Product honey = new Product();
        honey.setId("1");
        honey.setName("QL");
        productMap.put(honey.getId(), honey);

        Product almond = new Product();
        almond.setId("2");
        almond.setName("Almond");
        productMap.put(almond.getId(), almond);
    }

    @Override
    public void createProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Collection<Product> getProducts() {
        return productMap.values();
    }

    @Override
    public void updateProduct(String id, Product product) {
        if (!productMap.containsKey(id)) throw new ProductNotFoundException();
        productMap.remove(id);
        productMap.put(product.getId(), product);
    }
}