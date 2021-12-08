package com.dandreyev.dvapetclinic.services;

import com.dandreyev.dvapetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName (String lastName);

    List<Owner> findAllByLastNameLike (String lastName);

}
