package baze.springframework.sfpetclinic.repositories;

import baze.springframework.sfpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
