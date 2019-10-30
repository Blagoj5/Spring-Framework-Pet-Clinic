package baze.springframework.sfpetclinic.services.map;

import baze.springframework.sfpetclinic.model.Speciality;
import baze.springframework.sfpetclinic.model.Vet;
import baze.springframework.sfpetclinic.services.SpecialityService;
import baze.springframework.sfpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities() != null && object.getSpecialities().size() > 0) { // TWO WAYS TO MAKE THE CONDITIONAL, ALSO CAN BE WITH .isEmpty()
            object.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null){
                    Speciality saveSpeciality = specialityService.save(speciality);
                    speciality.setId(saveSpeciality.getId()); // IN CASE THE ID DOESNT ADD UP BECAUSE ITS ITERATOR (IT should work without it)
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
