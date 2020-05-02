package com.springframework.sfgpetclinic.service;

import com.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastname);

}
