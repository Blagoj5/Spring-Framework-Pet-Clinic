package baze.springframework.sfpetclinic.services;

import baze.springframework.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

   Owner findByLastName(String lastName);

}
