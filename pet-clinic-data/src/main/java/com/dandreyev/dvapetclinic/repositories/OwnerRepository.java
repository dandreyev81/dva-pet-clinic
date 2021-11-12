package com.dandreyev.dvapetclinic.repositories;

import com.dandreyev.dvapetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}

