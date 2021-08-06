package com.dandreyev.dvapetclinic.services;

import com.dandreyev.dvapetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(long id);

    Vet save (Vet vet);

    Set<Vet> findAll();
}
