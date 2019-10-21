package baze.springframework.sfpetclinic.bootstrap;

import baze.springframework.sfpetclinic.model.Owner;
import baze.springframework.sfpetclinic.model.PetType;
import baze.springframework.sfpetclinic.model.Vet;
import baze.springframework.sfpetclinic.services.OwnerService;
import baze.springframework.sfpetclinic.services.PetTypeService;
import baze.springframework.sfpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType petTypeSavedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType petTypeSavedCat = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Giaoganne");

        ownerService.save(owner2);

        System.out.println("Owners loaded!");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Vets loaded!");


    }
}
