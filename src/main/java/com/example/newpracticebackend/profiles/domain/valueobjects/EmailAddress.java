package com.example.newpracticebackend.profiles.domain.valueobjects;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Email;

@Embeddable
public record EmailAddress(@Email String address){
    public EmailAddress()
    {
        this(null);
    }
}
