package com.dandreyev.dvapetclinic.repositories;

import com.dandreyev.dvapetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
