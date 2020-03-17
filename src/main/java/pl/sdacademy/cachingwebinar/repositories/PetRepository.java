package pl.sdacademy.cachingwebinar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.sdacademy.cachingwebinar.domain.Pet;

public interface PetRepository extends JpaRepository<Pet, String> {
}
