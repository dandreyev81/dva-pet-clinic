package com.dandreyev.dvapetclinic.repositories;

import com.dandreyev.dvapetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
