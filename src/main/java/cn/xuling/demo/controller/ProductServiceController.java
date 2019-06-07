package cn.xuling.demo.controller;


import cn.xuling.demo.entity.Product;
import cn.xuling.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductServiceController {

    private final IProductService iProductService;

    @Autowired
    public ProductServiceController(IProductService iProductService) {
        this.iProductService = iProductService;
    }


    @RequestMapping(value = "/products")
    public ResponseEntity<Object> getProducts() {
        return new ResponseEntity<>(iProductService.getProducts(), HttpStatus.OK);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        iProductService.createProduct(product);
        return new ResponseEntity<>("Created product successfully!", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable String id, @RequestBody Product product) {
        iProductService.updateProduct(id, product);
        return new ResponseEntity<>("Update product successfully!", HttpStatus.OK);
    }

}