package com.dandreyev.dvapetclinic.services;

import com.dandreyev.dvapetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(long id);

    Owner findByLastName (String lastName);

    Owner save (Owner owner);

    Set<Owner> findAll();
}
