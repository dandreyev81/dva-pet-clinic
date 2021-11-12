package com.dandreyev.dvapetclinic.services.map;

import com.dandreyev.dvapetclinic.model.Specialty;
import com.dandreyev.dvapetclinic.model.Vet;
import com.dandreyev.dvapetclinic.services.SpecialtyService;
import com.dandreyev.dvapetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }


    @Override
    public Vet findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialties().size() > 0){
            object.getSpecialties().forEach(specialty-> {
                if(specialty.getId() == null) {
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}