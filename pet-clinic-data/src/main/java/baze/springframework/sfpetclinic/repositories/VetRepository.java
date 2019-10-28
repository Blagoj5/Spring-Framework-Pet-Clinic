package baze.springframework.sfpetclinic.repositories;

import baze.springframework.sfpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
