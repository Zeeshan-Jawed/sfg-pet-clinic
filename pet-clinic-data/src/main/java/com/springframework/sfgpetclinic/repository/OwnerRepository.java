package com.springframework.sfgpetclinic.repository;

import com.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;


public interface OwnerRepository extends CrudRepository<Owner,Long> {
//    Owner findByLastName(String lastname);
}
