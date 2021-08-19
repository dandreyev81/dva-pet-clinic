package com.dandreyev.dvapetclinic.services;

import com.dandreyev.dvapetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName (String lastName);

}
