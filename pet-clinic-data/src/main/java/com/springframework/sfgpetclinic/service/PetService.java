package com.springframework.sfgpetclinic.service;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Owner save(Pet pet);
    Set<Pet> findAll();
}
