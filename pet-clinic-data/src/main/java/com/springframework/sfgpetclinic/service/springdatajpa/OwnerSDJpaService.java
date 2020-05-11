package com.springframework.sfgpetclinic.service.springdatajpa;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.repository.OwnerRepository;
import com.springframework.sfgpetclinic.repository.PetRepository;
import com.springframework.sfgpetclinic.repository.PetTypeRepository;
import com.springframework.sfgpetclinic.service.OwnerService;

import java.util.HashSet;
import java.util.Set;


public class OwnerSDJpaService implements OwnerService {
    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastname) {
        return null;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners =new HashSet<>();
         ownerRepository.findAll().forEach(owners::add);
         return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
         ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
