package com.dandreyev.dvapetclinic.repositories;

import com.dandreyev.dvapetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
