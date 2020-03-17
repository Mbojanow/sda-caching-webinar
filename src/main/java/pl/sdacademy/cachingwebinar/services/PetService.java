package pl.sdacademy.cachingwebinar.services;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import pl.sdacademy.cachingwebinar.domain.Pet;
import pl.sdacademy.cachingwebinar.repositories.PetRepository;

@Service
@Slf4j
@CacheConfig(cacheNames = "pets")
public class PetService {

  private final PetRepository petRepository;

  public PetService(final PetRepository petRepository) {
    this.petRepository = petRepository;
  }

  @CachePut(key = "#pet.name")
  public Pet createOrUpdate(final Pet pet) {
    log.info("createOrUpdate");
    return petRepository.save(pet);
  }

  @Cacheable
  public Pet getByName(final String name) {
    log.info("getByName");
    return petRepository.findById(name)
        .orElseThrow(() -> new RuntimeException("pet with name does not exist " + name));
  }
}
