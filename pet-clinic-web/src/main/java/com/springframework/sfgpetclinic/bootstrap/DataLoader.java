package com.springframework.sfgpetclinic.bootstrap;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.service.OwnerService;
import com.springframework.sfgpetclinic.service.VetService;
import com.springframework.sfgpetclinic.service.map.OwnerServiceMap;
import com.springframework.sfgpetclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService=new OwnerServiceMap();
        vetService=new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstname("Michael");
        owner1.setLastname("Weston");
        ownerService.save(owner1);
        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstname("Fiona");
        owner2.setLastname("Glenanne");
        ownerService.save(owner2);
        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstname("Sam");
        vet1.setLastname("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstname("Jessie");
        vet2.setLastname("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }

}