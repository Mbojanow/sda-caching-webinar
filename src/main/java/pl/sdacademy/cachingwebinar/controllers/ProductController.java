package pl.sdacademy.cachingwebinar.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pl.sdacademy.cachingwebinar.domain.Product;
import pl.sdacademy.cachingwebinar.model.Products;
import pl.sdacademy.cachingwebinar.services.ProductCrudService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  private final ProductCrudService productCrudService;

  public ProductController(final ProductCrudService productCrudService) {
    this.productCrudService = productCrudService;
  }

  @GetMapping
  public Products getAll() {
    return new Products(productCrudService.getAllProducts());
  }

  @GetMapping("/{id}")
  public Product getProduct(@PathVariable final Long id) {
    return productCrudService.getById(id);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Product createProduct(@RequestBody final Product product) {
    return productCrudService.create(product);
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void updateProduct(@PathVariable final Long id, @RequestBody final Product product) {
    productCrudService.update(product, id);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteProducts(@PathVariable final Long id) {
    productCrudService.deleteProduct(id);
  }
}
