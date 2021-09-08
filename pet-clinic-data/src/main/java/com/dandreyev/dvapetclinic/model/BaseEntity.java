package com.dandreyev.dvapetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private long Id;

    public Long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }
}
