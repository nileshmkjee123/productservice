package dev.naman.productservice.InheritanceByMe.MappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name="msc_mentor")
public class Mentor extends User{
    private String mail;
    private int noOfMentees;
}
