package baze.springframework.sfpetclinic.repositories;

import baze.springframework.sfpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
