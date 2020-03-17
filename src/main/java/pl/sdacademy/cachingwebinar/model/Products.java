package pl.sdacademy.cachingwebinar.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sdacademy.cachingwebinar.domain.Product;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {
  private List<Product> products;
}
