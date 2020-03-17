package pl.sdacademy.cachingwebinar.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "products")
public class Product implements Serializable {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  private String category;

  private String referenceNumber;
}
