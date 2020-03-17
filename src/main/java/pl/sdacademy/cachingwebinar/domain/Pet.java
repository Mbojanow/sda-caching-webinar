package pl.sdacademy.cachingwebinar.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "pets")
public class Pet implements Serializable {

  @Id
  private String name;

  private String type;
}
