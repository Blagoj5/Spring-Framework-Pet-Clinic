package baze.springframework.sfpetclinic.bootstrap;

import baze.springframework.sfpetclinic.model.Owner;
import baze.springframework.sfpetclinic.model.Vet;
import baze.springframework.sfpetclinic.services.OwnerService;
import baze.springframework.sfpetclinic.services.VetService;
import baze.springframework.sfpetclinic.services.map.OwnerServiceMap;
import baze.springframework.sfpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    public OwnerService ownerService;
    public VetService vetService;


    public DataLoader() {

        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();

    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Giaoganne");

        ownerService.save(owner2);

        System.out.println("Owners loaded!");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Vets loaded!");


    }
}
